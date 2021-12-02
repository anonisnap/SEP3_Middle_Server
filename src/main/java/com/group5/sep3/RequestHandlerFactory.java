package com.group5.sep3;

import com.group5.sep3.ClientCommunication.SocketCommunication.RequestHandeling.RequestHandelers.ItemRequestHandlerImpl;
import com.group5.sep3.ClientCommunication.SocketCommunication.RequestHandeling.RequestHandelers.LocationRequestHandlerImpl;
import com.group5.sep3.ClientCommunication.SocketCommunication.RequestHandeling.RequestHandler;
import com.group5.sep3.util.EntityTypes;

import java.util.HashMap;
import java.util.Map;

public class RequestHandlerFactory {

    public static RequestHandlerFactory instance;

    private HashMap<EntityTypes, RequestHandler> requestHandlerMap;

    private RequestHandlerFactory() {
        requestHandlerMap = new HashMap<>();

        requestHandlerMap.put(EntityTypes.Item, new ItemRequestHandlerImpl());
        requestHandlerMap.put(EntityTypes.Location, new LocationRequestHandlerImpl());
        requestHandlerMap.put(EntityTypes.ItemLocation, new ItemRequestHandlerImpl());
    }

    public static RequestHandlerFactory getInstance(){

        if (instance == null) instance = new RequestHandlerFactory();

        return instance;
    }


    public Map<EntityTypes, RequestHandler> getAll(){
        return Map.copyOf(requestHandlerMap);

    }


    public RequestHandler getRequestHandler(EntityTypes entityType){
        return requestHandlerMap.get(entityType);

    }

}
