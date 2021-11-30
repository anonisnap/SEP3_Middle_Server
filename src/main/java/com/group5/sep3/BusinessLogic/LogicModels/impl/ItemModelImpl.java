package com.group5.sep3.BusinessLogic.LogicModels.impl;

import com.group5.sep3.BusinessLogic.LogicModels.ItemModel;
import com.group5.sep3.BusinessLogic.model.Item;
import com.group5.sep3.ClientCommunication.TransferObjects.RequestType;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;
import com.group5.sep3.RestManagerFactory;

import java.lang.reflect.Method;
import java.util.HashMap;

public class ItemModelImpl implements ItemModel {


	private final RestManager<Item> itemRestManager;

	private final HashMap<RequestType, Method> requestTypeMethodHashMap;

	public ItemModelImpl() {
		this.itemRestManager = (RestManager<Item>) RestManagerFactory.getInstance().getRestManager("Item");

		requestTypeMethodHashMap = new HashMap<>();
		try {
			requestTypeMethodHashMap.put(RequestType.PUT, this.getClass().getMethod("registerItem", Item.class));

		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void registerItem(Item item) {
		// if item has id ? check if already exist
		itemRestManager.put(item);
		//TODO: error handling


	}


	public void getItem(Item item) {
	}

	public void updateItem(Item item) {
	}

	public void removeItem(Item item) {
	}
}
