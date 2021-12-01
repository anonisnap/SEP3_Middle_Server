package com.group5.sep3.BusinessLogic.LogicModels.impl;

import com.group5.sep3.BusinessLogic.LogicModels.ItemModel;
import com.group5.sep3.BusinessLogic.model.Item;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;
import com.group5.sep3.RestManagerFactory;
import com.group5.sep3.util.EntityTypes;
import com.group5.sep3.util.ProjectUtil;

public class ItemModelImpl implements ItemModel {


	private final RestManager<Item> itemRestManager;

	public ItemModelImpl() {
		this.itemRestManager = (RestManager<Item>) RestManagerFactory.getInstance().getRestManager(EntityTypes.Item);

	}

	@Override
	public Item registerItem(Item item) {
		// if item has id ? check if already exist
		itemRestManager.put(item);
		//TODO: error handling
		return item;
	}


	public Item getItem(Item item) {
		Item tmp = itemRestManager.get(item);
		ProjectUtil.testPrint(tmp.getItemName());
		return tmp;
	}

	public Item updateItem(Item item) {
		return item;
	}

	public Item removeItem(Item item) {
		return item;
	}
}
