package com.group5.sep3.BusinessLogic.LogicModels;

import com.group5.sep3.BusinessLogic.model.ItemLocation;

import java.util.List;

public interface ItemLocationModel extends LogicModel<ItemLocation>{

    /**
     * Return all ItemLocations which feature the Item ID specified in the given ItemLocation
     * @param itemLocation ItemLocation object with Item containing ID to Search for
     * @return
     * @throws Exception
     */
    List<ItemLocation> getByItemId(ItemLocation itemLocation) throws Exception;

    /**
     * Return all ItemLocations which feature the Location ID specified in the given ItemLocation
     * @param itemLocation ItemLocation object with Location containing ID to Search for
     * @return
     * @throws Exception
     */
    List<ItemLocation> getByLocationId(ItemLocation itemLocation) throws Exception ;


}
