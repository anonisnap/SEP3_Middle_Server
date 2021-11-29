package com.group5.sep3;

import com.group5.sep3.BusinessLogic.model.Item;
import com.group5.sep3.BusinessLogic.model.Location;
import com.group5.sep3.DataBaseCommunication.RestManagers.Impl.NOT_USED_RestManagerImpl;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;
import com.group5.sep3.util.ProjectUtil;

import java.util.HashMap;

public class RestManagerFactory {

    private static RestManagerFactory instance; // Instance for Singleton

    private final HashMap<String, RestManager<?>> restManagers; // List of Rest Manager Implementations

    private RestManagerFactory() {
        restManagers = new HashMap<>();
        restManagers.put("Item", new NOT_USED_RestManagerImpl<Item>(new Item(0, "", 0,0,0,0)));
        restManagers.put("Location", new NOT_USED_RestManagerImpl<Location>(new Location("A")));
        StringBuilder debug = new StringBuilder();
        for (String key : restManagers.keySet()) {
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

    public RestManager<?> getRestManager(String type){
        return restManagers.get(type);
    }


}
