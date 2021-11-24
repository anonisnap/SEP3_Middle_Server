package com.group5.sep3.BusinessLogic;

import com.group5.sep3.BusinessLogic.LogicModels.impl.ItemModelImpl;

import java.util.HashMap;

public class ModelFactory {




    private static HashMap<String, RequestHandler> modelMap;


    private ModelFactory() {
        modelMap = new HashMap<>();

       // modelMap.put("item", new ItemModelImpl());

    }


    public static RequestHandler getRequestHandler(String type){
        return modelMap.get(type);
    }





}
