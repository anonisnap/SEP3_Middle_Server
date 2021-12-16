package com.group5.sep3;

import com.group5.sep3.BusinessLogic.LogicModels.LogicModel;
import com.group5.sep3.BusinessLogic.LogicModels.impl.*;
import com.group5.sep3.BusinessLogic.model.Item;
import com.group5.sep3.BusinessLogic.model.Location;
import com.group5.sep3.BusinessLogic.model.Order;
import com.group5.sep3.DataBaseCommunication.RestManagers.InventoryRestManager;
import com.group5.sep3.DataBaseCommunication.RestManagers.OrderRestManager;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;
import com.group5.sep3.DataBaseCommunication.RestManagers.UserRestManager;
import com.group5.sep3.util.EntityTypes;
import com.group5.sep3.util.ProjectUtil;

import java.util.HashMap;
import java.util.Map;

public class LogicModelFactory {


	public static LogicModelFactory instance;

	private HashMap<EntityTypes, LogicModel> modelMap;

	private LogicModelFactory() {
		modelMap = new HashMap<>();

		modelMap.put(EntityTypes.ITEM, new ItemModelImpl((RestManager<Item>) RestManagerFactory.getInstance().getRestManager(EntityTypes.ITEM)));
		modelMap.put(EntityTypes.LOCATION, new LocationModelImpl((RestManager<Location>) RestManagerFactory.getInstance().getRestManager(EntityTypes.LOCATION)));
		modelMap.put(EntityTypes.INVENTORY, new InventoryModelImpl((InventoryRestManager) RestManagerFactory.getInstance().getRestManager(EntityTypes.INVENTORY)));
		modelMap.put(EntityTypes.ORDER, new OrderModelImpl((OrderRestManager) RestManagerFactory.getInstance().getRestManager(EntityTypes.ORDER)));
		modelMap.put(EntityTypes.USER, new UserModelImpl((UserRestManager) RestManagerFactory.getInstance().getRestManager(EntityTypes.USER)));

		StringBuilder debug = new StringBuilder();
		for (EntityTypes key : modelMap.keySet()) {
			debug.append("\n\t> ").append(key).append(" ").append(modelMap.get(key).getClass().getSimpleName());
		}
		ProjectUtil.testPrint("logic model Implementations ("+ modelMap.keySet().size()+"): " + debug);

	}

	public static LogicModelFactory getInstance() {
		if (instance == null) {
			instance = new LogicModelFactory();
		}
		return instance;
	}


	public Map<EntityTypes, LogicModel> getAll() {
		return Map.copyOf(modelMap);
	}

	public LogicModel getLogicModel(EntityTypes type) {
		return modelMap.get(type);
	}

}

