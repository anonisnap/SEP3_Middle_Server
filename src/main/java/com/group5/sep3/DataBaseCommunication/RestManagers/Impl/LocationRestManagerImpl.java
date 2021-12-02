package com.group5.sep3.DataBaseCommunication.RestManagers.Impl;

import com.google.gson.reflect.TypeToken;
import com.group5.sep3.BusinessLogic.model.Location;
import com.group5.sep3.DataBaseCommunication.RestClientImpl;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;
import com.group5.sep3.util.JsonHelper;
import org.springframework.web.client.RestClientException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;

public class LocationRestManagerImpl implements RestManager<Location> {


	@Override
	public Location put(Location obj) throws RestClientException {
		String url = obj.getClass().getSimpleName();
		RestClientImpl.getInstance().put(url, obj);
		return obj;
	}

	@Override
	public Location post(Location obj) throws RestClientException {
		String url = obj.getClass().getSimpleName();
		return (Location) RestClientImpl.getInstance().post(url, obj);
	}

	@Override
	public Location get(Location obj) throws RestClientException {
		String url = obj.getClass().getSimpleName() + obj.getId();
		return (Location) RestClientImpl.getInstance().get(url);
	}

	@Override
	public Collection<Location> getAll() throws RestClientException {
		String restUrl = Location.class.getSimpleName();

		String jsonString = (String) RestClientImpl.getInstance().get(restUrl);

		Type type = new TypeToken<ArrayList<Location>>(){}.getType();
		ArrayList<Location> locations = JsonHelper.fromJson(jsonString, type);

		return locations;
	}

	@Override
	public Location delete(Location obj) throws RestClientException {
		String url = obj.getClass().getSimpleName();
		RestClientImpl.getInstance().delete(url);
		return obj;
	}
}
