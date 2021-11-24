package com.group5.sep3.BusinessLogic.LogicModels.impl;

import com.group5.sep3.BusinessLogic.LogicModels.ItemModel;
import com.group5.sep3.BusinessLogic.model.Item;
import com.group5.sep3.ClientCommunication.TransferObjects.Request;
import com.group5.sep3.ClientCommunication.TransferObjects.RequestType;
import com.group5.sep3.DataBaseCommunication.RestManagers.ItemRestManager;
import com.group5.sep3.util.ProjectUtil;

import java.beans.PropertyChangeListener;

public class ItemModelImpl implements ItemModel {


    private ItemRestManager itemRestManager;

    public ItemModelImpl(ItemRestManager itemRestManager) {
        this.itemRestManager = itemRestManager;
    }

    @Override
    public void registerItem(Item item) {
        // if item has id ? check if already exist
        itemRestManager.registerItem(item);
        //TODO: error handling
        ProjectUtil.NotImplemented();
    }


    @Override
    public void handleRequest(Request request) {

        if (request.getType() == RequestType.PUT) {
            registerItem(request.getArg(Item.class));
        } else if (request.getType() == RequestType.POST) {
            ProjectUtil.NotImplemented();
        } else if (request.getType() == RequestType.GET) {
            ProjectUtil.NotImplemented();
        } else if (request.getType() == RequestType.DELETE) {
            ProjectUtil.NotImplemented();
        }

    }

    @Override
    public void addListener(String name, PropertyChangeListener listener) {

    }

    @Override
    public void addListener(PropertyChangeListener listener) {

    }

    @Override
    public void removeListener(String name, PropertyChangeListener listener) {

    }

    @Override
    public void removeListener(PropertyChangeListener listener) {

    }


}
