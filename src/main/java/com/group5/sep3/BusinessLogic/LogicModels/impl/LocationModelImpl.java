package com.group5.sep3.BusinessLogic.LogicModels.impl;

import com.group5.sep3.BusinessLogic.LogicModels.LocationModel;
import com.group5.sep3.BusinessLogic.model.Location;
import com.group5.sep3.ClientCommunication.TransferObjects.Request;
import com.group5.sep3.ClientCommunication.TransferObjects.RequestType;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;
import com.group5.sep3.RestManagerFactory;

import java.beans.PropertyChangeListener;
import java.lang.reflect.Method;
import java.util.Map;

public class LocationModelImpl implements LocationModel {
    private RestManager<Location> locationRestManager;
    private Map<RequestType, Method> requestTypeMethodMap;
    public LocationModelImpl() {
        locationRestManager = RestManagerFactory.getInstance().getRestManager("location");

        try {
            requestTypeMethodMap.put(RequestType.PUT, this.getClass().getDeclaredMethod("registerLocation", Location.class));
            requestTypeMethodMap.put(RequestType.POST, this.getClass().getDeclaredMethod("updateLocation", Location.class));
            requestTypeMethodMap.put(RequestType.GET, this.getClass().getDeclaredMethod("getLocation", Location.class));
            requestTypeMethodMap.put(RequestType.DELETE, this.getClass().getDeclaredMethod("removeLocation", Location.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    private Location registerLocation(Location location) { // TODO: Implement
        // Check Valid Location Identifier
        // If Identifier has numbers -> Go to 1
        // Else -> Go to 2
        // 1:
        // Check if Location exists
        // If location Exists -> Increment Location

        // 2:
        // Check highest current location
        // Increment and Register


        return null;
    }

    private Location updateLocation(Location location) {


        return null;
    }

    private Location getLocation(Location location) {


        return null;
    }

    private Location removeLocation(Location location) {


        return null;
    }

    @Override
    public void handleRequest(Request request) {

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
