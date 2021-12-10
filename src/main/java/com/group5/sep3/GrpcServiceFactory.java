package com.group5.sep3;

import com.group5.sep3.BusinessLogic.LogicModels.*;
import com.group5.sep3.GrpcCommunication.Services.*;
import com.group5.sep3.util.EntityTypes;
import com.group5.sep3.util.ProjectUtil;
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
		grpcMap.put(EntityTypes.INVENTORY, new InventoryService((InventoryModel) LogicModelFactory.getInstance().getLogicModel(EntityTypes.INVENTORY)));
		grpcMap.put(EntityTypes.ORDER, new OrderService((OrderModel) LogicModelFactory.getInstance().getLogicModel(EntityTypes.ORDER)));
		grpcMap.put(EntityTypes.USER, new UserService((UserModel) LogicModelFactory.getInstance().getLogicModel(EntityTypes.USER)));

		StringBuilder debug = new StringBuilder();
		for (EntityTypes key : grpcMap.keySet()) {
			debug.append("\n\t> ").append(key).append(" ").append(grpcMap.get(key).getClass().getSimpleName());
		}
		ProjectUtil.testPrint("Grpc service Implementations ("+ grpcMap.keySet().size()+"):" + debug);
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
