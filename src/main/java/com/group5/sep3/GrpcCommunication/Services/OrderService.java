package com.group5.sep3.GrpcCommunication.Services;

import com.group5.sep3.BusinessLogic.LogicModels.OrderModel;
import com.group5.sep3.BusinessLogic.model.Order;
import com.group5.sep3.BusinessLogic.model.OrderEntry;
import com.group5.sep3.util.ProjectUtil;
import io.grpc.stub.StreamObserver;
import protos.OrderServiceGrpc.OrderServiceImplBase;
import protos.OrderServiceOuterClass;
import protos.OrderServiceOuterClass.*;

import java.util.ArrayList;


public class OrderService extends OrderServiceImplBase {
    OrderModel orderModel;

    public OrderService(OrderModel orderModel) {
        this.orderModel = orderModel;

    }

    @Override
    public void registerOrder(gOrder request, StreamObserver<gOrder> responseObserver) {
        Order order = createOrderFromRequestOrder(request);

        Order returned;

        try {
            returned = orderModel.register(order);

        } catch (Exception e) {
            e.printStackTrace();
        }

        ProjectUtil.notImplemented();

    }

    @Override
    public void getOrder(gOrder request, StreamObserver<gOrder> responseObserver) {
        ProjectUtil.notImplemented();
    }

    @Override
    public void getAllOrders(gOrder request, StreamObserver<gOrderList> responseObserver) {
        ProjectUtil.notImplemented();
    }

    @Override
    public void updateOrder(gOrder request, StreamObserver<gOrder> responseObserver) {
        ProjectUtil.notImplemented();
    }

    @Override
    public void removeOrder(gOrder request, StreamObserver<gOrder> responseObserver) {
        ProjectUtil.notImplemented();
    }

    private Order createOrderFromRequestOrder(gOrder request) {
        Order order = new Order(request.getOrderNumber());
        order.setOrderNumber(request.getOrderNumber());
        order.setId(request.getId());

        ArrayList<OrderEntry> orderEntries = new ArrayList<>();

        for (gOrderEntry gOrderEntry : request.getOrderEntriesList()) {

            OrderEntry orderEntry =
                    new OrderEntry(gOrderEntry.getOrderId(),gOrderEntry.getAmount(),gOrderEntry.getItemId());


        }

        ProjectUtil.notImplemented();
        return order;

    }

    private gOrder createGOrderFromResponseOrder(Order order) {
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
