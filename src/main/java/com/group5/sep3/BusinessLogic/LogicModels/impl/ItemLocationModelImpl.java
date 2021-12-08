package com.group5.sep3.BusinessLogic.LogicModels.impl;

import com.group5.sep3.BusinessLogic.LogicModels.ItemLocationModel;
import com.group5.sep3.BusinessLogic.model.ItemLocation;
import com.group5.sep3.DataBaseCommunication.RestManagers.ItemLocationRestManager;
import org.springframework.web.client.RestClientException;

import java.util.Collection;
import java.util.List;

public class ItemLocationModelImpl implements ItemLocationModel {
	private final ItemLocationRestManager itemLocationRestManager;

	public ItemLocationModelImpl(ItemLocationRestManager itemLocationRestManager) {
		this.itemLocationRestManager = itemLocationRestManager;
	}

	@Override
	public ItemLocation register(ItemLocation itemLocation) throws Exception {
		return itemLocationRestManager.put(itemLocation);
/*
//TODO: Create ItemLocation -- Exception
   try (return itemLocationRestManager.put(itemLocation);)
    Catch { return update(itemLocation); } // VI MANGLER ET ID på ItemLocation FAURAKSDKASKDHUEFQHUWEIFh;((((

		//Check if item + location exists in database already
		ItemLocation tmp = get(itemLocation);
		if(tmp == null)
			return itemLocationRestManager.put(itemLocation);
		else {
			tmp.setAmount(tmp.getAmount()+itemLocation.getAmount());
			return update(tmp);
		}
*/	}

	@Override
	public ItemLocation update(ItemLocation itemLocation) throws Exception {
		//Generating Dummy Object to use:
		ItemLocation tmpItemLocation = itemLocation;

		//Amount from Location moving from:
		int oldLocationAmount = get(itemLocation).getAmount();

		//Get Amount for If statements
		int amountToMove = itemLocation.getAmount();

		//Grabbing list of itemLocations with current Location from ItemLocation
		List<ItemLocation> itemLocations = getByLocationId(itemLocation);
		//If List contains item with same itemId, then add this amount to that.

		for (ItemLocation itemLoc: itemLocations) {
			if(itemLoc.getItem().getId() == itemLocation.getItem().getId())
			{
				System.out.println("Inside If");
				System.out.println(itemLoc);
				int amountCurrentlyOnLocation = itemLoc.getAmount();

				itemLocation.setAmount(amountCurrentlyOnLocation+amountToMove);
				itemLocation.setId(itemLoc.getId());

				if(amountToMove<oldLocationAmount) {
					System.out.println("Total amount is bigger than moved - 2");

					tmpItemLocation.setAmount(oldLocationAmount - amountToMove);
					itemLocationRestManager.post(tmpItemLocation);

					return itemLocationRestManager.post(itemLocation);
				}

				return itemLocationRestManager.post(itemLocation);
			}
			System.out.println("Outside If");
			System.out.println(itemLoc);
		}
		System.out.println("Outside for loop");
		//Check if location already has items first, if so add amount to old amount



		if(amountToMove<oldLocationAmount)
		{
			System.out.println("Total amount is bigger than moved - 1");
			tmpItemLocation.setId(0);
			tmpItemLocation.setAmount(oldLocationAmount-amountToMove);
			itemLocationRestManager.put(tmpItemLocation);
			return itemLocationRestManager.post(itemLocation);
		}


		System.out.println("Total amount is same as moved");
		return itemLocationRestManager.post(itemLocation);
	}

	@Override
	public Collection<ItemLocation> getAll() throws Exception {
		return itemLocationRestManager.getAll();
	}

	@Override
	public ItemLocation get(ItemLocation itemLocation) throws Exception {
		return itemLocationRestManager.get(itemLocation);
	}

	@Override
	public ItemLocation remove(ItemLocation itemLocation) throws Exception {
		return itemLocationRestManager.delete(itemLocation);
	}

	// TODO: Mangler der ikke PROTO filer for disse?
	@Override
	public List<ItemLocation> getByItemId(ItemLocation obj) throws RestClientException {
		return itemLocationRestManager.getByItemId(obj);
	}

	@Override
	public List<ItemLocation> getByLocationId(ItemLocation itemLocation) throws RestClientException {
		return itemLocationRestManager.getByLocationId(itemLocation);
	}

}
