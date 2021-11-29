package com.group5.sep3;

import com.group5.sep3.BusinessLogic.LogicModels.LogicModel;
import com.group5.sep3.BusinessLogic.LogicModels.impl.ItemModelImpl;
import com.group5.sep3.BusinessLogic.LogicModels.impl.LocationModelImpl;
import com.group5.sep3.ClientCommunication.RequestHandler;

import java.util.HashMap;

public class LogicModelFactory {


    public static LogicModelFactory instance;

    private HashMap<String, LogicModel> modelMap;

    private LogicModelFactory() {
        modelMap = new HashMap<>();

        modelMap.put("Item", new ItemModelImpl());
        modelMap.put("Location", new LocationModelImpl());

    }

    public static LogicModelFactory getInstance() {
        if (instance == null) {
            instance = new LogicModelFactory();
        }
        return instance;
    }

    public HashMap<String, LogicModel> getAllLogicModels(){
        return modelMap;
    }

    public RequestHandler getLogicModel(String type){

        return modelMap.get(type);

    }


    private enum models{
        Item,
        Order,
        Location
    }

}

