package com.group5.sep3.DataBaseCommunication.RestManagers.Impl;

import com.google.gson.reflect.TypeToken;
import com.group5.sep3.BusinessLogic.model.Order;
import com.group5.sep3.BusinessLogic.model.OrderEntry;
import com.group5.sep3.DataBaseCommunication.RestClientImpl;
import com.group5.sep3.DataBaseCommunication.RestManagers.OrderRestManager;
import com.group5.sep3.util.JsonHelper;
import com.group5.sep3.util.ProjectUtil;
import org.springframework.web.client.RestClientException;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class OrderRestManagerImpl implements OrderRestManager {

    public static final String LATEST_ORDER_NUMBER = "/latestOrderNumber";

    @Override
    public Order create(Order order) throws RestClientException {
        String restUrl = order.getClass().getSimpleName() + RestClientImpl.ADD_URL;
        String restRespone = (String) RestClientImpl.getInstance().post(restUrl, order);
        return JsonHelper.fromJson(restRespone, Order.class);
    }

    @Override
    public Order update(Order order) throws RestClientException {


        String restUrl = order.getClass().getSimpleName() + RestClientImpl.UPDATE_URL;
        String restRespone = (String) RestClientImpl.getInstance().post(restUrl, order);
        return JsonHelper.fromJson(restRespone, Order.class);

    }

    @Override
    public Order get(int order) throws RestClientException {
        String restUrl = Order.class.getSimpleName() + "/" + order;
        String restResponse = (String) RestClientImpl.getInstance().get(restUrl);
        return JsonHelper.fromJson(restResponse, Order.class);
    }

    @Override
    public ArrayList<Order> getAll() throws RestClientException {
        String restUrl = Order.class.getSimpleName();

        String jsonString = (String) RestClientImpl.getInstance().get(restUrl);

        Type type = new TypeToken<ArrayList<Order>>() {
        }.getType();

        return JsonHelper.fromJson(jsonString, type);
    }

    @Override
    public boolean delete(int order) throws RestClientException {
        String restUrl = Order.class.getSimpleName() + "/" + order;

        return RestClientImpl.getInstance().delete(restUrl);
    }

    @Override
    public int getLatestOrderNumber() {
        String restUrl = Order.class.getSimpleName() + LATEST_ORDER_NUMBER;

        String jsonString = (String) RestClientImpl.getInstance().get(restUrl);

        return JsonHelper.fromJson(jsonString, Integer.class);
    }
}
