package com.group5.sep3;

import com.group5.sep3.DataBaseCommunication.RestManagers.Impl.ItemRestManagerImpl;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;

import java.util.HashMap;

public class RestManagerFactory {



    private static RestManagerFactory instance;

    private HashMap<String, RestManager> restManagers;

    private RestManagerFactory() {
        restManagers = new HashMap<>();
        restManagers.put("item", new ItemRestManagerImpl());

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
