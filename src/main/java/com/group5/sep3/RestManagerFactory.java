package com.group5.sep3;

import com.group5.sep3.DataBaseCommunication.RestManagers.Impl.ItemRestManagerImpl;
import com.group5.sep3.DataBaseCommunication.RestManagers.Impl.LocationRestManagerImpl;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;
import com.group5.sep3.util.EntityTypes;
import com.group5.sep3.util.ProjectUtil;

import java.util.HashMap;

public class RestManagerFactory {

    private static RestManagerFactory instance; // Instance for Singleton

    private final HashMap<EntityTypes, RestManager<?>> restManagers; // List of Rest Manager Implementations

    private RestManagerFactory() {
        restManagers = new HashMap<>();
        restManagers.put(EntityTypes.Item, new ItemRestManagerImpl());
        restManagers.put(EntityTypes.Location, new LocationRestManagerImpl());

        StringBuilder debug = new StringBuilder();
        for (EntityTypes key : restManagers.keySet()) {
            debug.append("\n\t> ").append(key).append(" ").append(restManagers.get(key).getClass().getSimpleName());
        }
        ProjectUtil.testPrint("Rest Manager Implementations: " + debug);

    }

    public static RestManagerFactory getInstance() {
        if (instance == null) {
            instance = new RestManagerFactory();
        }
        return instance;
    }

    public RestManager<?> getRestManager(EntityTypes type){
        return restManagers.get(type);
    }


}
