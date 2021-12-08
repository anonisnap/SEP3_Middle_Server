package com.group5.sep3.DataBaseCommunication.RestManagers.Impl;

import com.google.gson.reflect.TypeToken;
import com.group5.sep3.BusinessLogic.model.Order;
import com.group5.sep3.DataBaseCommunication.RestClientImpl;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;
import com.group5.sep3.util.JsonHelper;
import org.springframework.web.client.RestClientException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class OrderRestManagerImpl implements RestManager<Order> {

    @Override
    public Order put(Order order) throws RestClientException {
        String restUrl = order.getClass().getSimpleName();
        String restRespone = (String) RestClientImpl.getInstance().put(restUrl,order);
        return JsonHelper.fromJson(restRespone, Order.class);
    }

    @Override
    public Order post(Order order) throws RestClientException {
        String restUrl = order.getClass().getSimpleName();
        String restRespone = (String) RestClientImpl.getInstance().put(restUrl,order);
        return JsonHelper.fromJson(restRespone, Order.class);
    }

    @Override
    public Order get(Order order) throws RestClientException {
        String restUrl = order.getClass().getSimpleName() + "/" + order.getId();
        String restResponse = (String) RestClientImpl.getInstance().get(restUrl);
        return JsonHelper.fromJson(restResponse, Order.class);
    }

    @Override
    public List<Order> getAll() throws RestClientException {
        String restUrl = Order.class.getSimpleName();

        String jsonString = (String) RestClientImpl.getInstance().get(restUrl);

        Type type = new TypeToken<ArrayList<Order>>() {
        }.getType();

        return JsonHelper.fromJson(jsonString, type);
    }

    @Override
    public Order delete(Order order) throws RestClientException {
        String restUrl = Order.class.getSimpleName() + "/" + order.getId();

        return RestClientImpl.getInstance().delete(restUrl) ? order : null;
    }

}
