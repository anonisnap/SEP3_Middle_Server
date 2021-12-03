package com.group5.sep3.ClientCommunication.SocketCommunication.RequestHandeling;

import com.group5.sep3.ClientCommunication.SocketCommunication.TransferObjects.Request;
import com.group5.sep3.RequestHandlerFactory;
import com.group5.sep3.util.EntityTypes;
import com.group5.sep3.util.ProjectUtil;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashMap;

public class RequestHandlerImpl implements RequestHandler, PropertyChangeListener {

    PropertyChangeListener propertyChangeListener;

    private final HashMap<EntityTypes, RequestHandler> requestHandlerMap;


    public RequestHandlerImpl() {
        requestHandlerMap = new HashMap<>();
        requestHandlerMap.putAll(RequestHandlerFactory.getInstance().getAll());
    }

    @Override
    public Object handleRequest(Request request) throws Exception {

        EntityTypes entityTypeName = EntityTypes.valueOf(request.getClassName());

        ProjectUtil.testPrint("Request Class: " + entityTypeName + "\nRequest Handler Keys: " + requestHandlerMap.keySet());

        return requestHandlerMap.get(entityTypeName).handleRequest(request);
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
    public void propertyChange(PropertyChangeEvent evt) {
        ProjectUtil.notImplemented();
    }
}
