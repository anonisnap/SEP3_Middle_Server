package com.group5.sep3.DataBaseCommunication.RestManagers.Impl;

import com.group5.sep3.BusinessLogic.model.Location;
import com.group5.sep3.DataBaseCommunication.RestClientImpl;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;

public class LocationRestManagerImpl implements RestManager<Location> {


    @Override
    public Location put(Location obj) {
        String url = obj.getClass().getSimpleName();
        RestClientImpl.getInstance().put(url, obj);
        return obj;
    }

    @Override
    public Location post(Location obj) {
        String url = obj.getClass().getSimpleName();
        return (Location) RestClientImpl.getInstance().post(url, obj);
    }

    @Override
    public Location get(Location obj) {
        String url = obj.getClass().getSimpleName();
        return (Location) RestClientImpl.getInstance().get(url);
    }

    @Override
    public Location delete(Location obj) {
        String url = obj.getClass().getSimpleName();
        RestClientImpl.getInstance().delete(url);
        return obj;
    }
}
