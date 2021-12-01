package com.group5.sep3.BusinessLogic.LogicModels.impl;

import com.group5.sep3.BusinessLogic.LogicModels.ItemModel;
import com.group5.sep3.BusinessLogic.model.Item;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;
import com.group5.sep3.RestManagerFactory;
import com.group5.sep3.util.EntityTypes;
import com.group5.sep3.util.ProjectUtil;

import java.util.Collection;

public class ItemModelImpl implements ItemModel {


	private final RestManager<Item> itemRestManager;

	public ItemModelImpl() {
		this.itemRestManager = (RestManager<Item>) RestManagerFactory.getInstance().getRestManager(EntityTypes.Item);

	}

	@Override
	public Item register(Item entity)  {
		itemRestManager.put(entity);
		//TODO: error handling
		return entity;
	}

	@Override
	public Item update(Item entity) {
		return null;
	}

	@Override
	public Collection<Item> getAll() {
		return itemRestManager.getAll();
	}

	@Override
	public Item get(Item entity) {
		Item tmp = itemRestManager.get(entity);
		ProjectUtil.testPrint(tmp.getItemName());
		return tmp;
	}

	@Override
	public Item remove(Item entity){
		return null;
	}


}
