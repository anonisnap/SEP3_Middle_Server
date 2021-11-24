package com.group5.sep3.BusinessLogic;

import com.group5.sep3.BusinessLogic.LogicModels.impl.ItemModelImpl;

import java.util.HashMap;

public class RequestHandlerFactory {


    private static HashMap<String, RequestHandler> requestHandlerMap;


    private RequestHandlerFactory() {
        requestHandlerMap = new HashMap<>();

       // requestHandlerMap.put("item", );

    }


    public static RequestHandler getRequestHandler(String type){
        return requestHandlerMap.get(type);
    }




}
