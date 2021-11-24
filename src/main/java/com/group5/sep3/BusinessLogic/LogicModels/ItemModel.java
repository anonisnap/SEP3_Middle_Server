package com.group5.sep3.BusinessLogic.LogicModels;

import com.group5.sep3.BusinessLogic.RequestHandler;
import com.group5.sep3.BusinessLogic.model.Item;
import com.group5.sep3.ClientCommunication.TransferObjects.Request;

public interface ItemModel extends RequestHandler {


    void registerItem(Item item);

}
