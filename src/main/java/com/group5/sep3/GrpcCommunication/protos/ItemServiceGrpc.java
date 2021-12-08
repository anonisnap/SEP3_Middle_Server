package protos;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ItemService.proto")
public final class ItemServiceGrpc {

  private ItemServiceGrpc() {}

  public static final String SERVICE_NAME = "Protos.ItemService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<protos.ItemServiceOuterClass.gItem,
      protos.ItemServiceOuterClass.gItem> getRegisterItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterItem",
      requestType = protos.ItemServiceOuterClass.gItem.class,
      responseType = protos.ItemServiceOuterClass.gItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.ItemServiceOuterClass.gItem,
      protos.ItemServiceOuterClass.gItem> getRegisterItemMethod() {
    io.grpc.MethodDescriptor<protos.ItemServiceOuterClass.gItem, protos.ItemServiceOuterClass.gItem> getRegisterItemMethod;
    if ((getRegisterItemMethod = ItemServiceGrpc.getRegisterItemMethod) == null) {
      synchronized (ItemServiceGrpc.class) {
        if ((getRegisterItemMethod = ItemServiceGrpc.getRegisterItemMethod) == null) {
          ItemServiceGrpc.getRegisterItemMethod = getRegisterItemMethod = 
              io.grpc.MethodDescriptor.<protos.ItemServiceOuterClass.gItem, protos.ItemServiceOuterClass.gItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.ItemService", "RegisterItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemServiceOuterClass.gItem.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemServiceOuterClass.gItem.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemServiceMethodDescriptorSupplier("RegisterItem"))
                  .build();
          }
        }
     }
     return getRegisterItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.ItemServiceOuterClass.gItem,
      protos.ItemServiceOuterClass.gItem> getGetItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetItem",
      requestType = protos.ItemServiceOuterClass.gItem.class,
      responseType = protos.ItemServiceOuterClass.gItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.ItemServiceOuterClass.gItem,
      protos.ItemServiceOuterClass.gItem> getGetItemMethod() {
    io.grpc.MethodDescriptor<protos.ItemServiceOuterClass.gItem, protos.ItemServiceOuterClass.gItem> getGetItemMethod;
    if ((getGetItemMethod = ItemServiceGrpc.getGetItemMethod) == null) {
      synchronized (ItemServiceGrpc.class) {
        if ((getGetItemMethod = ItemServiceGrpc.getGetItemMethod) == null) {
          ItemServiceGrpc.getGetItemMethod = getGetItemMethod = 
              io.grpc.MethodDescriptor.<protos.ItemServiceOuterClass.gItem, protos.ItemServiceOuterClass.gItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.ItemService", "GetItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemServiceOuterClass.gItem.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemServiceOuterClass.gItem.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemServiceMethodDescriptorSupplier("GetItem"))
                  .build();
          }
        }
     }
     return getGetItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.ItemServiceOuterClass.gItem,
      protos.ItemServiceOuterClass.gItemList> getGetAllItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllItems",
      requestType = protos.ItemServiceOuterClass.gItem.class,
      responseType = protos.ItemServiceOuterClass.gItemList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.ItemServiceOuterClass.gItem,
      protos.ItemServiceOuterClass.gItemList> getGetAllItemsMethod() {
    io.grpc.MethodDescriptor<protos.ItemServiceOuterClass.gItem, protos.ItemServiceOuterClass.gItemList> getGetAllItemsMethod;
    if ((getGetAllItemsMethod = ItemServiceGrpc.getGetAllItemsMethod) == null) {
      synchronized (ItemServiceGrpc.class) {
        if ((getGetAllItemsMethod = ItemServiceGrpc.getGetAllItemsMethod) == null) {
          ItemServiceGrpc.getGetAllItemsMethod = getGetAllItemsMethod = 
              io.grpc.MethodDescriptor.<protos.ItemServiceOuterClass.gItem, protos.ItemServiceOuterClass.gItemList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.ItemService", "GetAllItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemServiceOuterClass.gItem.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemServiceOuterClass.gItemList.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemServiceMethodDescriptorSupplier("GetAllItems"))
                  .build();
          }
        }
     }
     return getGetAllItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.ItemServiceOuterClass.gItem,
      protos.ItemServiceOuterClass.gItem> getUpdateItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateItem",
      requestType = protos.ItemServiceOuterClass.gItem.class,
      responseType = protos.ItemServiceOuterClass.gItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.ItemServiceOuterClass.gItem,
      protos.ItemServiceOuterClass.gItem> getUpdateItemMethod() {
    io.grpc.MethodDescriptor<protos.ItemServiceOuterClass.gItem, protos.ItemServiceOuterClass.gItem> getUpdateItemMethod;
    if ((getUpdateItemMethod = ItemServiceGrpc.getUpdateItemMethod) == null) {
      synchronized (ItemServiceGrpc.class) {
        if ((getUpdateItemMethod = ItemServiceGrpc.getUpdateItemMethod) == null) {
          ItemServiceGrpc.getUpdateItemMethod = getUpdateItemMethod = 
              io.grpc.MethodDescriptor.<protos.ItemServiceOuterClass.gItem, protos.ItemServiceOuterClass.gItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.ItemService", "UpdateItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemServiceOuterClass.gItem.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemServiceOuterClass.gItem.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemServiceMethodDescriptorSupplier("UpdateItem"))
                  .build();
          }
        }
     }
     return getUpdateItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.ItemServiceOuterClass.gItem,
      protos.ItemServiceOuterClass.gItem> getRemoveItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveItem",
      requestType = protos.ItemServiceOuterClass.gItem.class,
      responseType = protos.ItemServiceOuterClass.gItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.ItemServiceOuterClass.gItem,
      protos.ItemServiceOuterClass.gItem> getRemoveItemMethod() {
    io.grpc.MethodDescriptor<protos.ItemServiceOuterClass.gItem, protos.ItemServiceOuterClass.gItem> getRemoveItemMethod;
    if ((getRemoveItemMethod = ItemServiceGrpc.getRemoveItemMethod) == null) {
      synchronized (ItemServiceGrpc.class) {
        if ((getRemoveItemMethod = ItemServiceGrpc.getRemoveItemMethod) == null) {
          ItemServiceGrpc.getRemoveItemMethod = getRemoveItemMethod = 
              io.grpc.MethodDescriptor.<protos.ItemServiceOuterClass.gItem, protos.ItemServiceOuterClass.gItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.ItemService", "RemoveItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemServiceOuterClass.gItem.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemServiceOuterClass.gItem.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemServiceMethodDescriptorSupplier("RemoveItem"))
                  .build();
          }
        }
     }
     return getRemoveItemMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ItemServiceStub newStub(io.grpc.Channel channel) {
    return new ItemServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ItemServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ItemServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ItemServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ItemServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ItemServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void registerItem(protos.ItemServiceOuterClass.gItem request,
        io.grpc.stub.StreamObserver<protos.ItemServiceOuterClass.gItem> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterItemMethod(), responseObserver);
    }

