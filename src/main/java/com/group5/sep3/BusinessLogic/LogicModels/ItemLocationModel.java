package com.group5.sep3.BusinessLogic.LogicModels;

import com.group5.sep3.BusinessLogic.model.ItemLocation;
import org.springframework.web.client.RestClientException;

public interface ItemLocationModel extends LogicModel<ItemLocation>{

    ItemLocation getByItemId(ItemLocation itemLocation) throws Exception;

    ItemLocation getByLocationId(ItemLocation itemLocation) throws Exception ;


}
