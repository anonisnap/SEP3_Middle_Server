package com.group5.sep3.DataBaseCommunication.RestManagers.Impl;

import com.google.gson.reflect.TypeToken;
import com.group5.sep3.BusinessLogic.model.Inventory;
import com.group5.sep3.DataBaseCommunication.RestClientImpl;
import com.group5.sep3.DataBaseCommunication.RestManagers.InventoryRestManager;
import com.group5.sep3.util.JsonHelper;
import com.group5.sep3.util.ProjectUtil;
import org.springframework.web.client.RestClientException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class InventoryRestManagerImpl implements InventoryRestManager {


	private final String ITEM_ID_URL = "/itemId/";
	private final String LOCATION_ID_URL = "/locationId/";
	private final String ALL_INVENTORY = "/all";
	private final String STOCK_INVENTORY = "/stock";

	@Override
	public Inventory create(Inventory obj) {
		String restUrl = obj.getClass().getSimpleName() + RestClientImpl.ADD_URL;
		String restResponse = (String) RestClientImpl.getInstance().post(restUrl, obj);

		return JsonHelper.fromJson(restResponse, Inventory.class);
	}

	@Override
	public Inventory update(Inventory obj) {
		String restUrl = obj.getClass().getSimpleName() + RestClientImpl.UPDATE_URL;
		String restResponse = (String) RestClientImpl.getInstance().post(restUrl, obj);

		return JsonHelper.fromJson(restResponse, Inventory.class);
	}

	@Override
	public Inventory get(int objId) {

		String restUrl = Inventory.class.getSimpleName() + "/" + objId;
		String restResponse = (String) RestClientImpl.getInstance().get(restUrl);

		return JsonHelper.fromJson(restResponse, Inventory.class);
	}

	@Override
	public ArrayList<Inventory> getAll() {
		String restUrl = Inventory.class.getSimpleName() + ALL_INVENTORY;

		String restResponse = (String) RestClientImpl.getInstance().get(restUrl);

		return (ArrayList<Inventory>) getItemLocationsFromResponse(restResponse);
	}

	@Override
	public boolean delete(int objId) {
		String restUrl = Inventory.class.getSimpleName() + "/" + objId;
		return RestClientImpl.getInstance().delete(restUrl);
	}

	@Override
	public List<Inventory> getByItemId(int obj) throws RestClientException {
		String restUrl = Inventory.class.getSimpleName() + ITEM_ID_URL + obj;
		String restResponse = (String) RestClientImpl.getInstance().get(restUrl);
		return getItemLocationsFromResponse(restResponse);
	}

	@Override
	public List<Inventory> getByLocationId(int obj) throws RestClientException {
		String restUrl = Inventory.class.getSimpleName() + LOCATION_ID_URL + obj;
		String restResponse = (String) RestClientImpl.getInstance().get(restUrl);
		return getItemLocationsFromResponse(restResponse);
	}

	@Override
	public List<Inventory> GetInventoryStock() throws RestClientException {
		String restUrl = Inventory.class.getSimpleName() + STOCK_INVENTORY;

		String restResponse = (String) RestClientImpl.getInstance().get(restUrl);

		return getItemLocationsFromResponse(restResponse);
	}

	private List<Inventory> getItemLocationsFromResponse(String restResponse) {
		Type type = new TypeToken<ArrayList<Inventory>>() {}.getType();
		return JsonHelper.fromJson(restResponse, type);
	}
}
