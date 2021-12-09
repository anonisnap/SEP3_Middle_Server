package com.group5.sep3.DataBaseCommunication.RestManagers.Impl;

import com.google.gson.reflect.TypeToken;
import com.group5.sep3.BusinessLogic.model.ItemLocation;
import com.group5.sep3.DataBaseCommunication.RestClientImpl;
import com.group5.sep3.DataBaseCommunication.RestManagers.ItemLocationRestManager;
import com.group5.sep3.util.JsonHelper;
import com.group5.sep3.util.ProjectUtil;
import org.springframework.web.client.RestClientException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ItemLocationRestManagerImpl implements ItemLocationRestManager {

	private final String ITEM_ID_URL = "/itemId/";
	private final String LOCATION_ID_URL = "/locationId/";

	@Override
	public ItemLocation create(ItemLocation obj) {
		String restUrl = obj.getClass().getSimpleName() + RestClientImpl.ADD_URL;
		String restResponse = (String) RestClientImpl.getInstance().post(restUrl, obj);

		return JsonHelper.fromJson(restResponse, ItemLocation.class);
	}

	@Override
	public ItemLocation update(ItemLocation obj) {
		String restUrl = obj.getClass().getSimpleName() + RestClientImpl.UPDATE_URL;
		String restResponse = (String) RestClientImpl.getInstance().post(restUrl, obj);

		return JsonHelper.fromJson(restResponse, ItemLocation.class);
	}

	@Override
	public ItemLocation get(int objId) {
ProjectUtil.testPrint("ItemLocation ID: " + objId);
		String restUrl = ItemLocation.class.getSimpleName() + "/" + objId;
		String restResponse = (String) RestClientImpl.getInstance().get(restUrl);

		return JsonHelper.fromJson(restResponse, ItemLocation.class);
	}

	@Override
	public List<ItemLocation> getAll() {
		String restUrl = ItemLocation.class.getSimpleName();

		String restResponse = (String) RestClientImpl.getInstance().get(restUrl);

		return getItemLocationsFromResponse(restResponse);
	}

	@Override
	public boolean delete(int objId) {
		String restUrl = ItemLocation.class.getSimpleName() + "/" + objId;
		return RestClientImpl.getInstance().delete(restUrl);
	}

	@Override
	public List<ItemLocation> getByItemId(int obj) throws RestClientException {
		String restUrl = ItemLocation.class.getSimpleName() + ITEM_ID_URL + obj;
		String restResponse = (String) RestClientImpl.getInstance().get(restUrl);
		return getItemLocationsFromResponse(restResponse);
	}

	@Override
	public List<ItemLocation> getByLocationId(int obj) throws RestClientException {
		String restUrl = ItemLocation.class.getSimpleName() + LOCATION_ID_URL + obj;
		String restResponse = (String) RestClientImpl.getInstance().get(restUrl);
		return getItemLocationsFromResponse(restResponse);
	}

	private List<ItemLocation> getItemLocationsFromResponse(String restResponse) {
		Type type = new TypeToken<ArrayList<ItemLocation>>() {}.getType();
		return JsonHelper.fromJson(restResponse, type);
	}
}
