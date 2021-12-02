package com.group5.sep3;

import com.group5.sep3.BusinessLogic.LogicModels.LogicModel;
import com.group5.sep3.BusinessLogic.LogicModels.impl.ItemLocationModelImpl;
import com.group5.sep3.BusinessLogic.LogicModels.impl.ItemModelImpl;
import com.group5.sep3.BusinessLogic.LogicModels.impl.LocationModelImpl;
import com.group5.sep3.util.EntityTypes;
import com.group5.sep3.util.ProjectUtil;

import java.util.HashMap;
import java.util.Map;

public class LogicModelFactory {


	public static LogicModelFactory instance;

	private HashMap<EntityTypes, LogicModel> modelMap;

	private LogicModelFactory() {
		ProjectUtil.testPrint("+ New Logic Model Factory");
		modelMap = new HashMap<>();

		modelMap.put(EntityTypes.Item, new ItemModelImpl());
		modelMap.put(EntityTypes.Location, new LocationModelImpl());
		modelMap.put(EntityTypes.ItemLocation, new ItemLocationModelImpl());

	}

	public static LogicModelFactory getInstance() {
		if (instance == null) {
			instance = new LogicModelFactory();
		}
		ProjectUtil.testPrint("> Accessing Logic Model Factory");
		return instance;
	}


	public Map<EntityTypes, LogicModel> getAll() {
		return Map.copyOf(modelMap);
	}

	public LogicModel getLogicModel(EntityTypes type) {
		return modelMap.get(type);
	}


}

