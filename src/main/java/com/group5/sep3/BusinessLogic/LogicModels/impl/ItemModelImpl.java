package com.group5.sep3.BusinessLogic.LogicModels.impl;

import com.group5.sep3.BusinessLogic.LogicModels.ItemModel;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;
import com.group5.sep3.RestManagerFactory;
import com.group5.sep3.BusinessLogic.model.Item;
import com.group5.sep3.ClientCommunication.TransferObjects.Request;
import com.group5.sep3.ClientCommunication.TransferObjects.RequestType;
import com.group5.sep3.util.ProjectUtil;

import java.beans.PropertyChangeListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

public class ItemModelImpl implements ItemModel {


    private final RestManager<Item> itemRestManager;

    private final HashMap<RequestType, Method> requestTypeMethodHashMap;

    public ItemModelImpl() {
        this.itemRestManager =  RestManagerFactory.getInstance().getRestManager("Item");

        requestTypeMethodHashMap = new HashMap<>();
        try {
            requestTypeMethodHashMap.put(RequestType.PUT, this.getClass().getMethod("registerItem", Item.class));

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void registerItem(Item item) {
        // if item has id ? check if already exist
        itemRestManager.put(item);
        //TODO: error handling


    }


    @Override
    public void handleRequest(Request request) {

        try {


            Item item = request.getArg(Item.class);

            requestTypeMethodHashMap.get(request.getType()).invoke(this, item);;



        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


        /*
        if (request.getType() == RequestType.PUT) {
            registerItem(request.getArg(Item.class));

        } else if (request.getType() == RequestType.POST) {
            ProjectUtil.notImplemented();
        } else if (request.getType() == RequestType.GET) {
            ProjectUtil.notImplemented();
        } else if (request.getType() == RequestType.DELETE) {
            ProjectUtil.notImplemented();
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
