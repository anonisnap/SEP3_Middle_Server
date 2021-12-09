package protos;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: OrderService.proto")
public final class OrderServiceGrpc {

  private OrderServiceGrpc() {}

  public static final String SERVICE_NAME = "Protos.OrderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<protos.OrderServiceOuterClass.gOrder,
      protos.OrderServiceOuterClass.gOrder> getRegisterOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterOrder",
      requestType = protos.OrderServiceOuterClass.gOrder.class,
      responseType = protos.OrderServiceOuterClass.gOrder.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.OrderServiceOuterClass.gOrder,
      protos.OrderServiceOuterClass.gOrder> getRegisterOrderMethod() {
    io.grpc.MethodDescriptor<protos.OrderServiceOuterClass.gOrder, protos.OrderServiceOuterClass.gOrder> getRegisterOrderMethod;
    if ((getRegisterOrderMethod = OrderServiceGrpc.getRegisterOrderMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getRegisterOrderMethod = OrderServiceGrpc.getRegisterOrderMethod) == null) {
          OrderServiceGrpc.getRegisterOrderMethod = getRegisterOrderMethod = 
              io.grpc.MethodDescriptor.<protos.OrderServiceOuterClass.gOrder, protos.OrderServiceOuterClass.gOrder>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.OrderService", "RegisterOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.OrderServiceOuterClass.gOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.OrderServiceOuterClass.gOrder.getDefaultInstance()))
                  .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("RegisterOrder"))
                  .build();
          }
        }
     }
     return getRegisterOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.OrderServiceOuterClass.gOrderId,
      protos.OrderServiceOuterClass.gOrder> getGetOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrder",
      requestType = protos.OrderServiceOuterClass.gOrderId.class,
      responseType = protos.OrderServiceOuterClass.gOrder.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.OrderServiceOuterClass.gOrderId,
      protos.OrderServiceOuterClass.gOrder> getGetOrderMethod() {
    io.grpc.MethodDescriptor<protos.OrderServiceOuterClass.gOrderId, protos.OrderServiceOuterClass.gOrder> getGetOrderMethod;
    if ((getGetOrderMethod = OrderServiceGrpc.getGetOrderMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getGetOrderMethod = OrderServiceGrpc.getGetOrderMethod) == null) {
          OrderServiceGrpc.getGetOrderMethod = getGetOrderMethod = 
              io.grpc.MethodDescriptor.<protos.OrderServiceOuterClass.gOrderId, protos.OrderServiceOuterClass.gOrder>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.OrderService", "GetOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.OrderServiceOuterClass.gOrderId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.OrderServiceOuterClass.gOrder.getDefaultInstance()))
                  .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("GetOrder"))
                  .build();
          }
        }
     }
     return getGetOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.OrderServiceOuterClass.gOrder,
      protos.OrderServiceOuterClass.gOrderList> getGetAllOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllOrders",
      requestType = protos.OrderServiceOuterClass.gOrder.class,
      responseType = protos.OrderServiceOuterClass.gOrderList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.OrderServiceOuterClass.gOrder,
      protos.OrderServiceOuterClass.gOrderList> getGetAllOrdersMethod() {
    io.grpc.MethodDescriptor<protos.OrderServiceOuterClass.gOrder, protos.OrderServiceOuterClass.gOrderList> getGetAllOrdersMethod;
    if ((getGetAllOrdersMethod = OrderServiceGrpc.getGetAllOrdersMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getGetAllOrdersMethod = OrderServiceGrpc.getGetAllOrdersMethod) == null) {
          OrderServiceGrpc.getGetAllOrdersMethod = getGetAllOrdersMethod = 
              io.grpc.MethodDescriptor.<protos.OrderServiceOuterClass.gOrder, protos.OrderServiceOuterClass.gOrderList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.OrderService", "GetAllOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.OrderServiceOuterClass.gOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.OrderServiceOuterClass.gOrderList.getDefaultInstance()))
                  .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("GetAllOrders"))
                  .build();
          }
        }
     }
     return getGetAllOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.OrderServiceOuterClass.gOrder,
      protos.OrderServiceOuterClass.gOrder> getUpdateOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOrder",
      requestType = protos.OrderServiceOuterClass.gOrder.class,
      responseType = protos.OrderServiceOuterClass.gOrder.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.OrderServiceOuterClass.gOrder,
      protos.OrderServiceOuterClass.gOrder> getUpdateOrderMethod() {
    io.grpc.MethodDescriptor<protos.OrderServiceOuterClass.gOrder, protos.OrderServiceOuterClass.gOrder> getUpdateOrderMethod;
    if ((getUpdateOrderMethod = OrderServiceGrpc.getUpdateOrderMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getUpdateOrderMethod = OrderServiceGrpc.getUpdateOrderMethod) == null) {
          OrderServiceGrpc.getUpdateOrderMethod = getUpdateOrderMethod = 
              io.grpc.MethodDescriptor.<protos.OrderServiceOuterClass.gOrder, protos.OrderServiceOuterClass.gOrder>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.OrderService", "UpdateOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.OrderServiceOuterClass.gOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.OrderServiceOuterClass.gOrder.getDefaultInstance()))
                  .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("UpdateOrder"))
                  .build();
          }
        }
     }
     return getUpdateOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.OrderServiceOuterClass.gOrderId,
      Protos.ProtoUtil.gBoolValue> getRemoveOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveOrder",
      requestType = protos.OrderServiceOuterClass.gOrderId.class,
      responseType = Protos.ProtoUtil.gBoolValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.OrderServiceOuterClass.gOrderId,
      Protos.ProtoUtil.gBoolValue> getRemoveOrderMethod() {
    io.grpc.MethodDescriptor<protos.OrderServiceOuterClass.gOrderId, Protos.ProtoUtil.gBoolValue> getRemoveOrderMethod;
    if ((getRemoveOrderMethod = OrderServiceGrpc.getRemoveOrderMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getRemoveOrderMethod = OrderServiceGrpc.getRemoveOrderMethod) == null) {
          OrderServiceGrpc.getRemoveOrderMethod = getRemoveOrderMethod = 
              io.grpc.MethodDescriptor.<protos.OrderServiceOuterClass.gOrderId, Protos.ProtoUtil.gBoolValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.OrderService", "RemoveOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.OrderServiceOuterClass.gOrderId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Protos.ProtoUtil.gBoolValue.getDefaultInstance()))
                  .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("RemoveOrder"))
                  .build();
          }
        }
     }
     return getRemoveOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrderServiceStub newStub(io.grpc.Channel channel) {
    return new OrderServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OrderServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OrderServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class OrderServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void registerOrder(protos.OrderServiceOuterClass.gOrder request,
        io.grpc.stub.StreamObserver<protos.OrderServiceOuterClass.gOrder> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterOrderMethod(), responseObserver);
    }

    /**
     */
    public void getOrder(protos.OrderServiceOuterClass.gOrderId request,
        io.grpc.stub.StreamObserver<protos.OrderServiceOuterClass.gOrder> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOrderMethod(), responseObserver);
    }

    /**
     */
    public void getAllOrders(protos.OrderServiceOuterClass.gOrder request,
        io.grpc.stub.StreamObserver<protos.OrderServiceOuterClass.gOrderList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllOrdersMethod(), responseObserver);
    }

    /**
     */
    public void updateOrder(protos.OrderServiceOuterClass.gOrder request,
        io.grpc.stub.StreamObserver<protos.OrderServiceOuterClass.gOrder> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateOrderMethod(), responseObserver);
    }

    /**
     */
    public void removeOrder(protos.OrderServiceOuterClass.gOrderId request,
        io.grpc.stub.StreamObserver<Protos.ProtoUtil.gBoolValue> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveOrderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.OrderServiceOuterClass.gOrder,
                protos.OrderServiceOuterClass.gOrder>(
                  this, METHODID_REGISTER_ORDER)))
          .addMethod(
            getGetOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.OrderServiceOuterClass.gOrderId,
                protos.OrderServiceOuterClass.gOrder>(
                  this, METHODID_GET_ORDER)))
          .addMethod(
            getGetAllOrdersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.OrderServiceOuterClass.gOrder,
                protos.OrderServiceOuterClass.gOrderList>(
                  this, METHODID_GET_ALL_ORDERS)))
          .addMethod(
            getUpdateOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.OrderServiceOuterClass.gOrder,
                protos.OrderServiceOuterClass.gOrder>(
                  this, METHODID_UPDATE_ORDER)))
          .addMethod(
            getRemoveOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.OrderServiceOuterClass.gOrderId,
                Protos.ProtoUtil.gBoolValue>(
                  this, METHODID_REMOVE_ORDER)))
          .build();
    }
  }

  /**
   */
  public static final class OrderServiceStub extends io.grpc.stub.AbstractStub<OrderServiceStub> {
    private OrderServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrderServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrderServiceStub(channel, callOptions);
    }

    /**
     */
    public void registerOrder(protos.OrderServiceOuterClass.gOrder request,
        io.grpc.stub.StreamObserver<protos.OrderServiceOuterClass.gOrder> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrder(protos.OrderServiceOuterClass.gOrderId request,
        io.grpc.stub.StreamObserver<protos.OrderServiceOuterClass.gOrder> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllOrders(protos.OrderServiceOuterClass.gOrder request,
        io.grpc.stub.StreamObserver<protos.OrderServiceOuterClass.gOrderList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOrder(protos.OrderServiceOuterClass.gOrder request,
        io.grpc.stub.StreamObserver<protos.OrderServiceOuterClass.gOrder> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeOrder(protos.OrderServiceOuterClass.gOrderId request,
        io.grpc.stub.StreamObserver<Protos.ProtoUtil.gBoolValue> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveOrderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OrderServiceBlockingStub extends io.grpc.stub.AbstractStub<OrderServiceBlockingStub> {
    private OrderServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrderServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrderServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public protos.OrderServiceOuterClass.gOrder registerOrder(protos.OrderServiceOuterClass.gOrder request) {
      return blockingUnaryCall(
          getChannel(), getRegisterOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.OrderServiceOuterClass.gOrder getOrder(protos.OrderServiceOuterClass.gOrderId request) {
      return blockingUnaryCall(
          getChannel(), getGetOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.OrderServiceOuterClass.gOrderList getAllOrders(protos.OrderServiceOuterClass.gOrder request) {
      return blockingUnaryCall(
          getChannel(), getGetAllOrdersMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.OrderServiceOuterClass.gOrder updateOrder(protos.OrderServiceOuterClass.gOrder request) {
      return blockingUnaryCall(
          getChannel(), getUpdateOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public Protos.ProtoUtil.gBoolValue removeOrder(protos.OrderServiceOuterClass.gOrderId request) {
      return blockingUnaryCall(
          getChannel(), getRemoveOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OrderServiceFutureStub extends io.grpc.stub.AbstractStub<OrderServiceFutureStub> {
    private OrderServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrderServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrderServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.OrderServiceOuterClass.gOrder> registerOrder(
        protos.OrderServiceOuterClass.gOrder request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.OrderServiceOuterClass.gOrder> getOrder(
        protos.OrderServiceOuterClass.gOrderId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.OrderServiceOuterClass.gOrderList> getAllOrders(
        protos.OrderServiceOuterClass.gOrder request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllOrdersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.OrderServiceOuterClass.gOrder> updateOrder(
        protos.OrderServiceOuterClass.gOrder request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Protos.ProtoUtil.gBoolValue> removeOrder(
        protos.OrderServiceOuterClass.gOrderId request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveOrderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_ORDER = 0;
  private static final int METHODID_GET_ORDER = 1;
  private static final int METHODID_GET_ALL_ORDERS = 2;
  private static final int METHODID_UPDATE_ORDER = 3;
  private static final int METHODID_REMOVE_ORDER = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OrderServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OrderServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_ORDER:
          serviceImpl.registerOrder((protos.OrderServiceOuterClass.gOrder) request,
              (io.grpc.stub.StreamObserver<protos.OrderServiceOuterClass.gOrder>) responseObserver);
          break;
        case METHODID_GET_ORDER:
          serviceImpl.getOrder((protos.OrderServiceOuterClass.gOrderId) request,
              (io.grpc.stub.StreamObserver<protos.OrderServiceOuterClass.gOrder>) responseObserver);
          break;
        case METHODID_GET_ALL_ORDERS:
          serviceImpl.getAllOrders((protos.OrderServiceOuterClass.gOrder) request,
              (io.grpc.stub.StreamObserver<protos.OrderServiceOuterClass.gOrderList>) responseObserver);
          break;
        case METHODID_UPDATE_ORDER:
          serviceImpl.updateOrder((protos.OrderServiceOuterClass.gOrder) request,
              (io.grpc.stub.StreamObserver<protos.OrderServiceOuterClass.gOrder>) responseObserver);
          break;
        case METHODID_REMOVE_ORDER:
          serviceImpl.removeOrder((protos.OrderServiceOuterClass.gOrderId) request,
              (io.grpc.stub.StreamObserver<Protos.ProtoUtil.gBoolValue>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class OrderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return protos.OrderServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrderService");
    }
  }

  private static final class OrderServiceFileDescriptorSupplier
      extends OrderServiceBaseDescriptorSupplier {
    OrderServiceFileDescriptorSupplier() {}
  }

  private static final class OrderServiceMethodDescriptorSupplier
      extends OrderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OrderServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (OrderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrderServiceFileDescriptorSupplier())
              .addMethod(getRegisterOrderMethod())
              .addMethod(getGetOrderMethod())
              .addMethod(getGetAllOrdersMethod())
              .addMethod(getUpdateOrderMethod())
              .addMethod(getRemoveOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
