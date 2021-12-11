package com.group5.sep3.BusinessLogic.LogicModels;

import com.group5.sep3.BusinessLogic.model.Inventory;

import java.util.List;

public interface InventoryModel extends EntityLogicModel<Inventory> {

    /**
     * Return all ItemLocations which feature the Item ID specified in the given Invetory
     * @return List of inventory
     * @throws Exception
     */
    List<Inventory> getByItemId(int itemId) throws Exception;

    /**
     * Return all ItemLocations which feature the Location ID specified in the given ItemLocation
     * @param locationId ItemLocation object with Location containing ID to Search for
     * @return
     * @throws Exception
     */
    List<Inventory> getByLocationId(int locationId) throws Exception ;


    List<Inventory> getInventoryStock() throws Exception;

}
