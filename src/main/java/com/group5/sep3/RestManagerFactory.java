package com.group5.sep3;

import com.group5.sep3.BusinessLogic.model.Item;
import com.group5.sep3.BusinessLogic.model.Location;
import com.group5.sep3.DataBaseCommunication.RestManagers.Impl.RestManagerImpl;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;

import java.util.HashMap;

public class RestManagerFactory {



    private static RestManagerFactory instance;

    private final HashMap<String, RestManager<?>> restManagers;

    private RestManagerFactory() {
        restManagers = new HashMap<>();
        restManagers.put("Item", new RestManagerImpl<Item>());
        restManagers.put("Location", new RestManagerImpl<Location>());
    }

    public static RestManagerFactory getInstance() {
        if (instance == null) {
            instance = new RestManagerFactory();
        }
        return instance;
    }

    public RestManager<?> getRestManager(String type){
        return restManagers.get(type);
    }


}
