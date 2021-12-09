package com.group5.sep3.DataBaseCommunication.RestManagers.Impl;

import com.google.gson.reflect.TypeToken;
import com.group5.sep3.BusinessLogic.model.Item;
import com.group5.sep3.DataBaseCommunication.RestClientImpl;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;
import com.group5.sep3.util.JsonHelper;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ItemRestManagerImpl implements RestManager<Item> {

	@Override
	public Item create(Item obj) {
		String restUrl = obj.getClass().getSimpleName() + "/add";
		String tmp = (String) RestClientImpl.getInstance().post(restUrl, obj);

		return JsonHelper.fromJson(tmp, Item.class);
	}

	@Override
	public Item update(Item obj) {
		String restUrl = obj.getClass().getSimpleName() + "/update";
		String tmp = (String) RestClientImpl.getInstance().post(restUrl, obj);

		return JsonHelper.fromJson(tmp, Item.class);
	}

	@Override
	public Item get(int objId) {
		String restUrl = Item.class.getSimpleName() + "/" + objId;
		Object restResponse = RestClientImpl.getInstance().get(restUrl);

		return JsonHelper.fromJson((String) restResponse, Item.class);
	}

	@Override
	public List<Item> getAll() {
		String restUrl = Item.class.getSimpleName();
		String jsonString = (String) RestClientImpl.getInstance().get(restUrl);
		Type type = new TypeToken<ArrayList<Item>>() {
		}.getType();

		return JsonHelper.fromJson(jsonString, type);
	}

	@Override
	public boolean delete(int objId) {
		String restUrl = Item.class.getSimpleName() + "/" + objId;
		return RestClientImpl.getInstance().delete(restUrl);
	}
}
