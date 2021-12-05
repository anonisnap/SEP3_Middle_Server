package com.group5.sep3.GrpcCommunication.Services;

import com.group5.sep3.BusinessLogic.LogicModels.ItemModel;
import com.group5.sep3.BusinessLogic.model.Item;
import io.grpc.stub.StreamObserver;
import protos.ItemGrpc.*;
import protos.ItemOuterClass.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ItemService extends ItemImplBase {
	ItemModel model;

	public ItemService(ItemModel model) {
		this.model = model;
	}

	@Override
	public void registerItem(gItem request, StreamObserver<gItem> responseObserver) {
		System.out.println("+ Receiving Item from Client");

		// METHOD CALLING
		// Extract Object from Request
		Item requestItem = getItemFromRequest(request);

		// Perform Model Call
		Item returnItem = null;
		try {
			returnItem = model.register(requestItem);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (returnItem == null) {
			returnItem = requestItem;
		}

		System.out.println("\t>> Return Item :\n" + returnItem);

		// == == == == == == == == == == == ==

		// METHOD RESPONSE SECTION | Here we do a bit of Magic to return the requested stuff
		// Create Response Object | Since the proto file calls for a gItem as a return value, we instantiate a gItem.Builder object to create a Response
		gItem.Builder response = gItem.newBuilder();

		// Set Values Of Response Object | This Simply copies the item's information into the response.Item
		parseAndMergeItem(response, returnItem);

		// Link the Response to the Observer | This tells the responseObserver, that when it is completed, it should send back the response (which is a gItem object)
		responseObserver.onNext(response.build());

		// Tell Observer the Method is finished, and let it return the Response
		responseObserver.onCompleted();

		System.out.println("- Receiving Item from Client");
	}

	@Override
	public void getItem(gItem request, StreamObserver<gItem> responseObserver) {
		System.out.println("+ Sending Item to Client");

		// Fetch the Item from Request
		Item requestItem = getItemFromRequest(request);

		// Fetch the Item from the Server
		Item returnItem = null;
		try {
			returnItem = model.get(requestItem);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Ensure Item was retrieved. If item is null, Echo back the Item requested. Optionally throw an Error
		if (returnItem == null) {
			returnItem = requestItem;
//			throw new NullPointerException();
		}
		System.out.println("\t>> Return Item :\n" + returnItem);

		// Create Response Object
		gItem.Builder response = gItem.newBuilder();

		// Set Values Of Response Object
		parseAndMergeItem(response, returnItem);

		// Link the Response to the Observer
		responseObserver.onNext(response.build());

		// Tell Observer the Method is finished, and let it return the Response
		responseObserver.onCompleted();

		System.out.println("- Sending Item to Client");
	}

	@Override
	public void getAllItem(gItem request, StreamObserver<gItemList> responseObserver) {
		System.out.println("+ Sending all Items from Client");

		List<gItem> returnItems = new ArrayList<>();

		Collection<Item> items;

		// Parse Model Items to gRPC Items
		try {
			items = model.getAll();
			for (Item item : items) {
				gItem.Builder builder = gItem.newBuilder();
				parseAndMergeItem(builder, item);
				returnItems.add(builder.build());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Create Response Object
		gItemList.Builder response = gItemList.newBuilder();

		// Add the gItems to the Response
		response.addAllItem(returnItems); // Add Items to Builder

		// Link the Response to the Observer
		responseObserver.onNext(response.build());

		// Tell Observer the Method is finished, and let it return the Response
		responseObserver.onCompleted();

		System.out.println("- Sending all Items from Client");
	}

	@Override
	public void updateItem(gItem request, StreamObserver<gItem> responseObserver) {
		System.out.println("+ Updating Item");

		// Fetch Item
		Item requestItem = getItemFromRequest(request);

		// Update Item on Server
		Item returnItem = null;
		try {
			returnItem = model.update(requestItem);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Ensure ReturnItem is not Null | Consider throwing an Error Instead
		if (returnItem == null) {
			returnItem = requestItem;
		}

		System.out.println("\t>> Return Item :\n" + returnItem);

		// Create Response Object
		gItem.Builder response = gItem.newBuilder();

		// Add the gItems to the Response
		parseAndMergeItem(response, returnItem);

		// Link the Response to the Observer
		responseObserver.onNext(response.build());

		// Tell Observer the Method is finished, and let it return the Response
		responseObserver.onCompleted();

		System.out.println("- Updating Item");
	}

	@Override
	public void removeItem(gItem request, StreamObserver<gItem> responseObserver) {
		System.out.println("+ Removing Item");

		// Fetch Item
		Item requestItem = getItemFromRequest(request);

		// Remove Item on Server
		Item returnItem = null;
		try {
			returnItem = model.remove(requestItem);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Ensure ReturnItem is not Null | Consider throwing an Error Instead
		if (returnItem == null) {
			returnItem = requestItem;
		}

		System.out.println("\t>> Return Item :\n" + returnItem);

		// Create Response Object
		gItem.Builder response = gItem.newBuilder();

		// Add the gItems to the Response
		parseAndMergeItem(response, returnItem);

		// Link the Response to the Observer
		responseObserver.onNext(response.build());

		// Tell Observer the Method is finished, and let it return the Response
		responseObserver.onCompleted();

		System.out.println("- Removing Item");
	}

	private Item getItemFromRequest(gItem req) {
		return new Item(req.getId(), req.getItemName(), req.getLength(), req.getWidth(), req.getHeight(), req.getWeight());
	}

	private gItem.Builder parseAndMergeItem(gItem.Builder builder, Item item) {
		return builder.setId(item.getId()).setItemName(item.getItemName()).setHeight(item.getHeight()).setLength(item.getLength()).setWidth(item.getWidth()).setWeight(item.getWeight());
	}
}
