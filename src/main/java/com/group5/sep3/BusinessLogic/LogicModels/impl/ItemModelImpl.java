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
		Item tmp = itemRestManager.put(entity);
		//TODO: error handling
		return tmp;
	}

	@Override
	public Item update(Item entity) {
		Item tmp = itemRestManager.post(entity);
		//TODO: error handling
		return tmp;
	}

	@Override
	public List<Item> getAll() {
		return itemRestManager.getAll();
	}

	@Override
	public Item get(Item entity) {
		Item tmp = itemRestManager.get(entity);
		//TODO: error handling
		return tmp;
	}

	@Override
	public Item remove(Item entity) {
		Item tmp = itemRestManager.delete(entity);
		//TODO: error handling
		return tmp;
	}
}