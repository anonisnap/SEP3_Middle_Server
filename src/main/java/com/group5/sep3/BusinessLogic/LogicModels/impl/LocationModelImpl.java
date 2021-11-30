package com.group5.sep3.BusinessLogic.LogicModels.impl;

import com.group5.sep3.BusinessLogic.LogicModels.LocationModel;
import com.group5.sep3.BusinessLogic.model.Location;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;
import com.group5.sep3.RestManagerFactory;
import com.group5.sep3.util.EntityTypes;
import com.group5.sep3.util.ProjectUtil;
import org.springframework.web.client.RestClientException;

import java.util.Collection;

public class LocationModelImpl implements LocationModel {
	private final RestManager<Location> locationRestManager;

	public LocationModelImpl() {
		locationRestManager = (RestManager<Location>) RestManagerFactory.getInstance().getRestManager(EntityTypes.Location);
	}

	@Override
	public Location registerLocation(Location location) { // TODO: Implement
		try {
			return locationRestManager.put(location);
		} catch (RestClientException e) {
			ProjectUtil.testPrint(e.getMessage());
			throw e;
		}
	}

	@Override
	public Location updateLocation(Location location) {
		return locationRestManager.post(location);
	}

	@Override
	public Collection<Location> getAll(Location location) {
		return locationRestManager.getAll(location);
	}

	@Override
	public Location getLocation(Location location) {
		return locationRestManager.get(location);
	}

	@Override
	public Location removeLocation(Location location) {
		return locationRestManager.delete(location);
	}

}