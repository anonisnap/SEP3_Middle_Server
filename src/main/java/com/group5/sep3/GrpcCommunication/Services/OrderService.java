package com.group5.sep3.GrpcCommunication.Services;

import Protos.ProtoUtil.*;
import com.group5.sep3.BusinessLogic.LogicModels.OrderModel;
import com.group5.sep3.BusinessLogic.model.Order;
import com.group5.sep3.BusinessLogic.model.OrderEntry;
import com.group5.sep3.util.ProjectUtil;
import io.grpc.stub.StreamObserver;
import protos.OrderServiceGrpc.*;
import protos.OrderServiceOuterClass.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class OrderService extends OrderServiceImplBase {
    OrderModel orderModel;

    public OrderService(OrderModel orderModel) {
        this.orderModel = orderModel;

    }

    @Override
    public void registerOrder(gOrder request, StreamObserver<gOrder> responseObserver) {
        Order order = convertToOrder(request);

        try {
            Order result = orderModel.register(order);

            gOrder gResult = ConvertToGOrder(result);

            responseObserver.onNext(gResult);
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void getOrder(gOrderId request, StreamObserver<gOrder> responseObserver) {
        int orderId = request.getOrderId();

        try {
            Order result = orderModel.get(orderId);

            gOrder gResult = ConvertToGOrder(result);
            responseObserver.onNext(gResult);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(new Throwable("Could not get order"));
            e.printStackTrace();
        }


    }

    @Override
    public void getAllOrders(gOrder request, StreamObserver<gOrderList> responseObserver) {

        try {
            Collection<Order> orders = orderModel.getAll();

            List<gOrder> gOrders = new ArrayList<>();

            for (Order order : orders) {
                gOrders.add(ConvertToGOrder(order));
            }

            gOrderList returnOrderList = gOrderList.newBuilder().addAllOrders(gOrders).build();

            responseObserver.onNext(returnOrderList);
            responseObserver.onCompleted();

        } catch (Exception e) {
            responseObserver.onError(new Throwable("Could not get orders"));
            e.printStackTrace();
        }

    }

    @Override
    public void updateOrder(gOrder request, StreamObserver<gOrder> responseObserver) {
        Order orderToUpdate = convertToOrder(request);
        try {
            Order result = orderModel.update(orderToUpdate);

            gOrder gOrder = ConvertToGOrder(result);

            responseObserver.onNext(gOrder);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(new Throwable("could not update order"));
            e.printStackTrace();
        }

    }

    @Override
    public void removeOrder(gOrderId request, StreamObserver<gBoolValue> responseObserver) {
        ProjectUtil.notImplemented();
    }

    private Order convertToOrder(gOrder request) {
        Order order = new Order(request.getOrderNumber());
        order.setOrderNumber(request.getOrderNumber());
        order.setId(request.getId());

        ArrayList<OrderEntry> orderEntries = new ArrayList<>();

        for (gOrderEntry gOrderEntry : request.getOrderEntriesList()) {

            OrderEntry orderEntry =
                    new OrderEntry(gOrderEntry.getOrderId(),gOrderEntry.getAmount(),gOrderEntry.getItemId());

            orderEntries.add(orderEntry);
        }

        order.setOrderEntries(orderEntries);
        ProjectUtil.testPrint(order.toString());
        return order;

    }

    private gOrder ConvertToGOrder(Order order) {
        // list for generated gOrder entries
        ArrayList<gOrderEntry> gOrderEntries = new ArrayList<>();


        for (OrderEntry orderEntry : order.getOrderEntries()) {
            // building ever gOrder entry from order entry
            gOrderEntry buildGOrderEntry = gOrderEntry
                    .newBuilder()
                    .setOrderId(orderEntry.getOrderId())
                    .setAmount(orderEntry.getAmount())
                    .setItemId(orderEntry.getItemId()).build();
            // add to list
            gOrderEntries.add(buildGOrderEntry);
        }
        //
        // build order and return
        return gOrder.newBuilder()
                .setId(order.getId())
                .addAllOrderEntries(gOrderEntries)
                .setOrderNumber(order.getOrderNumber()).build();
    }

}
