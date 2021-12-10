package com.group5.sep3.GrpcCommunication.Services;

import Protos.ProtoUtil.*;
import com.group5.sep3.BusinessLogic.LogicModels.InventoryModel;
import com.group5.sep3.BusinessLogic.model.Item;
import com.group5.sep3.BusinessLogic.model.Inventory;
import com.group5.sep3.BusinessLogic.model.Location;
import io.grpc.stub.StreamObserver;
import protos.InventoryServiceGrpc;
import protos.InventoryServiceOuterClass.*;
import protos.ItemServiceOuterClass.*;
import protos.LocationServiceOuterClass.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class InventoryService extends InventoryServiceGrpc.InventoryServiceImplBase {

	InventoryModel model;

	public InventoryService(InventoryModel model) {
		this.model = model;
	}

	@Override
	public void registerInventory(gInventory request, StreamObserver<gInventory> responseObserver) {
		// METHOD CALLING
		// Extract Object from Request
		Inventory requestInventory = getInventoryFromRequest(request);
		// Perform Model Call
		Inventory returnInventory = null;
		try {
			returnInventory = model.register(requestInventory);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (returnInventory == null) {
			returnInventory = requestInventory;
		}
		// == == == == == == == == == == == ==
		// METHOD RESPONSE SECTION | Here we do a bit of Magic to return the requested stuff
		// Create Response Object | Since the proto file calls for a gInventory as a return value, we instantiate a gInventory.Builder object to create a Response
		gInventory.Builder response = gInventory.newBuilder();
		// Set Values Of Response Object | This Simply copies the Inventory's information into the response.Inventory
		parseAndMergeInventory(response, returnInventory);
		// Link the Response to the Observer | This tells the responseObserver, that when it is completed, it should send back the response (which is a gInventory object)
		responseObserver.onNext(response.build());
		// Tell Observer the Method is finished, and let it return the Response
		responseObserver.onCompleted();
	}


	@Override
	public void getInventory(gInventoryId request, StreamObserver<gInventory> responseObserver) {
		// Fetch the Inventory from Request
		int InventoryId = request.getInventoryId();
		// Fetch the Inventory from the Server
		try {

			Inventory Inventory = model.get(InventoryId);

			// Ensure Inventory was retrieved. If Inventory is null, Echo back the Inventory requested. Optionally throw an Error
			if (Inventory == null) {
				responseObserver.onError(new Exception("Not Found bitch"));
			}

			// Create Response Object
			gInventory.Builder response = gInventory.newBuilder();
			// Set Values Of Response Object
			parseAndMergeInventory(response, Inventory);
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
	public void getAllInventory(gInventory request, StreamObserver<gInventoryList> responseObserver) {
		List<gInventory> returnInventorys = new ArrayList<>();
		Collection<Inventory> Inventorys;
		// Parse Model Inventorys to gRPC Inventorys
		try {
			Inventorys = model.getAll();
			for (Inventory Inventory : Inventorys) {
				gInventory.Builder builder = gInventory.newBuilder();
				parseAndMergeInventory(builder, Inventory);
				returnInventorys.add(builder.build()); // THIS LIKELY WON'T WORK. UNSURE OF HOW PARSEFROM IS IMPLEMENTED
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Create Response Object
		gInventoryList.Builder response = gInventoryList.newBuilder();
		// Add the gInventorys to the Response
		response.addAllInventorys(returnInventorys); // Add Inventorys to Builder
		// Link the Response to the Observer
		responseObserver.onNext(response.build());
		// Tell Observer the Method is finished, and let it return the Response
		responseObserver.onCompleted();
	}

	@Override
	public void getStockInventory(gInventory request, StreamObserver<gInventoryList> responseObserver) {
		List<gInventory> returnInventorys = new ArrayList<>();
		Collection<Inventory> Inventorys;
		// Parse Model Inventorys to gRPC Inventorys
		try {
			Inventorys = model.getInventoryStock();
			for (Inventory Inventory : Inventorys) {
				gInventory.Builder builder = gInventory.newBuilder();
				parseAndMergeInventory(builder, Inventory);
				returnInventorys.add(builder.build()); // THIS LIKELY WON'T WORK. UNSURE OF HOW PARSEFROM IS IMPLEMENTED
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Create Response Object
		gInventoryList.Builder response = gInventoryList.newBuilder();
		// Add the gInventorys to the Response
		response.addAllInventorys(returnInventorys); // Add Inventorys to Builder
		// Link the Response to the Observer
		responseObserver.onNext(response.build());
		// Tell Observer the Method is finished, and let it return the Response
		responseObserver.onCompleted();
	}

	@Override
	public void updateInventory(gInventory request, StreamObserver<gInventory> responseObserver) {
		// Fetch Inventory
		Inventory requestInventory = getInventoryFromRequest(request);
		// Update Inventory on Server
		Inventory returnInventory = null;
		try {
			returnInventory = model.update(requestInventory);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Ensure ReturnInventory is not Null | Consider throwing an Error Instead
		if (returnInventory == null) {
			returnInventory = requestInventory;
		}
		// Create Response Object
		gInventory.Builder response = gInventory.newBuilder();
		// Add the gInventorys to the Response
		parseAndMergeInventory(response, returnInventory);
		// Link the Response to the Observer
		responseObserver.onNext(response.build());
		// Tell Observer the Method is finished, and let it return the Response
		responseObserver.onCompleted();
	}


	@Override
	public void removeInventory(gInventoryId request, StreamObserver<gBoolValue> responseObserver) {
		// Fetch Inventory
		int InventoryId = request.getInventoryId();
		// Remove Inventory on Server

		try {
			boolean result = model.remove(InventoryId);

			// Ensure ReturnInventory is not Null | Consider throwing an Error Instead
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
	public void getByItemId(gItemId request, StreamObserver<gInventoryList> responseObserver) {

		int itemId = request.getItemId();

		List<gInventory> returnInventorys = new ArrayList<>();

		Collection<Inventory> Inventorys;
		// Parse Model Inventorys to gRPC Inventorys
		try {

			Inventorys = model.getByItemId(itemId);

			for (Inventory Inventory : Inventorys) {
				gInventory.Builder builder = gInventory.newBuilder();
				parseAndMergeInventory(builder, Inventory);
				returnInventorys.add(builder.build()); // THIS LIKELY WON'T WORK. UNSURE OF HOW PARSEFROM IS IMPLEMENTED
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		// Create Response Object
		gInventoryList.Builder response = gInventoryList.newBuilder();
		// Add the gInventorys to the Response
		response.addAllInventorys(returnInventorys); // Add Inventorys to Builder
		// Link the Response to the Observer
		responseObserver.onNext(response.build());
		// Tell Observer the Method is finished, and let it return the Response
		responseObserver.onCompleted();

	}

	@Override
	public void getByLocationId(gLocationId request, StreamObserver<gInventoryList> responseObserver) {

		int locationId = request.getLocationId();

		List<gInventory> returnInventorys = new ArrayList<>();
		Collection<Inventory> Inventorys;
		// Parse Model Inventorys to gRPC Inventorys
		try {
			Inventorys = model.getByLocationId(locationId);
			for (Inventory Inventory : Inventorys) {
				gInventory.Builder builder = gInventory.newBuilder();
				parseAndMergeInventory(builder, Inventory);
				returnInventorys.add(builder.build()); // THIS LIKELY WON'T WORK. UNSURE OF HOW PARSEFROM IS IMPLEMENTED
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Create Response Object
		gInventoryList.Builder response = gInventoryList.newBuilder();
		// Add the gInventorys to the Response
		response.addAllInventorys(returnInventorys); // Add Inventorys to Builder
		// Link the Response to the Observer
		responseObserver.onNext(response.build());
		// Tell Observer the Method is finished, and let it return the Response
		responseObserver.onCompleted();
	}

	private Inventory getInventoryFromRequest(gInventory req) {
		gItem x = req.getItem();
		gLocation y = req.getLocation();
		Item i = new Item(x.getId(), x.getItemName(), x.getLength(), x.getWidth(), x.getHeight(), x.getWeight());
		Location l = new Location(y.getId(), y.getDescription());
		return new Inventory(req.getId(), l, i, req.getAmount());
	}

	private void parseAndMergeInventory(gInventory.Builder builder, Inventory Inventory) {
		gItem x = parseAndMergeItem(gItem.newBuilder(), Inventory.getItem()).build();
		gLocation y = parseAndMergeLocation(gLocation.newBuilder(), Inventory.getLocation()).build();
		builder.setId(Inventory.getId()).setItem(x).setLocation(y).setAmount(Inventory.getAmount());
	}

	private gItem.Builder parseAndMergeItem(gItem.Builder builder, Item item) {
		return builder.setId(item.getId()).setItemName(item.getItemName()).setHeight(item.getHeight()).setLength(item.getLength()).setWidth(item.getWidth()).setWeight(item.getWeight());
	}

	private gLocation.Builder parseAndMergeLocation(gLocation.Builder builder, Location location) {
		return builder.setId(location.getId()).setDescription(location.getDescription());
	}
}
