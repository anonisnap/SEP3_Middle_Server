package com.group5.sep3.BusinessLogic.LogicModels;

import com.group5.sep3.BusinessLogic.model.Item;

public interface ItemModel extends LogicModel {

    Item registerItem(Item item) throws Exception;

}
