package com.group5.sep3.BusinessLogic.LogicModels.impl;

import com.group5.sep3.BusinessLogic.LogicModels.LocationModel;
import com.group5.sep3.BusinessLogic.model.Location;
import com.group5.sep3.ClientCommunication.TransferObjects.Request;
import com.group5.sep3.ClientCommunication.TransferObjects.RequestType;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;
import com.group5.sep3.RestManagerFactory;
import com.group5.sep3.util.ProjectUtil;

import java.beans.PropertyChangeListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class LocationModelImpl implements LocationModel {
	private RestManager<Location> locationRestManager;
	private Map<RequestType, Method> requestTypeMethodMap;

	public LocationModelImpl() {
		locationRestManager = (RestManager<Location>) RestManagerFactory.getInstance().getRestManager("location");
		requestTypeMethodMap = new HashMap<>();
		try {
			requestTypeMethodMap.put(RequestType.PUT, this.getClass().getDeclaredMethod("registerLocation", Location.class));
			requestTypeMethodMap.put(RequestType.POST, this.getClass().getDeclaredMethod("updateLocation", Location.class));
			requestTypeMethodMap.put(RequestType.GET, this.getClass().getDeclaredMethod("getLocation", Location.class));
			requestTypeMethodMap.put(RequestType.DELETE, this.getClass().getDeclaredMethod("removeLocation", Location.class));
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}

	public Location registerLocation(Location location) { // TODO: Implement
		String locId = location.getId();

		if (locId.matches("\\b\\w\\d+")) // Eg: b4587
		{
			registerFullySpecifiedLocation(locId, location);
		} else if (locId.matches("\\b\\w")) // Eg: b
		{
			registerLetterSpecifiedLocation(locId, location);
		} else {
			ProjectUtil.testPrint(locId);
		}
		// Check Valid Location Identifier
		// If Identifier has numbers -> Go to 1
		// Else -> Go to 2
		// 1:
		// Check if Location exists
		// If location Exists -> Increment Location

		// 2:
		// Check highest current location
		// Increment and Register


		return null;
	}


	private boolean registerFullySpecifiedLocation(String locId, Location location) {
		Location existing = locationRestManager.get(location);

		return true;
	}

	private boolean registerLetterSpecifiedLocation(String locId, Location location) {

		return true;
	}

	public Location updateLocation(Location location) {


		return null;
	}

	public Location getLocation(Location location) {


		return null;
	}

	public Location removeLocation(Location location) {


		return null;
	}

	@Override
	public void handleRequest(Request request) {
		try {
			Location loc = request.getArg(Location.class);
			requestTypeMethodMap.get(request.getType()).invoke(this, loc);
			;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addListener(String name, PropertyChangeListener listener) {

	}

	@Override
	public void addListener(PropertyChangeListener listener) {

	}

	@Override
	public void removeListener(String name, PropertyChangeListener listener) {

	}

	@Override
	public void removeListener(PropertyChangeListener listener) {

	}
}
