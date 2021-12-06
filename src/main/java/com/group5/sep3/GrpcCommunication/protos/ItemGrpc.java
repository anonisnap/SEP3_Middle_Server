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
    comments = "Source: Item.proto")
public final class ItemGrpc {

  private ItemGrpc() {}

  public static final String SERVICE_NAME = "Protos.Item";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<protos.ItemOuterClass.gItem,
      protos.ItemOuterClass.gItem> getRegisterItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterItem",
      requestType = protos.ItemOuterClass.gItem.class,
      responseType = protos.ItemOuterClass.gItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.ItemOuterClass.gItem,
      protos.ItemOuterClass.gItem> getRegisterItemMethod() {
    io.grpc.MethodDescriptor<protos.ItemOuterClass.gItem, protos.ItemOuterClass.gItem> getRegisterItemMethod;
    if ((getRegisterItemMethod = ItemGrpc.getRegisterItemMethod) == null) {
      synchronized (ItemGrpc.class) {
        if ((getRegisterItemMethod = ItemGrpc.getRegisterItemMethod) == null) {
          ItemGrpc.getRegisterItemMethod = getRegisterItemMethod = 
              io.grpc.MethodDescriptor.<protos.ItemOuterClass.gItem, protos.ItemOuterClass.gItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.Item", "RegisterItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemOuterClass.gItem.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemOuterClass.gItem.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemMethodDescriptorSupplier("RegisterItem"))
                  .build();
          }
        }
     }
     return getRegisterItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.ItemOuterClass.gItem,
      protos.ItemOuterClass.gItem> getGetItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetItem",
      requestType = protos.ItemOuterClass.gItem.class,
      responseType = protos.ItemOuterClass.gItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.ItemOuterClass.gItem,
      protos.ItemOuterClass.gItem> getGetItemMethod() {
    io.grpc.MethodDescriptor<protos.ItemOuterClass.gItem, protos.ItemOuterClass.gItem> getGetItemMethod;
    if ((getGetItemMethod = ItemGrpc.getGetItemMethod) == null) {
      synchronized (ItemGrpc.class) {
        if ((getGetItemMethod = ItemGrpc.getGetItemMethod) == null) {
          ItemGrpc.getGetItemMethod = getGetItemMethod = 
              io.grpc.MethodDescriptor.<protos.ItemOuterClass.gItem, protos.ItemOuterClass.gItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.Item", "GetItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemOuterClass.gItem.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemOuterClass.gItem.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemMethodDescriptorSupplier("GetItem"))
                  .build();
          }
        }
     }
     return getGetItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.ItemOuterClass.gItem,
      protos.ItemOuterClass.gItemList> getGetAllItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllItems",
      requestType = protos.ItemOuterClass.gItem.class,
      responseType = protos.ItemOuterClass.gItemList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.ItemOuterClass.gItem,
      protos.ItemOuterClass.gItemList> getGetAllItemsMethod() {
    io.grpc.MethodDescriptor<protos.ItemOuterClass.gItem, protos.ItemOuterClass.gItemList> getGetAllItemsMethod;
    if ((getGetAllItemsMethod = ItemGrpc.getGetAllItemsMethod) == null) {
      synchronized (ItemGrpc.class) {
        if ((getGetAllItemsMethod = ItemGrpc.getGetAllItemsMethod) == null) {
          ItemGrpc.getGetAllItemsMethod = getGetAllItemsMethod = 
              io.grpc.MethodDescriptor.<protos.ItemOuterClass.gItem, protos.ItemOuterClass.gItemList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.Item", "GetAllItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemOuterClass.gItem.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemOuterClass.gItemList.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemMethodDescriptorSupplier("GetAllItems"))
                  .build();
          }
        }
     }
     return getGetAllItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.ItemOuterClass.gItem,
      protos.ItemOuterClass.gItem> getUpdateItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateItem",
      requestType = protos.ItemOuterClass.gItem.class,
      responseType = protos.ItemOuterClass.gItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.ItemOuterClass.gItem,
      protos.ItemOuterClass.gItem> getUpdateItemMethod() {
    io.grpc.MethodDescriptor<protos.ItemOuterClass.gItem, protos.ItemOuterClass.gItem> getUpdateItemMethod;
    if ((getUpdateItemMethod = ItemGrpc.getUpdateItemMethod) == null) {
      synchronized (ItemGrpc.class) {
        if ((getUpdateItemMethod = ItemGrpc.getUpdateItemMethod) == null) {
          ItemGrpc.getUpdateItemMethod = getUpdateItemMethod = 
              io.grpc.MethodDescriptor.<protos.ItemOuterClass.gItem, protos.ItemOuterClass.gItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.Item", "UpdateItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemOuterClass.gItem.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemOuterClass.gItem.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemMethodDescriptorSupplier("UpdateItem"))
                  .build();
          }
        }
     }
     return getUpdateItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.ItemOuterClass.gItem,
      protos.ItemOuterClass.gItem> getRemoveItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveItem",
      requestType = protos.ItemOuterClass.gItem.class,
      responseType = protos.ItemOuterClass.gItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.ItemOuterClass.gItem,
      protos.ItemOuterClass.gItem> getRemoveItemMethod() {
    io.grpc.MethodDescriptor<protos.ItemOuterClass.gItem, protos.ItemOuterClass.gItem> getRemoveItemMethod;
    if ((getRemoveItemMethod = ItemGrpc.getRemoveItemMethod) == null) {
      synchronized (ItemGrpc.class) {
        if ((getRemoveItemMethod = ItemGrpc.getRemoveItemMethod) == null) {
          ItemGrpc.getRemoveItemMethod = getRemoveItemMethod = 
              io.grpc.MethodDescriptor.<protos.ItemOuterClass.gItem, protos.ItemOuterClass.gItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.Item", "RemoveItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemOuterClass.gItem.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemOuterClass.gItem.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemMethodDescriptorSupplier("RemoveItem"))
                  .build();
          }
        }
     }
     return getRemoveItemMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ItemStub newStub(io.grpc.Channel channel) {
    return new ItemStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ItemBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ItemBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ItemFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ItemFutureStub(channel);
  }

