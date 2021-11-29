package com.group5.sep3;

import com.group5.sep3.BusinessLogic.LogicModels.LogicModel;
import com.group5.sep3.BusinessLogic.LogicModels.impl.ItemModelImpl;
import com.group5.sep3.BusinessLogic.LogicModels.impl.LocationModelImpl;
import com.group5.sep3.ClientCommunication.RequestHandler;
import com.group5.sep3.util.ProjectUtil;

import java.util.HashMap;
import java.util.Map;

public class LogicModelFactory {


    public static LogicModelFactory instance;

    private HashMap<String, LogicModel> modelMap;

    private LogicModelFactory() {
        ProjectUtil.testPrint("+ New Logic Model Factory");
        modelMap = new HashMap<>();

        modelMap.put("Item", new ItemModelImpl());
        modelMap.put("Location", new LocationModelImpl());

    }

    public static LogicModelFactory getInstance() {
        if (instance == null) {
            instance = new LogicModelFactory();
        }
        ProjectUtil.testPrint("> Accessing Logic Model Factory");
        return instance;
    }

    public Map<String, LogicModel> getAllLogicModels(){
        return Map.copyOf(modelMap);
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

