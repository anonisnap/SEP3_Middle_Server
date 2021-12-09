package com.group5.sep3.BusinessLogic.LogicModels.impl;

import com.group5.sep3.BusinessLogic.LogicModels.ItemLocationModel;
import com.group5.sep3.BusinessLogic.model.ItemLocation;
import com.group5.sep3.DataBaseCommunication.RestManagers.ItemLocationRestManager;
import org.springframework.web.client.RestClientException;

import java.util.Collection;
import java.util.List;

public class ItemLocationModelImpl implements ItemLocationModel {
    private final ItemLocationRestManager itemLocationRestManager;

    public ItemLocationModelImpl(ItemLocationRestManager itemLocationRestManager) {
        this.itemLocationRestManager = itemLocationRestManager;
    }

    @Override
    public ItemLocation register(ItemLocation itemLocation) throws Exception {
        //Get all itemLocations used Location, to see if item already exists on location
        List<ItemLocation> itemLocations = getByLocationId(itemLocation);

        //Rotate through locations to check items
        for (ItemLocation itemLoc : itemLocations) {
            //Check if item already exists on location
            if (itemLoc.getItem().getId() == itemLocation.getItem().getId()) {
                //If item exists on location, update amount
                itemLocation.setAmount(itemLocation.getAmount() + itemLoc.getAmount());
                //Set ItemLocation Id to Id on new ItemLocation, so Database knows it exists
                itemLocation.setId(itemLoc.getId());
                return itemLocationRestManager.update(itemLocation);
            }
        }
        //If item doesn't exist on location, create itemLocation
        return itemLocationRestManager.create(itemLocation);
    }

    @Override
    public ItemLocation update(ItemLocation itemLocation) throws Exception {

        //Getting Location data, from old location
        ItemLocation oldItemLocation = get(itemLocation);
        System.out.println("Found old item location" + oldItemLocation);
        //Getting Location Amount, from old location
        int oldAmount = oldItemLocation.getAmount();
        //Get AmountToMove for If statements
        int amountToMove = itemLocation.getAmount();


        if (oldAmount - amountToMove == 0){
            System.out.println("All items were moved " + itemLocation);
            return itemLocationRestManager.update(itemLocation);}


        oldItemLocation.setAmount(oldAmount-amountToMove);
        System.out.println("old item location updated" + oldItemLocation);
        itemLocationRestManager.update(oldItemLocation);

        System.out.println("Create new itemlocation" + itemLocation);
        return itemLocationRestManager.create(itemLocation);



        /*

        //Grabbing list of itemLocations with current Location from ItemLocation
        List<ItemLocation> itemLocations = getByLocationId(itemLocation);

        //If List contains item with same itemId, then add amount to that.
        for (ItemLocation itemLoc : itemLocations) {
            if (itemLoc.getItem().getId() == itemLocation.getItem().getId()) {
                System.out.println("Inside If");

                //Updating old ItemLocation Amount
                oldItemLocation.setAmount(oldLocationAmount-amountToMove);

                //Updating new ItemLocation Amount
                itemLoc.setAmount(itemLoc.getAmount()+amountToMove);

                if (amountToMove < oldLocationAmount) {
                    //Update New ItemLocation
                    itemLocationRestManager.update(itemLoc);
                    //Update Old ItemLocation
                    return itemLocationRestManager.update(oldItemLocation);
                }
                //If amount on location = moved amount
                return itemLocationRestManager.update(itemLocation);
            }
        }

        //Item doesn't exist on new Location
        if (amountToMove < oldLocationAmount) {
            //Update old ItemLocation
            oldItemLocation.setAmount(oldLocationAmount - amountToMove);

            //Set New ItemLocation Id to 0, for put
            itemLocation.setId(0);

            //Putting to new Location
            itemLocationRestManager.create(itemLocation);

            //Updating Old Location
            return itemLocationRestManager.update(oldItemLocation);
        }

        //If all items moved from old Location, just update location
        return itemLocationRestManager.update(itemLocation);*/
    }

    @Override
    public Collection<ItemLocation> getAll() throws Exception {
        return itemLocationRestManager.getAll();
    }

    @Override
    public ItemLocation get(ItemLocation itemLocation) throws Exception {
        return itemLocationRestManager.get(itemLocation);
    }

    @Override
    public ItemLocation remove(ItemLocation itemLocation) throws Exception {
        return itemLocationRestManager.delete(itemLocation);
    }

    // TODO: Mangler der ikke PROTO filer for disse?
    @Override
    public List<ItemLocation> getByItemId(ItemLocation obj) throws RestClientException {
        return itemLocationRestManager.getByItemId(obj);
    }

    @Override
    public List<ItemLocation> getByLocationId(ItemLocation itemLocation) throws RestClientException {
        return itemLocationRestManager.getByLocationId(itemLocation);
    }

}
