package com.group5.sep3.BusinessLogic.LogicModels.impl;

import com.group5.sep3.BusinessLogic.LogicModels.ItemLocationModel;
import com.group5.sep3.BusinessLogic.model.ItemLocation;
import com.group5.sep3.DataBaseCommunication.RestManagers.ItemLocationRestManager;
import com.group5.sep3.RestManagerFactory;
import com.group5.sep3.util.EntityTypes;
import com.group5.sep3.util.ProjectUtil;
import org.springframework.web.client.RestClientException;

import java.util.Collection;
import java.util.List;

public class ItemLocationModelImpl implements ItemLocationModel {
	private final ItemLocationRestManager itemLocationRestManager;

	public ItemLocationModelImpl() {
		this.itemLocationRestManager = (ItemLocationRestManager) RestManagerFactory.getInstance().getRestManager(EntityTypes.ItemLocation);
	}

	@Override
	public ItemLocation register(ItemLocation itemLocation) throws Exception {
		return itemLocationRestManager.put(itemLocation);
	}

	@Override
	public ItemLocation update(ItemLocation itemLocation) throws Exception {
		return itemLocationRestManager.post(itemLocation);
	}

	@Override
	public Collection<ItemLocation> getAll() throws Exception {
		return itemLocationRestManager.getAll();
	}

	@Override
	public ItemLocation get(ItemLocation itemLocation) throws Exception {
		ProjectUtil.notImplemented();
		return null;
	}

	@Override
	public ItemLocation remove(ItemLocation itemLocation) throws Exception {
		return null;
	}

	@Override
	public List<ItemLocation> getByItemId(ItemLocation obj) throws RestClientException {
		return itemLocationRestManager.getByItemId(obj);
	}

	@Override
	public List<ItemLocation> getByLocationId(ItemLocation itemLocation) throws RestClientException {
		return itemLocationRestManager.getByLocationId(itemLocation);
	}

}
