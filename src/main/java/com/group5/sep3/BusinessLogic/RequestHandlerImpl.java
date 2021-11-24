package com.group5.sep3.BusinessLogic;

import com.group5.sep3.BusinessLogic.LogicModels.ItemModel;
import com.group5.sep3.BusinessLogic.LogicModels.SpikeModel;
import com.group5.sep3.BusinessLogic.LogicModels.impl.ItemModelImpl;
import com.group5.sep3.BusinessLogic.model.Item;
import com.group5.sep3.BusinessLogic.model.Spike;
import com.group5.sep3.ClientCommunication.TransferObjects.Request;
import com.group5.sep3.util.ProjectUtil;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashMap;

public class RequestHandlerImpl implements RequestHandler, PropertyChangeListener {

    PropertyChangeListener propertyChangeListener;
    private SpikeModel spikeModel;
    private ItemModel itemModel;

    //private HashMap<String, RequestHandler> requestHandlerMap;


    public RequestHandlerImpl(ItemModel itemModel) {

        this.itemModel = itemModel;
       // requestHandlerMap.put("item", new ItemModelImpl());


    }

    @Override
    public void handleRequest(Request request) {
        ProjectUtil.TestPrint("Hallo im requestHandler imple boii, i got this");
        if (request.getType().name().equalsIgnoreCase("put")){
            itemModel.handleRequest(request);
        }else{
            ProjectUtil.TestPrint(request.getType().name() + ": The request was not handled ");
        }


    }


    @Override
    public void addListener(String name, PropertyChangeListener listener) {

    }

    @Override
    public void addListener(PropertyChangeListener listener) {
        this.propertyChangeListener = listener;
    }

    @Override
    public void removeListener(String name, PropertyChangeListener listener) {

    }

    @Override
    public void removeListener(PropertyChangeListener listener) {

    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        ProjectUtil.NotImplemented();
    }
}
