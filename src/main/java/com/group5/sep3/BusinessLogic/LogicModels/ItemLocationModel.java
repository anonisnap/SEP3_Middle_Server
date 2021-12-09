package com.group5.sep3.BusinessLogic.LogicModels;

import com.group5.sep3.BusinessLogic.model.ItemLocation;

import java.util.List;

public interface ItemLocationModel extends EntityLogicModel<ItemLocation> {

    /**
     * Return all ItemLocations which feature the Item ID specified in the given ItemLocation
     * @param itemLocation ItemLocation object with Item containing ID to Search for
     * @return
     * @throws Exception
     */
    List<ItemLocation> getByItemId(int itemId) throws Exception;

    /**
     * Return all ItemLocations which feature the Location ID specified in the given ItemLocation
     * @param locationId ItemLocation object with Location containing ID to Search for
     * @return
     * @throws Exception
     */
    List<ItemLocation> getByLocationId(int locationId) throws Exception ;


}
