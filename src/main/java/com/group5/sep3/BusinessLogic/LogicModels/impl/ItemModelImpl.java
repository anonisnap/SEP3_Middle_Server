package com.group5.sep3.BusinessLogic.LogicModels.impl;

import com.group5.sep3.BusinessLogic.LogicModels.ItemModel;
import com.group5.sep3.BusinessLogic.model.Item;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;

import java.util.List;

public class ItemModelImpl implements ItemModel {

	private final RestManager<Item> itemRestManager;

	public ItemModelImpl(RestManager<Item> itemRestManager) {

		this.itemRestManager = itemRestManager;
	}

	@Override
	public Item register(Item entity) {
		Item tmp = itemRestManager.create(entity);
		//TODO: error handling
		return tmp;
	}

	@Override
	public Item update(Item entity) {
		Item tmp = itemRestManager.update(entity);
		//TODO: error handling
		return tmp;
	}

	@Override
	public List<Item> getAll() {
		return itemRestManager.getAll();
	}

	@Override
	public Item get(int entityId) {
		Item tmp = itemRestManager.get(entityId);
		//TODO: error handling
		return tmp;
	}

	@Override
	public boolean remove(int entityId) {
		return itemRestManager.delete(entityId);
		//TODO: error handling

	}
}