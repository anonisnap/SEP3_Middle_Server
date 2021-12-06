package com.group5.sep3.BusinessLogic.LogicModels.impl;

import com.group5.sep3.BusinessLogic.LogicModels.LocationModel;
import com.group5.sep3.BusinessLogic.model.Location;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;
import com.group5.sep3.RestManagerFactory;
import com.group5.sep3.util.EntityTypes;

import java.util.Collection;
import java.util.List;

public class LocationModelImpl implements LocationModel {
	private final RestManager<Location> locationRestManager;

	public LocationModelImpl() {
		locationRestManager = (RestManager<Location>) RestManagerFactory.getInstance().getRestManager(EntityTypes.Location);
	}

	@Override
	public Location register(Location entity) {
		Location tmp = locationRestManager.put(entity);
		//TODO: error handling
		return tmp;
	}

	@Override
	public Location update(Location entity) {
		Location tmp = locationRestManager.post(entity);
		//TODO: error handling
		return tmp;
	}

	@Override
	public List<Location> getAll() {
		return locationRestManager.getAll();
	}

	@Override
	public Location get(Location entity) {
		Location tmp = locationRestManager.get(entity);
		//TODO: error handling
		return tmp;
	}

	@Override
	public Location remove(Location entity) {
		Location tmp = locationRestManager.delete(entity);
		//TODO: error handling
		return tmp;
	}
}