  /**
   */
  public static abstract class ItemImplBase implements io.grpc.BindableService {

    /**
     */
    public void registerItem(protos.ItemOuterClass.gItem request,
        io.grpc.stub.StreamObserver<protos.ItemOuterClass.gItem> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterItemMethod(), responseObserver);
    }

    /**
     */
    public void getItem(protos.ItemOuterClass.gItem request,
        io.grpc.stub.StreamObserver<protos.ItemOuterClass.gItem> responseObserver) {
      asyncUnimplementedUnaryCall(getGetItemMethod(), responseObserver);
    }

    /**
     */
    public void getAllItems(protos.ItemOuterClass.gItem request,
        io.grpc.stub.StreamObserver<protos.ItemOuterClass.gItemList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllItemsMethod(), responseObserver);
    }

    /**
     */
    public void updateItem(protos.ItemOuterClass.gItem request,
        io.grpc.stub.StreamObserver<protos.ItemOuterClass.gItem> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateItemMethod(), responseObserver);
    }

    /**
     */
    public void removeItem(protos.ItemOuterClass.gItem request,
        io.grpc.stub.StreamObserver<protos.ItemOuterClass.gItem> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveItemMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.ItemOuterClass.gItem,
                protos.ItemOuterClass.gItem>(
                  this, METHODID_REGISTER_ITEM)))
          .addMethod(
            getGetItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.ItemOuterClass.gItem,
                protos.ItemOuterClass.gItem>(
                  this, METHODID_GET_ITEM)))
          .addMethod(
            getGetAllItemsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.ItemOuterClass.gItem,
                protos.ItemOuterClass.gItemList>(
                  this, METHODID_GET_ALL_ITEMS)))
          .addMethod(
            getUpdateItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.ItemOuterClass.gItem,
                protos.ItemOuterClass.gItem>(
                  this, METHODID_UPDATE_ITEM)))
          .addMethod(
            getRemoveItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.ItemOuterClass.gItem,
                protos.ItemOuterClass.gItem>(
                  this, METHODID_REMOVE_ITEM)))
          .build();
    }
  }

  /**
   */
  public static final class ItemStub extends io.grpc.stub.AbstractStub<ItemStub> {
    private ItemStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ItemStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ItemStub(channel, callOptions);
    }

    /**
     */
    public void registerItem(protos.ItemOuterClass.gItem request,
        io.grpc.stub.StreamObserver<protos.ItemOuterClass.gItem> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getItem(protos.ItemOuterClass.gItem request,
        io.grpc.stub.StreamObserver<protos.ItemOuterClass.gItem> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllItems(protos.ItemOuterClass.gItem request,
        io.grpc.stub.StreamObserver<protos.ItemOuterClass.gItemList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateItem(protos.ItemOuterClass.gItem request,
        io.grpc.stub.StreamObserver<protos.ItemOuterClass.gItem> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeItem(protos.ItemOuterClass.gItem request,
        io.grpc.stub.StreamObserver<protos.ItemOuterClass.gItem> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveItemMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ItemBlockingStub extends io.grpc.stub.AbstractStub<ItemBlockingStub> {
    private ItemBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ItemBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ItemBlockingStub(channel, callOptions);
    }

    /**
     */
    public protos.ItemOuterClass.gItem registerItem(protos.ItemOuterClass.gItem request) {
      return blockingUnaryCall(
          getChannel(), getRegisterItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.ItemOuterClass.gItem getItem(protos.ItemOuterClass.gItem request) {
      return blockingUnaryCall(
          getChannel(), getGetItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.ItemOuterClass.gItemList getAllItems(protos.ItemOuterClass.gItem request) {
      return blockingUnaryCall(
          getChannel(), getGetAllItemsMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.ItemOuterClass.gItem updateItem(protos.ItemOuterClass.gItem request) {
      return blockingUnaryCall(
          getChannel(), getUpdateItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.ItemOuterClass.gItem removeItem(protos.ItemOuterClass.gItem request) {
      return blockingUnaryCall(
          getChannel(), getRemoveItemMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ItemFutureStub extends io.grpc.stub.AbstractStub<ItemFutureStub> {
    private ItemFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ItemFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ItemFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.ItemOuterClass.gItem> registerItem(
        protos.ItemOuterClass.gItem request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.ItemOuterClass.gItem> getItem(
        protos.ItemOuterClass.gItem request) {
      return futureUnaryCall(
          getChannel().newCall(getGetItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.ItemOuterClass.gItemList> getAllItems(
        protos.ItemOuterClass.gItem request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllItemsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.ItemOuterClass.gItem> updateItem(
        protos.ItemOuterClass.gItem request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.ItemOuterClass.gItem> removeItem(
        protos.ItemOuterClass.gItem request) {
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
    private final ItemImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ItemImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_ITEM:
          serviceImpl.registerItem((protos.ItemOuterClass.gItem) request,
              (io.grpc.stub.StreamObserver<protos.ItemOuterClass.gItem>) responseObserver);
          break;
        case METHODID_GET_ITEM:
          serviceImpl.getItem((protos.ItemOuterClass.gItem) request,
              (io.grpc.stub.StreamObserver<protos.ItemOuterClass.gItem>) responseObserver);
          break;
        case METHODID_GET_ALL_ITEMS:
          serviceImpl.getAllItems((protos.ItemOuterClass.gItem) request,
              (io.grpc.stub.StreamObserver<protos.ItemOuterClass.gItemList>) responseObserver);
          break;
        case METHODID_UPDATE_ITEM:
          serviceImpl.updateItem((protos.ItemOuterClass.gItem) request,
              (io.grpc.stub.StreamObserver<protos.ItemOuterClass.gItem>) responseObserver);
          break;
        case METHODID_REMOVE_ITEM:
          serviceImpl.removeItem((protos.ItemOuterClass.gItem) request,
              (io.grpc.stub.StreamObserver<protos.ItemOuterClass.gItem>) responseObserver);
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

  private static abstract class ItemBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ItemBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return protos.ItemOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Item");
    }
  }

  private static final class ItemFileDescriptorSupplier
      extends ItemBaseDescriptorSupplier {
    ItemFileDescriptorSupplier() {}
  }

  private static final class ItemMethodDescriptorSupplier
      extends ItemBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ItemMethodDescriptorSupplier(String methodName) {
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
      synchronized (ItemGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ItemFileDescriptorSupplier())
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
