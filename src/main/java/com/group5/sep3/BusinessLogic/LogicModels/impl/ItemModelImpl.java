package com.group5.sep3.BusinessLogic.LogicModels.impl;

import com.group5.sep3.BusinessLogic.LogicModels.ItemModel;
import com.group5.sep3.BusinessLogic.model.Item;
import com.group5.sep3.ClientCommunication.TransferObjects.RequestType;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;
import com.group5.sep3.RestManagerFactory;
import com.group5.sep3.util.EntityTypes;

import java.lang.reflect.Method;
import java.util.HashMap;

public class ItemModelImpl implements ItemModel {


	private final RestManager<Item> itemRestManager;

	public ItemModelImpl() {
		this.itemRestManager = (RestManager<Item>) RestManagerFactory.getInstance().getRestManager(EntityTypes.Item);

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
