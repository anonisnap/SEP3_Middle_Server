package com.group5.sep3.DataBaseCommunication.RestManagers.Impl;

import com.google.gson.reflect.TypeToken;
import com.group5.sep3.BusinessLogic.model.Item;
import com.group5.sep3.BusinessLogic.model.ItemLocation;
import com.group5.sep3.DataBaseCommunication.RestClientImpl;
import com.group5.sep3.DataBaseCommunication.RestManagers.ItemLocationRestManager;
import com.group5.sep3.util.JsonHelper;
import com.group5.sep3.util.ProjectUtil;
import org.springframework.web.client.RestClientException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;

public class ItemLocationRestManagerImpl implements ItemLocationRestManager {



    @Override
    public ItemLocation put(ItemLocation obj) throws RestClientException {
        ProjectUtil.testPrint("Sending " + obj.toString());
        String restUrl = obj.getClass().getSimpleName();
        RestClientImpl.getInstance().put(restUrl, obj);
        return obj;
    }

    @Override
    public ItemLocation post(ItemLocation obj) throws RestClientException {
        String restUrl = obj.getClass().getSimpleName();
        RestClientImpl.getInstance().post(restUrl, obj);
        return obj;
    }

    @Override
    public ItemLocation get(ItemLocation obj) throws RestClientException {
        ProjectUtil.notImplemented();
        return null;
    }

    @Override
    public Collection<ItemLocation> getAll() throws RestClientException {

        String restUrl = ItemLocation.class.getSimpleName();

        String jsonString = (String) RestClientImpl.getInstance().get(restUrl);

        ProjectUtil.testPrint(jsonString);

        Type type = new TypeToken<ArrayList<ItemLocation>>(){}.getType();

        ArrayList<ItemLocation> itemLocations = JsonHelper.fromJson(jsonString, type);

        for (ItemLocation itemLocation : itemLocations) {
            System.out.println(itemLocation);
        }

        return itemLocations;
    }

    @Override
    public ItemLocation delete(ItemLocation obj) throws RestClientException {
        ProjectUtil.notImplemented();
        return null;
    }


    @Override
    public ItemLocation getByItemId(ItemLocation obj) throws RestClientException {
        String restUrl = obj.getClass().getSimpleName() + "/itemId/" + obj.getItem().getId();
        Object restResponse = RestClientImpl.getInstance().get(restUrl);
        ProjectUtil.testPrint(restResponse.getClass() + "\n" + restResponse);
        return JsonHelper.fromJson((String) restResponse, Item.class);
    }


    @Override
    public ItemLocation getByLocationId(ItemLocation obj) throws RestClientException {
        String restUrl = obj.getClass().getSimpleName() + "/locationId/" + obj.getLocation().getId();
        Object restResponse = RestClientImpl.getInstance().get(restUrl);
        ProjectUtil.testPrint(restResponse.getClass() + "\n" + restResponse);
        return JsonHelper.fromJson((String) restResponse, Item.class);
    }


}
