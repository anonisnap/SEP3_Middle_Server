package com.group5.sep3.DataBaseCommunication.RestManagers.Impl;

import com.group5.sep3.BusinessLogic.model.Item;
import com.group5.sep3.DataBaseCommunication.RestClientImpl;
import com.group5.sep3.DataBaseCommunication.RestManagers.ItemRestManager;

public class ItemRestManagerImpl implements ItemRestManager{




    @Override
    public void registerItem(Item item) {
        String restUrl = "item";
        RestClientImpl.getInstance().put(restUrl,item);
    }



}
