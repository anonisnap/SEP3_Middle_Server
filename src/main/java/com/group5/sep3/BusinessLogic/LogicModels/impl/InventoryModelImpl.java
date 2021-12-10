package com.group5.sep3.BusinessLogic.LogicModels.impl;

import com.group5.sep3.BusinessLogic.LogicModels.InventoryModel;
import com.group5.sep3.BusinessLogic.model.Inventory;
import com.group5.sep3.DataBaseCommunication.RestManagers.InventoryRestManager;
import org.springframework.web.client.RestClientException;

import java.util.Collection;
import java.util.List;

public class InventoryModelImpl implements InventoryModel {
    private final InventoryRestManager inventoryRestManager;

    public InventoryModelImpl(InventoryRestManager inventoryRestManager) {
        this.inventoryRestManager = inventoryRestManager;
    }

    @Override
    public Inventory register(Inventory inventory) throws Exception {
        //Get all itemLocations used Location, to see if item already exists on location
        List<Inventory> inventories = getByLocationId(inventory.getId());

        //Rotate through locations to check items
        for (Inventory itemLoc : inventories) {
            //Check if item already exists on location
            if (itemLoc.getItem().getId() == inventory.getItem().getId()) {
                //If item exists on location, update amount
                inventory.setAmount(inventory.getAmount() + itemLoc.getAmount());
                //Set ItemLocation Id to Id on new ItemLocation, so Database knows it exists
                inventory.setId(itemLoc.getId());
                return inventoryRestManager.update(inventory);
            }
        }
        //If item doesn't exist on location, create itemLocation
        return inventoryRestManager.create(inventory);
    }

    @Override
    public Inventory update(Inventory inventory) throws Exception {

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
        Inventory oldInventory = get(inventory.getId());
        //Getting Location Amount, from old location
        int oldLocationAmount = oldInventory.getAmount();

        //Get AmountToMove for If statements
        int amountToMove = inventory.getAmount();

        //Grabbing list of itemLocations with current Location
        List<Inventory> inventories = getByLocationId(inventory.getId());

        //If List contains item with same itemId, then add this amount to that.
        for (Inventory itemLoc : inventories) {
            if (itemLoc.getItem().getId() == inventory.getItem().getId()) {
                //Updating new ItemLocation Amount
                itemLoc.setAmount(itemLoc.getAmount()+amountToMove);

                //Updating old ItemLocation Amount
                oldInventory.setAmount(oldLocationAmount-amountToMove);

                if (amountToMove < oldLocationAmount) {
                    //Update New ItemLocation
                    inventoryRestManager.update(itemLoc);
                    //Update Old ItemLocation
                    return inventoryRestManager.update(oldInventory);
                }
                //If amount on location = moved amount
                return inventoryRestManager.update(inventory);
            }
        }

        //Item doesn't exist on new Location
        if (amountToMove < oldLocationAmount) {
            //Update old ItemLocation
            oldInventory.setAmount(oldLocationAmount - amountToMove);

            //Set New ItemLocation Id to 0, for put
            inventory.setId(0);

            //Putting to new Location
            inventoryRestManager.create(inventory);

            //Updating Old Location
            return inventoryRestManager.update(oldInventory);
        }

        //Same amount moved as on old Location, just update location
        return inventoryRestManager.update(inventory);
}

    @Override
    public Collection<Inventory> getAll() throws Exception {
        return inventoryRestManager.getAll();
    }

    @Override
    public Inventory get(int itemLocationId) throws Exception {
        return inventoryRestManager.get(itemLocationId);
    }

    @Override
    public boolean remove(int itemLocationId) throws Exception {
        return inventoryRestManager.delete(itemLocationId);
    }

    // TODO: Mangler der ikke PROTO filer for disse?
    @Override
    public List<Inventory> getByItemId(int itemId) {
        return inventoryRestManager.getByItemId(itemId);
    }

    @Override
    public List<Inventory> getByLocationId(int locationId){
        return inventoryRestManager.getByLocationId(locationId);
    }

    @Override
    public List<Inventory> getInventoryStock() {
        return inventoryRestManager.GetInventoryStock();
    }

}
