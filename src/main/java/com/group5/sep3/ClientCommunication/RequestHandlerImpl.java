package com.group5.sep3.ClientCommunication;

import com.group5.sep3.BusinessLogic.LogicModels.LogicModel;
import com.group5.sep3.BusinessLogic.LogicModels.impl.ItemModelImpl;
import com.group5.sep3.BusinessLogic.LogicModels.impl.LocationModelImpl;
import com.group5.sep3.BusinessLogic.model.Item;
import com.group5.sep3.BusinessLogic.model.Location;
import com.group5.sep3.ClientCommunication.TransferObjects.Request;
import com.group5.sep3.ClientCommunication.TransferObjects.RequestType;
import com.group5.sep3.LogicModelFactory;
import com.group5.sep3.util.ProjectUtil;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashMap;

public class RequestHandlerImpl implements RequestHandler, PropertyChangeListener {

	PropertyChangeListener propertyChangeListener;

	private HashMap<String, LogicModel> requestHandlerMap;


	public RequestHandlerImpl() {
		requestHandlerMap = new HashMap<>();
		requestHandlerMap.putAll(LogicModelFactory.getInstance().getAll());
	}

	@Override
	public void handleRequest(Request request) throws Exception {
		String objectClassName = request.getClassName();
		ProjectUtil.testPrint("Request Class: " + objectClassName + "\nRequest Handler Keys: " + requestHandlerMap.keySet());

			switch (objectClassName.toLowerCase()) {
				case "item" -> handleItem(request.getType(), request.getArg(Item.class));
				case "location" -> handleLocation(request.getType(), request.getArg(Location.class));
			}

	}

	private void handleItem(RequestType requestType, Item item) throws Exception {
		ItemModelImpl model = (ItemModelImpl) requestHandlerMap.get("Item");
		switch (requestType) {
			case GET -> model.getItem(item);
			case PUT -> model.registerItem(item);
			case POST -> model.updateItem(item);
			case DELETE -> model.removeItem(item);
		}
	}

	private void handleLocation(RequestType requestType, Location loc) throws Exception {
		LocationModelImpl model = (LocationModelImpl) requestHandlerMap.get("Location");
		switch (requestType) {
			case GET -> model.getLocation(loc);
			case PUT -> model.registerLocation(loc);
			case POST -> model.updateLocation(loc);
			case DELETE -> model.removeLocation(loc);
		}
	}


	@Override
	public void addListener(String name, PropertyChangeListener listener) {
		ProjectUtil.notImplemented();
	}

	@Override
	public void addListener(PropertyChangeListener listener) {
		this.propertyChangeListener = listener;
	}

	@Override
	public void removeListener(String name, PropertyChangeListener listener) {
		ProjectUtil.notImplemented();
	}

	@Override
	public void removeListener(PropertyChangeListener listener) {
		ProjectUtil.notImplemented();
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		ProjectUtil.notImplemented();
	}
}
