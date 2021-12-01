package com.group5.sep3.DataBaseCommunication.RestManagers.Impl;

import com.group5.sep3.BusinessLogic.model.Item;
import com.group5.sep3.DataBaseCommunication.RestClientImpl;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;
import com.group5.sep3.util.JsonHelper;
import com.group5.sep3.util.ProjectUtil;

import java.util.Collection;

public class ItemRestManagerImpl implements RestManager<Item> {


    @Override
    public Item put(Item obj) {

        String restUrl = obj.getClass().getSimpleName();

        RestClientImpl.getInstance().put(restUrl, obj);

        return obj;
    }

    @Override
    public Item post(Item obj) {
        ProjectUtil.notImplemented();
        return null;
    }

    @Override
    public Item get(Item obj) {
        String restUrl = obj.getClass().getSimpleName() + "/" + obj.getId();
        Object restResponse = RestClientImpl.getInstance().get(restUrl);
        ProjectUtil.testPrint(restResponse.getClass() + "\n" + restResponse);
        return JsonHelper.fromJson((String) restResponse, Item.class);
    }

    @Override
    public Collection<Item> getAll(Item obj) {
        String restUrl = obj.getClass().getSimpleName();
        RestClientImpl.getInstance().get(restUrl);
        ProjectUtil.notImplemented();
        return null;
    }


    @Override
    public Item delete(Item obj) {
        ProjectUtil.notImplemented();
        return null;
    }


}