    /**
     */
    public void getItem(protos.ItemServiceOuterClass.gItem request,
        io.grpc.stub.StreamObserver<protos.ItemServiceOuterClass.gItem> responseObserver) {
      asyncUnimplementedUnaryCall(getGetItemMethod(), responseObserver);
    }

    /**
     */
    public void getAllItems(protos.ItemServiceOuterClass.gItem request,
        io.grpc.stub.StreamObserver<protos.ItemServiceOuterClass.gItemList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllItemsMethod(), responseObserver);
    }

    /**
     */
    public void updateItem(protos.ItemServiceOuterClass.gItem request,
        io.grpc.stub.StreamObserver<protos.ItemServiceOuterClass.gItem> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateItemMethod(), responseObserver);
    }

    /**
     */
    public void removeItem(protos.ItemServiceOuterClass.gItem request,
        io.grpc.stub.StreamObserver<protos.ItemServiceOuterClass.gItem> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveItemMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.ItemServiceOuterClass.gItem,
                protos.ItemServiceOuterClass.gItem>(
                  this, METHODID_REGISTER_ITEM)))
          .addMethod(
            getGetItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.ItemServiceOuterClass.gItem,
                protos.ItemServiceOuterClass.gItem>(
                  this, METHODID_GET_ITEM)))
          .addMethod(
            getGetAllItemsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.ItemServiceOuterClass.gItem,
                protos.ItemServiceOuterClass.gItemList>(
                  this, METHODID_GET_ALL_ITEMS)))
          .addMethod(
            getUpdateItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.ItemServiceOuterClass.gItem,
                protos.ItemServiceOuterClass.gItem>(
                  this, METHODID_UPDATE_ITEM)))
          .addMethod(
            getRemoveItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.ItemServiceOuterClass.gItem,
                protos.ItemServiceOuterClass.gItem>(
                  this, METHODID_REMOVE_ITEM)))
          .build();
    }
  }

  /**
   */
  public static final class ItemServiceStub extends io.grpc.stub.AbstractStub<ItemServiceStub> {
    private ItemServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ItemServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ItemServiceStub(channel, callOptions);
    }

    /**
     */
    public void registerItem(protos.ItemServiceOuterClass.gItem request,
        io.grpc.stub.StreamObserver<protos.ItemServiceOuterClass.gItem> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getItem(protos.ItemServiceOuterClass.gItem request,
        io.grpc.stub.StreamObserver<protos.ItemServiceOuterClass.gItem> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllItems(protos.ItemServiceOuterClass.gItem request,
        io.grpc.stub.StreamObserver<protos.ItemServiceOuterClass.gItemList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateItem(protos.ItemServiceOuterClass.gItem request,
        io.grpc.stub.StreamObserver<protos.ItemServiceOuterClass.gItem> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeItem(protos.ItemServiceOuterClass.gItem request,
        io.grpc.stub.StreamObserver<protos.ItemServiceOuterClass.gItem> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveItemMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ItemServiceBlockingStub extends io.grpc.stub.AbstractStub<ItemServiceBlockingStub> {
    private ItemServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ItemServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ItemServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public protos.ItemServiceOuterClass.gItem registerItem(protos.ItemServiceOuterClass.gItem request) {
      return blockingUnaryCall(
          getChannel(), getRegisterItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.ItemServiceOuterClass.gItem getItem(protos.ItemServiceOuterClass.gItem request) {
      return blockingUnaryCall(
          getChannel(), getGetItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.ItemServiceOuterClass.gItemList getAllItems(protos.ItemServiceOuterClass.gItem request) {
      return blockingUnaryCall(
          getChannel(), getGetAllItemsMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.ItemServiceOuterClass.gItem updateItem(protos.ItemServiceOuterClass.gItem request) {
      return blockingUnaryCall(
          getChannel(), getUpdateItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.ItemServiceOuterClass.gItem removeItem(protos.ItemServiceOuterClass.gItem request) {
      return blockingUnaryCall(
          getChannel(), getRemoveItemMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ItemServiceFutureStub extends io.grpc.stub.AbstractStub<ItemServiceFutureStub> {
    private ItemServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ItemServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ItemServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.ItemServiceOuterClass.gItem> registerItem(
        protos.ItemServiceOuterClass.gItem request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.ItemServiceOuterClass.gItem> getItem(
        protos.ItemServiceOuterClass.gItem request) {
      return futureUnaryCall(
          getChannel().newCall(getGetItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.ItemServiceOuterClass.gItemList> getAllItems(
        protos.ItemServiceOuterClass.gItem request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllItemsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.ItemServiceOuterClass.gItem> updateItem(
        protos.ItemServiceOuterClass.gItem request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.ItemServiceOuterClass.gItem> removeItem(
        protos.ItemServiceOuterClass.gItem request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveItemMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_ITEM = 0;
  private static final int METHODID_GET_ITEM = 1;
  private static final int METHODID_GET_ALL_ITEMS = 2;
  private static final int METHODID_UPDATE_ITEM = 3;
  private static final int METHODID_REMOVE_ITEM = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ItemServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ItemServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_ITEM:
          serviceImpl.registerItem((protos.ItemServiceOuterClass.gItem) request,
              (io.grpc.stub.StreamObserver<protos.ItemServiceOuterClass.gItem>) responseObserver);
          break;
        case METHODID_GET_ITEM:
          serviceImpl.getItem((protos.ItemServiceOuterClass.gItem) request,
              (io.grpc.stub.StreamObserver<protos.ItemServiceOuterClass.gItem>) responseObserver);
          break;
        case METHODID_GET_ALL_ITEMS:
          serviceImpl.getAllItems((protos.ItemServiceOuterClass.gItem) request,
              (io.grpc.stub.StreamObserver<protos.ItemServiceOuterClass.gItemList>) responseObserver);
          break;
        case METHODID_UPDATE_ITEM:
          serviceImpl.updateItem((protos.ItemServiceOuterClass.gItem) request,
              (io.grpc.stub.StreamObserver<protos.ItemServiceOuterClass.gItem>) responseObserver);
          break;
        case METHODID_REMOVE_ITEM:
          serviceImpl.removeItem((protos.ItemServiceOuterClass.gItem) request,
              (io.grpc.stub.StreamObserver<protos.ItemServiceOuterClass.gItem>) responseObserver);
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

  private static abstract class ItemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ItemServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return protos.ItemServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ItemService");
    }
  }

  private static final class ItemServiceFileDescriptorSupplier
      extends ItemServiceBaseDescriptorSupplier {
    ItemServiceFileDescriptorSupplier() {}
  }

  private static final class ItemServiceMethodDescriptorSupplier
      extends ItemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ItemServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ItemServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ItemServiceFileDescriptorSupplier())
              .addMethod(getRegisterItemMethod())
              .addMethod(getGetItemMethod())
              .addMethod(getGetAllItemsMethod())
              .addMethod(getUpdateItemMethod())
              .addMethod(getRemoveItemMethod())
              .build();
        }
      }
    }
    return result;
  }
}
