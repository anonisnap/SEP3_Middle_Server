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
	public Item get(Item obj) {
		String restUrl = obj.getClass().getSimpleName() + "/" + obj.getId();
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
	public Item delete(Item obj) {
		String restUrl = Item.class.getSimpleName() + "/" + obj.getId();

		return RestClientImpl.getInstance().delete(restUrl) ? obj : null;
	}
}
