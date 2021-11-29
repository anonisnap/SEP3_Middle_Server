package com.group5.sep3.ClientCommunication;

import com.group5.sep3.LogicModelFactory;
import com.group5.sep3.ClientCommunication.TransferObjects.Request;
import com.group5.sep3.util.ProjectUtil;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashMap;

public class RequestHandlerImpl implements RequestHandler, PropertyChangeListener {

    PropertyChangeListener propertyChangeListener;

    private HashMap<String, RequestHandler> requestHandlerMap;


    public RequestHandlerImpl() {
        requestHandlerMap = new HashMap<>();
        requestHandlerMap.putAll(LogicModelFactory.getInstance().getAllLogicModels());
    }

    @Override
    public void handleRequest(Request request) {
        ProjectUtil.testPrint("Request Class: " + request.getClassName() + "\nRequest Handler Keys: " + requestHandlerMap.keySet());
        requestHandlerMap.get(request.getClassName()).handleRequest(request);
    }


    @Override
    public void addListener(String name, PropertyChangeListener listener) {
        ProjectUtil.notImplemented();
    }

    @Override
    public void addListener(PropertyChangeListener listener) {
        this.propertyChangeListener = listener;
    }

    @Override
    public void removeListener(String name, PropertyChangeListener listener) {
        ProjectUtil.notImplemented();
    }

    @Override
    public void removeListener(PropertyChangeListener listener) {
        ProjectUtil.notImplemented();
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        ProjectUtil.notImplemented();
    }
}
