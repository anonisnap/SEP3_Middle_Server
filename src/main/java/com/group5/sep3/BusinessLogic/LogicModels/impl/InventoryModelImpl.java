package com.group5.sep3.BusinessLogic.LogicModels.impl;

import com.group5.sep3.BusinessLogic.LogicModels.InventoryModel;
import com.group5.sep3.BusinessLogic.model.Inventory;
import com.group5.sep3.BusinessLogic.model.Item;
import com.group5.sep3.DataBaseCommunication.RestManagers.InventoryRestManager;

import java.util.ArrayList;
import java.util.List;

public class InventoryModelImpl implements InventoryModel {
    private final InventoryRestManager inventoryRestManager;

    public InventoryModelImpl(InventoryRestManager inventoryRestManager) {
        this.inventoryRestManager = inventoryRestManager;
    }

    @Override
    public Inventory register(Inventory inventory) {
        //Check if same item already exists on location
        Inventory currentInventory =
                checkForItemInInventoriesOnLocation(inventory.getLocation().getId(), inventory.getItem());

        //If an inventory exists go here
        if(currentInventory != null){
                //update amount
                currentInventory.setAmount(inventory.getAmount() + currentInventory.getAmount());
                return inventoryRestManager.update(currentInventory);
        }

        //If item doesn't exist on location, create itemLocation
        return inventoryRestManager.create(inventory);
    }

    @Override
    public Inventory update(Inventory inventory) throws Exception {

        //Getting Location data, from old location
        Inventory oldInventory = get(inventory.getId());
        //Getting Location Amount, from old location
        int oldLocationAmount = oldInventory.getAmount();

        //Get AmountToMove for If statements
        int amountToMove = inventory.getAmount();

        //If List contains item with same itemId, then add this amount to that.
        Inventory currentInventory =
                checkForItemInInventoriesOnLocation(inventory.getLocation().getId(), inventory.getItem());

        if(currentInventory != null){

            //Updating new ItemLocation Amount
            currentInventory.setAmount(currentInventory.getAmount() + amountToMove);

            // Not all items are moved
            if (amountToMove < oldLocationAmount) {
                //Updating old ItemLocation Amount
                oldInventory.setAmount(oldLocationAmount - amountToMove);
                //Update New ItemLocation
                inventoryRestManager.update(oldInventory);
                //Update Old ItemLocation
                return inventoryRestManager.update(currentInventory);
            }

            //Full amount moved, remove the old inventory and update the current one
            inventoryRestManager.delete(oldInventory.getId());
            return inventoryRestManager.update(currentInventory);
        }

        //Item doesn't exist on new Location
        if (amountToMove < oldLocationAmount) {
            //Update old ItemLocation
            oldInventory.setAmount(oldLocationAmount - amountToMove);

            //Set New ItemLocation Id to 0, for put
            inventory.setId(0);

            //Putting to new Location
            inventoryRestManager.update(oldInventory);

            //Updating Old Location
            return inventoryRestManager.create(inventory);
        }

        //Full amount moved by replacing the old inventory
        inventoryRestManager.delete(oldInventory.getId());
        return inventoryRestManager.create(inventory);
    }

    @Override
    public ArrayList<Inventory> getAll() throws Exception {
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

    @Override
    public List<Inventory> getByItemId(int itemId) {
        return inventoryRestManager.getByItemId(itemId);
    }

    @Override
    public List<Inventory> getByLocationId(int locationId) {

        return inventoryRestManager.getByLocationId(locationId);
    }


    @Override
    public List<Inventory> getInventoryStock() {
        return inventoryRestManager.GetInventoryStock();
    }


    private Inventory checkForItemInInventoriesOnLocation(int locationId, Item item) {
        //Grabbing list of inventories with current Location
        List<Inventory> inventories = getByLocationId(locationId);

        for (Inventory inventory : inventories) {
            if (inventory.getItem().getId() == item.getId()) {
                return inventory;
            }
        }
        return null;
    }

}
