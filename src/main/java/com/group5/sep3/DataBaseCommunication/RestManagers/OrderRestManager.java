package com.group5.sep3.DataBaseCommunication.RestManagers;

import com.group5.sep3.BusinessLogic.model.Order;

public interface OrderRestManager extends RestManager<Order> {

    public int getLatestOrderNumber();


}
