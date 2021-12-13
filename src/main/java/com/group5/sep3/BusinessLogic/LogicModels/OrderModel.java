package com.group5.sep3.BusinessLogic.LogicModels;

import com.group5.sep3.BusinessLogic.model.Inventory;
import com.group5.sep3.BusinessLogic.model.Order;

import java.util.List;


public interface OrderModel extends EntityLogicModel<Order> {

    boolean processOrder(Order order, List<Inventory> pickInventories) throws Exception;

}
