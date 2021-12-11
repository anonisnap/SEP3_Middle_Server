package com.group5.sep3.DataBaseCommunication.RestManagers.Impl;

import com.google.gson.reflect.TypeToken;
import com.group5.sep3.BusinessLogic.model.Location;
import com.group5.sep3.DataBaseCommunication.RestClientImpl;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;
import com.group5.sep3.util.JsonHelper;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class LocationRestManagerImpl implements RestManager<Location> {

	@Override
	public Location create(Location obj) {
		String restUrl = obj.getClass().getSimpleName() + RestClientImpl.ADD_URL;
		String restResponse = (String) RestClientImpl.getInstance().post(restUrl, obj);

		return JsonHelper.fromJson(restResponse, Location.class);
	}

	@Override
	public Location update(Location obj) {
		String restUrl = obj.getClass().getSimpleName() + RestClientImpl.UPDATE_URL;
		String restResponse = (String) RestClientImpl.getInstance().post(restUrl, obj);

		return JsonHelper.fromJson(restResponse, Location.class);
	}

	@Override
	public Location get(int objId) {
		String restUrl = Location.class.getSimpleName() + "/" + objId;
		String restResponse = (String) RestClientImpl.getInstance().get(restUrl);

		return JsonHelper.fromJson(restResponse, Location.class);
	}

	@Override
	public ArrayList<Location> getAll() {
		String restUrl = Location.class.getSimpleName();
		String jsonString = (String) RestClientImpl.getInstance().get(restUrl);
		Type type = new TypeToken<ArrayList<Location>>() {
		}.getType();

		return JsonHelper.fromJson(jsonString, type);
	}

	@Override
	public boolean delete(int objId) {
		String restUrl = Location.class.getSimpleName() + "/" + objId;

		return RestClientImpl.getInstance().delete(restUrl);
	}
}
