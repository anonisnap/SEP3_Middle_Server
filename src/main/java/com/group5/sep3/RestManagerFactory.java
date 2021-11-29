package com.group5.sep3;

import com.group5.sep3.DataBaseCommunication.RestManagers.Impl.ItemRestManagerImpl;
import com.group5.sep3.DataBaseCommunication.RestManagers.Impl.LocationRestManagerImpl;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;

import java.util.HashMap;

public class RestManagerFactory {



    private static RestManagerFactory instance;

    private final HashMap<String, RestManager> restManagers;

    private RestManagerFactory() {
        restManagers = new HashMap<>();
        restManagers.put("Item", new ItemRestManagerImpl());
        restManagers.put("Location", new LocationRestManagerImpl());
    }

    public static RestManagerFactory getInstance() {
        if (instance == null) {
            instance = new RestManagerFactory();
        }
        return instance;
    }

    public RestManager getRestManager(String type){
        return restManagers.get(type);
    }


}
