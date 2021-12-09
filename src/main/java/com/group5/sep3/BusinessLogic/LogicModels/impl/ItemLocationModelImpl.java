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
        List<ItemLocation> itemLocations = getByLocationId(itemLocation.getId());

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

        /*
            //Getting Location data, from old location
        ItemLocation oldItemLocation = get(itemLocation);
        System.out.println("Found old item location" + oldItemLocation);
        //Get AmountToMove for If statements
        int amountToMove = itemLocation.getAmount();

        System.out.println("All items were moved " + itemLocation);
        oldItemLocation.setAmount(-amountToMove);
        itemLocationRestManager.create(oldItemLocation);

        System.out.println("Create new itemlocation"+itemLocation);
        return itemLocationRestManager.create(itemLocation);
        */

        //Getting Location data, from old location
        ItemLocation oldItemLocation = get(itemLocation.getId());
        //Getting Location Amount, from old location
        int oldLocationAmount = oldItemLocation.getAmount();

        //Get AmountToMove for If statements
        int amountToMove = itemLocation.getAmount();

        //Grabbing list of itemLocations with current Location
        List<ItemLocation> itemLocations = getByLocationId(itemLocation.getId());

        //If List contains item with same itemId, then add this amount to that.
        for (ItemLocation itemLoc : itemLocations) {
            if (itemLoc.getItem().getId() == itemLocation.getItem().getId()) {
                //Updating new ItemLocation Amount
                itemLoc.setAmount(itemLoc.getAmount()+amountToMove);

                //Updating old ItemLocation Amount
                oldItemLocation.setAmount(oldLocationAmount-amountToMove);

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

        //Same amount moved as on old Location, just update location
        return itemLocationRestManager.update(itemLocation);
}

    @Override
    public Collection<ItemLocation> getAll() throws Exception {
        return itemLocationRestManager.getAll();
    }

    @Override
    public ItemLocation get(int itemLocationId) throws Exception {
        return itemLocationRestManager.get(itemLocationId);
    }

    @Override
    public boolean remove(int itemLocationId) throws Exception {
        return itemLocationRestManager.delete(itemLocationId);
    }

    // TODO: Mangler der ikke PROTO filer for disse?
    @Override
    public List<ItemLocation> getByItemId(int itemId) throws RestClientException {
        return itemLocationRestManager.getByItemId(itemId);
    }

    @Override
    public List<ItemLocation> getByLocationId(int locationId) throws RestClientException {
        return itemLocationRestManager.getByLocationId(locationId);
    }

}
