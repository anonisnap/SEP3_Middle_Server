package com.group5.sep3.DataBaseCommunication.RestManagers.Impl;

import com.google.gson.reflect.TypeToken;
import com.group5.sep3.BusinessLogic.model.Location;
import com.group5.sep3.DataBaseCommunication.RestClientImpl;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;
import com.group5.sep3.util.JsonHelper;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class LocationRestManagerImpl implements RestManager<Location> {

	@Override
	public Location create(Location obj) {
		String restUrl = obj.getClass().getSimpleName() + "/add";
		String restResponse = (String) RestClientImpl.getInstance().post(restUrl, obj);

		return JsonHelper.fromJson(restResponse, Location.class);
	}

	@Override
	public Location update(Location obj) {
		String restUrl = obj.getClass().getSimpleName() + "/update";
		String restResponse = (String) RestClientImpl.getInstance().post(restUrl, obj);

		return JsonHelper.fromJson(restResponse, Location.class);
	}

	@Override
	public Location get(Location obj) {
		String restUrl = obj.getClass().getSimpleName() + "/" + obj.getId();
		String restResponse = (String) RestClientImpl.getInstance().get(restUrl);

		return JsonHelper.fromJson(restResponse, Location.class);
	}

	@Override
	public List<Location> getAll() {
		String restUrl = Location.class.getSimpleName();
		String jsonString = (String) RestClientImpl.getInstance().get(restUrl);
		Type type = new TypeToken<ArrayList<Location>>() {
		}.getType();

		return JsonHelper.fromJson(jsonString, type);
	}

	@Override
	public Location delete(Location obj) {
		String restUrl = Location.class.getSimpleName() + "/" + obj.getId();

		return RestClientImpl.getInstance().delete(restUrl) ? obj : null;
	}
}
