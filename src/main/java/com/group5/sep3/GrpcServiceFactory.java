package com.group5.sep3;

import com.group5.sep3.BusinessLogic.LogicModels.ItemLocationModel;
import com.group5.sep3.BusinessLogic.LogicModels.ItemModel;
import com.group5.sep3.BusinessLogic.LogicModels.LocationModel;
import com.group5.sep3.BusinessLogic.LogicModels.UserModel;
import com.group5.sep3.GrpcCommunication.Services.ItemLocationService;
import com.group5.sep3.GrpcCommunication.Services.ItemService;
import com.group5.sep3.GrpcCommunication.Services.LocationService;
import com.group5.sep3.GrpcCommunication.Services.UserService;
import com.group5.sep3.util.EntityTypes;
import io.grpc.BindableService;

import java.util.HashMap;
import java.util.Map;

public class GrpcServiceFactory {
	private static GrpcServiceFactory instance;
	private Map<EntityTypes, BindableService> grpcMap;

	private GrpcServiceFactory() {
		grpcMap = new HashMap<>();
		grpcMap.put(EntityTypes.ITEM, new ItemService((ItemModel) LogicModelFactory.getInstance().getLogicModel(EntityTypes.ITEM)));
		grpcMap.put(EntityTypes.LOCATION, new LocationService((LocationModel) LogicModelFactory.getInstance().getLogicModel(EntityTypes.LOCATION)));
		grpcMap.put(EntityTypes.ITEMLOCATION, new ItemLocationService((ItemLocationModel) LogicModelFactory.getInstance().getLogicModel(EntityTypes.ITEMLOCATION)));
		grpcMap.put(EntityTypes.USER, new UserService((UserModel) LogicModelFactory.getInstance().getLogicModel(EntityTypes.USER)));
	}

	public static GrpcServiceFactory getInstance() {
		if (instance == null) {
			instance = new GrpcServiceFactory();
		}
		return instance;
	}

	public Object getGrpcClient(String itemType) {
		return grpcMap.get(EntityTypes.valueOf(itemType));
	}

	public Map<EntityTypes, BindableService> allClients() {
		return grpcMap;
	}
}
