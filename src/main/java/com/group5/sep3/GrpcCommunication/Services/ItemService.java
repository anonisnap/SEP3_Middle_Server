package com.group5.sep3.GrpcCommunication.Services;

import Protos.ProtoUtil.*;
import com.group5.sep3.BusinessLogic.LogicModels.ItemModel;
import com.group5.sep3.BusinessLogic.model.Item;
import io.grpc.stub.StreamObserver;
import protos.ItemServiceGrpc.*;
import protos.ItemServiceOuterClass.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ItemService extends ItemServiceImplBase {
    ItemModel model;

    public ItemService(ItemModel model) {
        this.model = model;
    }

    @Override
    public void registerItem(gItem request, StreamObserver<gItem> responseObserver) {

        // METHOD CALLING
        // Extract Object from Request
        Item requestItem = getItemFromRequest(request);


        // Perform Model Call
        Item returnItem = null;
        try {
            returnItem = model.register(requestItem);
        } catch (Exception e) {
            System.out.println("Failed to Register an Item (" + requestItem.getItemName() + ")");
            e.printStackTrace();
        }

        if (returnItem == null) {
            System.out.println("<!> Item was null");
            returnItem = requestItem;
        }


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

    }

    @Override
    public void getItem(gItemId request, StreamObserver<gItem> responseObserver) {

        // Fetch the Item from Request
        int itemId = request.getItemId();

        // Fetch the Item from the Server

        try {
            Item returnItem = model.get(itemId);
            // Ensure Item was retrieved. If item is null, Echo back the Item requested. Optionally throw an Error

            // Create Response Object
            gItem.Builder response = gItem.newBuilder();

            // Set Values Of Response Object
            parseAndMergeItem(response, returnItem);

            // Link the Response to the Observer
            responseObserver.onNext(response.build());

            // Tell Observer the Method is finished, and let it return the Response
            responseObserver.onCompleted();

        } catch (Exception e) {
            responseObserver.onError(new Throwable("Could not get item with id " + itemId));
            e.printStackTrace();

        }

    }

    @Override
    public void getAllItems(gItem request, StreamObserver<gItemList> responseObserver) {

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

    }

    @Override
    public void updateItem(gItem request, StreamObserver<gItem> responseObserver) {

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


        // Create Response Object
        gItem.Builder response = gItem.newBuilder();

        // Add the gItems to the Response
        parseAndMergeItem(response, returnItem);

        // Link the Response to the Observer
        responseObserver.onNext(response.build());

        // Tell Observer the Method is finished, and let it return the Response
        responseObserver.onCompleted();

    }



    @Override
    public void removeItem(gItemId request, StreamObserver<gBoolValue> responseObserver) {

        // Fetch Item
        int itemId = request.getItemId();

        // Remove Item on Server

        try {
            boolean returnItem = model.remove(itemId);

            // Create Response Object
            gBoolValue response = gBoolValue.newBuilder().setValue(returnItem).build();

            // Link the Response to the Observer
            responseObserver.onNext(response);

            // Tell Observer the Method is finished, and let it return the Response
            responseObserver.onCompleted();

        } catch (Exception e) {
            responseObserver.onError(new Throwable("Could not delete item with id: " +itemId));
            e.printStackTrace();
        }



    }


    private Item getItemFromRequest(gItem req) {
        Item tmp = new Item(req.getId(), req.getItemName(), req.getLength(), req.getWidth(), req.getHeight(), req.getWeight());
        return tmp;
    }

    private gItem.Builder parseAndMergeItem(gItem.Builder builder, Item item) {
        return builder.setId(item.getId()).setItemName(item.getItemName()).setHeight(item.getHeight()).setLength(item.getLength()).setWidth(item.getWidth()).setWeight(item.getWeight());
    }

}