package com.group5.sep3;

import com.group5.sep3.BusinessLogic.LogicModels.ItemLocationModel;
import com.group5.sep3.BusinessLogic.LogicModels.ItemModel;
import com.group5.sep3.BusinessLogic.LogicModels.LocationModel;
import com.group5.sep3.GrpcCommunication.Services.ItemLocationService;
import com.group5.sep3.GrpcCommunication.Services.ItemService;
import com.group5.sep3.GrpcCommunication.Services.LocationService;
import com.group5.sep3.util.EntityTypes;
import io.grpc.BindableService;

import java.util.HashMap;
import java.util.Map;

public class GrpcServiceFactory {
	private static GrpcServiceFactory instance;
	private Map<EntityTypes, BindableService> grpcMap;

	private GrpcServiceFactory() {
		grpcMap = new HashMap<>();
		grpcMap.put(EntityTypes.Item, new ItemService((ItemModel) LogicModelFactory.getInstance().getLogicModel(EntityTypes.Item)));
		grpcMap.put(EntityTypes.Location, new LocationService((LocationModel) LogicModelFactory.getInstance().getLogicModel(EntityTypes.Location)));
		grpcMap.put(EntityTypes.ItemLocation, new ItemLocationService((ItemLocationModel) LogicModelFactory.getInstance().getLogicModel(EntityTypes.ItemLocation)));
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
