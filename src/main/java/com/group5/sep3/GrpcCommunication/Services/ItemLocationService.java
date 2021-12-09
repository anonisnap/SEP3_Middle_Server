package com.group5.sep3.GrpcCommunication.Services;

import Protos.ProtoUtil.*;
import com.group5.sep3.BusinessLogic.LogicModels.ItemLocationModel;
import com.group5.sep3.BusinessLogic.model.Item;
import com.group5.sep3.BusinessLogic.model.ItemLocation;
import com.group5.sep3.BusinessLogic.model.Location;
import io.grpc.stub.StreamObserver;
import protos.ItemLocationServiceGrpc;
import protos.ItemLocationServiceOuterClass.*;
import protos.ItemServiceOuterClass.*;
import protos.LocationServiceOuterClass.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ItemLocationService extends ItemLocationServiceGrpc.ItemLocationServiceImplBase {

	ItemLocationModel model;

	public ItemLocationService(ItemLocationModel model) {
		this.model = model;
	}

	@Override
	public void registerItemLocation(gItemLocation request, StreamObserver<gItemLocation> responseObserver) {
		// METHOD CALLING
		// Extract Object from Request
		ItemLocation requestItemLocation = getItemLocationFromRequest(request);
		// Perform Model Call
		ItemLocation returnItemLocation = null;
		try {
			returnItemLocation = model.register(requestItemLocation);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (returnItemLocation == null) {
			returnItemLocation = requestItemLocation;
		}
		// == == == == == == == == == == == ==
		// METHOD RESPONSE SECTION | Here we do a bit of Magic to return the requested stuff
		// Create Response Object | Since the proto file calls for a gItemLocation as a return value, we instantiate a gItemLocation.Builder object to create a Response
		gItemLocation.Builder response = gItemLocation.newBuilder();
		// Set Values Of Response Object | This Simply copies the itemLocation's information into the response.ItemLocation
		parseAndMergeItemLocation(response, returnItemLocation);
		// Link the Response to the Observer | This tells the responseObserver, that when it is completed, it should send back the response (which is a gItemLocation object)
		responseObserver.onNext(response.build());
		// Tell Observer the Method is finished, and let it return the Response
		responseObserver.onCompleted();
	}


	@Override
	public void getItemLocation(gItemLocationId request, StreamObserver<gItemLocation> responseObserver) {
		// Fetch the ItemLocation from Request
		int itemLocationId = request.getItemLocationId();
		// Fetch the ItemLocation from the Server
		try {

			ItemLocation itemLocation = model.get(itemLocationId);

			// Ensure ItemLocation was retrieved. If itemLocation is null, Echo back the ItemLocation requested. Optionally throw an Error
			if (itemLocation == null) {
				responseObserver.onError(new Exception("Not Found bitch"));
			}

			// Create Response Object
			gItemLocation.Builder response = gItemLocation.newBuilder();
			// Set Values Of Response Object
			parseAndMergeItemLocation(response, itemLocation);
			// Link the Response to the Observer
			responseObserver.onNext(response.build());
			// Tell Observer the Method is finished, and let it return the Response
			responseObserver.onCompleted();

		} catch (Exception e) {
			responseObserver.onError(e);
			e.printStackTrace();
		}


	}

	@Override
	public void getAllItemLocations(gItemLocation request, StreamObserver<gItemLocationList> responseObserver) {
		List<gItemLocation> returnItemLocations = new ArrayList<>();
		Collection<ItemLocation> itemLocations;
		// Parse Model ItemLocations to gRPC ItemLocations
		try {
			itemLocations = model.getAll();
			for (ItemLocation itemLocation : itemLocations) {
				gItemLocation.Builder builder = gItemLocation.newBuilder();
				parseAndMergeItemLocation(builder, itemLocation);
				returnItemLocations.add(builder.build()); // THIS LIKELY WON'T WORK. UNSURE OF HOW PARSEFROM IS IMPLEMENTED
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Create Response Object
		gItemLocationList.Builder response = gItemLocationList.newBuilder();
		// Add the gItemLocations to the Response
		response.addAllItemLocations(returnItemLocations); // Add ItemLocations to Builder
		// Link the Response to the Observer
		responseObserver.onNext(response.build());
		// Tell Observer the Method is finished, and let it return the Response
		responseObserver.onCompleted();
	}

	@Override
	public void updateItemLocation(gItemLocation request, StreamObserver<gItemLocation> responseObserver) {
		// Fetch ItemLocation
		ItemLocation requestItemLocation = getItemLocationFromRequest(request);
		// Update ItemLocation on Server
		ItemLocation returnItemLocation = null;
		try {
			returnItemLocation = model.update(requestItemLocation);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Ensure ReturnItemLocation is not Null | Consider throwing an Error Instead
		if (returnItemLocation == null) {
			returnItemLocation = requestItemLocation;
		}
		// Create Response Object
		gItemLocation.Builder response = gItemLocation.newBuilder();
		// Add the gItemLocations to the Response
		parseAndMergeItemLocation(response, returnItemLocation);
		// Link the Response to the Observer
		responseObserver.onNext(response.build());
		// Tell Observer the Method is finished, and let it return the Response
		responseObserver.onCompleted();
	}


	@Override
	public void removeItemLocation(gItemLocationId request, StreamObserver<gBoolValue> responseObserver) {
		// Fetch ItemLocation
		int itemLocationId = request.getItemLocationId();
		// Remove ItemLocation on Server

		try {
			boolean result = model.remove(itemLocationId);

			// Ensure ReturnItemLocation is not Null | Consider throwing an Error Instead
			if (!result) {
				responseObserver.onError(new Throwable("Item Location was not removed"));
			}


			// Link the Response to the Observer
			//responseObserver.onNext();
			// Tell Observer the Method is finished, and let it return the Response
			responseObserver.onCompleted();

		} catch (Exception e) {
			responseObserver.onError(new Throwable("Item Location was not removed"));
			e.printStackTrace();
		}


	}

	@Override
	public void getByItemId(gItemId request, StreamObserver<gItemLocationList> responseObserver) {

		int itemId = request.getItemId();

		List<gItemLocation> returnItemLocations = new ArrayList<>();

		Collection<ItemLocation> itemLocations;
		// Parse Model ItemLocations to gRPC ItemLocations
		try {

			itemLocations = model.getByItemId(itemId);

			for (ItemLocation itemLocation : itemLocations) {
				gItemLocation.Builder builder = gItemLocation.newBuilder();
				parseAndMergeItemLocation(builder, itemLocation);
				returnItemLocations.add(builder.build()); // THIS LIKELY WON'T WORK. UNSURE OF HOW PARSEFROM IS IMPLEMENTED
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		// Create Response Object
		gItemLocationList.Builder response = gItemLocationList.newBuilder();
		// Add the gItemLocations to the Response
		response.addAllItemLocations(returnItemLocations); // Add ItemLocations to Builder
		// Link the Response to the Observer
		responseObserver.onNext(response.build());
		// Tell Observer the Method is finished, and let it return the Response
		responseObserver.onCompleted();

	}

	@Override
	public void getByLocationId(gLocationId request, StreamObserver<gItemLocationList> responseObserver) {

		int locationId = request.getLocationId();

		List<gItemLocation> returnItemLocations = new ArrayList<>();
		Collection<ItemLocation> itemLocations;
		// Parse Model ItemLocations to gRPC ItemLocations
		try {
			itemLocations = model.getByLocationId(locationId);
			for (ItemLocation itemLocation : itemLocations) {
				gItemLocation.Builder builder = gItemLocation.newBuilder();
				parseAndMergeItemLocation(builder, itemLocation);
				returnItemLocations.add(builder.build()); // THIS LIKELY WON'T WORK. UNSURE OF HOW PARSEFROM IS IMPLEMENTED
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Create Response Object
		gItemLocationList.Builder response = gItemLocationList.newBuilder();
		// Add the gItemLocations to the Response
		response.addAllItemLocations(returnItemLocations); // Add ItemLocations to Builder
		// Link the Response to the Observer
		responseObserver.onNext(response.build());
		// Tell Observer the Method is finished, and let it return the Response
		responseObserver.onCompleted();
	}

	private ItemLocation getItemLocationFromRequest(gItemLocation req) {
		gItem x = req.getItem();
		gLocation y = req.getLocation();
		Item i = new Item(x.getId(), x.getItemName(), x.getLength(), x.getWidth(), x.getHeight(), x.getWeight());
		Location l = new Location(y.getId(), y.getDescription());
		return new ItemLocation(req.getId(), l, i, req.getAmount());
	}

	private void parseAndMergeItemLocation(gItemLocation.Builder builder, ItemLocation itemLocation) {
		gItem x = parseAndMergeItem(gItem.newBuilder(), itemLocation.getItem()).build();
		gLocation y = parseAndMergeLocation(gLocation.newBuilder(), itemLocation.getLocation()).build();
		builder.setId(itemLocation.getId()).setItem(x).setLocation(y).setAmount(itemLocation.getAmount());
	}

	private gItem.Builder parseAndMergeItem(gItem.Builder builder, Item item) {
		return builder.setId(item.getId()).setItemName(item.getItemName()).setHeight(item.getHeight()).setLength(item.getLength()).setWidth(item.getWidth()).setWeight(item.getWeight());
	}

	private gLocation.Builder parseAndMergeLocation(gLocation.Builder builder, Location location) {
		return builder.setId(location.getId()).setDescription(location.getDescription());
	}
}
