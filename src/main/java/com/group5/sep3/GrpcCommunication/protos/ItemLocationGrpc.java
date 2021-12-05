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
    comments = "Source: ItemLocation.proto")
public final class ItemLocationGrpc {

  private ItemLocationGrpc() {}

  public static final String SERVICE_NAME = "Protos.ItemLocation";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<protos.ItemLocationOuterClass.gItemLocation,
      protos.ItemLocationOuterClass.gItemLocation> getRegisterItemLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterItemLocation",
      requestType = protos.ItemLocationOuterClass.gItemLocation.class,
      responseType = protos.ItemLocationOuterClass.gItemLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.ItemLocationOuterClass.gItemLocation,
      protos.ItemLocationOuterClass.gItemLocation> getRegisterItemLocationMethod() {
    io.grpc.MethodDescriptor<protos.ItemLocationOuterClass.gItemLocation, protos.ItemLocationOuterClass.gItemLocation> getRegisterItemLocationMethod;
    if ((getRegisterItemLocationMethod = ItemLocationGrpc.getRegisterItemLocationMethod) == null) {
      synchronized (ItemLocationGrpc.class) {
        if ((getRegisterItemLocationMethod = ItemLocationGrpc.getRegisterItemLocationMethod) == null) {
          ItemLocationGrpc.getRegisterItemLocationMethod = getRegisterItemLocationMethod = 
              io.grpc.MethodDescriptor.<protos.ItemLocationOuterClass.gItemLocation, protos.ItemLocationOuterClass.gItemLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.ItemLocation", "RegisterItemLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemLocationOuterClass.gItemLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemLocationOuterClass.gItemLocation.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemLocationMethodDescriptorSupplier("RegisterItemLocation"))
                  .build();
          }
        }
     }
     return getRegisterItemLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.ItemLocationOuterClass.gItemLocation,
      protos.ItemLocationOuterClass.gItemLocation> getGetItemLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetItemLocation",
      requestType = protos.ItemLocationOuterClass.gItemLocation.class,
      responseType = protos.ItemLocationOuterClass.gItemLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.ItemLocationOuterClass.gItemLocation,
      protos.ItemLocationOuterClass.gItemLocation> getGetItemLocationMethod() {
    io.grpc.MethodDescriptor<protos.ItemLocationOuterClass.gItemLocation, protos.ItemLocationOuterClass.gItemLocation> getGetItemLocationMethod;
    if ((getGetItemLocationMethod = ItemLocationGrpc.getGetItemLocationMethod) == null) {
      synchronized (ItemLocationGrpc.class) {
        if ((getGetItemLocationMethod = ItemLocationGrpc.getGetItemLocationMethod) == null) {
          ItemLocationGrpc.getGetItemLocationMethod = getGetItemLocationMethod = 
              io.grpc.MethodDescriptor.<protos.ItemLocationOuterClass.gItemLocation, protos.ItemLocationOuterClass.gItemLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.ItemLocation", "GetItemLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemLocationOuterClass.gItemLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemLocationOuterClass.gItemLocation.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemLocationMethodDescriptorSupplier("GetItemLocation"))
                  .build();
          }
        }
     }
     return getGetItemLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.ItemLocationOuterClass.gItemLocation,
      protos.ItemLocationOuterClass.gItemLocationList> getGetAllItemLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllItemLocation",
      requestType = protos.ItemLocationOuterClass.gItemLocation.class,
      responseType = protos.ItemLocationOuterClass.gItemLocationList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.ItemLocationOuterClass.gItemLocation,
      protos.ItemLocationOuterClass.gItemLocationList> getGetAllItemLocationMethod() {
    io.grpc.MethodDescriptor<protos.ItemLocationOuterClass.gItemLocation, protos.ItemLocationOuterClass.gItemLocationList> getGetAllItemLocationMethod;
    if ((getGetAllItemLocationMethod = ItemLocationGrpc.getGetAllItemLocationMethod) == null) {
      synchronized (ItemLocationGrpc.class) {
        if ((getGetAllItemLocationMethod = ItemLocationGrpc.getGetAllItemLocationMethod) == null) {
          ItemLocationGrpc.getGetAllItemLocationMethod = getGetAllItemLocationMethod = 
              io.grpc.MethodDescriptor.<protos.ItemLocationOuterClass.gItemLocation, protos.ItemLocationOuterClass.gItemLocationList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.ItemLocation", "GetAllItemLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemLocationOuterClass.gItemLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemLocationOuterClass.gItemLocationList.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemLocationMethodDescriptorSupplier("GetAllItemLocation"))
                  .build();
          }
        }
     }
     return getGetAllItemLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.ItemLocationOuterClass.gItemLocation,
      protos.ItemLocationOuterClass.gItemLocation> getUpdateItemLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateItemLocation",
      requestType = protos.ItemLocationOuterClass.gItemLocation.class,
      responseType = protos.ItemLocationOuterClass.gItemLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.ItemLocationOuterClass.gItemLocation,
      protos.ItemLocationOuterClass.gItemLocation> getUpdateItemLocationMethod() {
    io.grpc.MethodDescriptor<protos.ItemLocationOuterClass.gItemLocation, protos.ItemLocationOuterClass.gItemLocation> getUpdateItemLocationMethod;
    if ((getUpdateItemLocationMethod = ItemLocationGrpc.getUpdateItemLocationMethod) == null) {
      synchronized (ItemLocationGrpc.class) {
        if ((getUpdateItemLocationMethod = ItemLocationGrpc.getUpdateItemLocationMethod) == null) {
          ItemLocationGrpc.getUpdateItemLocationMethod = getUpdateItemLocationMethod = 
              io.grpc.MethodDescriptor.<protos.ItemLocationOuterClass.gItemLocation, protos.ItemLocationOuterClass.gItemLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.ItemLocation", "UpdateItemLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemLocationOuterClass.gItemLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemLocationOuterClass.gItemLocation.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemLocationMethodDescriptorSupplier("UpdateItemLocation"))
                  .build();
          }
        }
     }
     return getUpdateItemLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.ItemLocationOuterClass.gItemLocation,
      protos.ItemLocationOuterClass.gItemLocation> getRemoveItemLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveItemLocation",
      requestType = protos.ItemLocationOuterClass.gItemLocation.class,
      responseType = protos.ItemLocationOuterClass.gItemLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.ItemLocationOuterClass.gItemLocation,
      protos.ItemLocationOuterClass.gItemLocation> getRemoveItemLocationMethod() {
    io.grpc.MethodDescriptor<protos.ItemLocationOuterClass.gItemLocation, protos.ItemLocationOuterClass.gItemLocation> getRemoveItemLocationMethod;
    if ((getRemoveItemLocationMethod = ItemLocationGrpc.getRemoveItemLocationMethod) == null) {
      synchronized (ItemLocationGrpc.class) {
        if ((getRemoveItemLocationMethod = ItemLocationGrpc.getRemoveItemLocationMethod) == null) {
          ItemLocationGrpc.getRemoveItemLocationMethod = getRemoveItemLocationMethod = 
              io.grpc.MethodDescriptor.<protos.ItemLocationOuterClass.gItemLocation, protos.ItemLocationOuterClass.gItemLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.ItemLocation", "RemoveItemLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemLocationOuterClass.gItemLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemLocationOuterClass.gItemLocation.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemLocationMethodDescriptorSupplier("RemoveItemLocation"))
                  .build();
          }
        }
     }
     return getRemoveItemLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.ItemLocationOuterClass.gItemLocation,
      protos.ItemLocationOuterClass.gItemLocationList> getGetByItemIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByItemId",
      requestType = protos.ItemLocationOuterClass.gItemLocation.class,
      responseType = protos.ItemLocationOuterClass.gItemLocationList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.ItemLocationOuterClass.gItemLocation,
      protos.ItemLocationOuterClass.gItemLocationList> getGetByItemIdMethod() {
    io.grpc.MethodDescriptor<protos.ItemLocationOuterClass.gItemLocation, protos.ItemLocationOuterClass.gItemLocationList> getGetByItemIdMethod;
    if ((getGetByItemIdMethod = ItemLocationGrpc.getGetByItemIdMethod) == null) {
      synchronized (ItemLocationGrpc.class) {
        if ((getGetByItemIdMethod = ItemLocationGrpc.getGetByItemIdMethod) == null) {
          ItemLocationGrpc.getGetByItemIdMethod = getGetByItemIdMethod = 
              io.grpc.MethodDescriptor.<protos.ItemLocationOuterClass.gItemLocation, protos.ItemLocationOuterClass.gItemLocationList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.ItemLocation", "GetByItemId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemLocationOuterClass.gItemLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemLocationOuterClass.gItemLocationList.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemLocationMethodDescriptorSupplier("GetByItemId"))
                  .build();
          }
        }
     }
     return getGetByItemIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.ItemLocationOuterClass.gItemLocation,
      protos.ItemLocationOuterClass.gItemLocationList> getGetByLocationIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByLocationId",
      requestType = protos.ItemLocationOuterClass.gItemLocation.class,
      responseType = protos.ItemLocationOuterClass.gItemLocationList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.ItemLocationOuterClass.gItemLocation,
      protos.ItemLocationOuterClass.gItemLocationList> getGetByLocationIdMethod() {
    io.grpc.MethodDescriptor<protos.ItemLocationOuterClass.gItemLocation, protos.ItemLocationOuterClass.gItemLocationList> getGetByLocationIdMethod;
    if ((getGetByLocationIdMethod = ItemLocationGrpc.getGetByLocationIdMethod) == null) {
      synchronized (ItemLocationGrpc.class) {
        if ((getGetByLocationIdMethod = ItemLocationGrpc.getGetByLocationIdMethod) == null) {
          ItemLocationGrpc.getGetByLocationIdMethod = getGetByLocationIdMethod = 
              io.grpc.MethodDescriptor.<protos.ItemLocationOuterClass.gItemLocation, protos.ItemLocationOuterClass.gItemLocationList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.ItemLocation", "GetByLocationId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemLocationOuterClass.gItemLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemLocationOuterClass.gItemLocationList.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemLocationMethodDescriptorSupplier("GetByLocationId"))
                  .build();
          }
        }
     }
     return getGetByLocationIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ItemLocationStub newStub(io.grpc.Channel channel) {
    return new ItemLocationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ItemLocationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ItemLocationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ItemLocationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ItemLocationFutureStub(channel);
  }

  /**
   */
  public static abstract class ItemLocationImplBase implements io.grpc.BindableService {

    /**
     */
    public void registerItemLocation(protos.ItemLocationOuterClass.gItemLocation request,
        io.grpc.stub.StreamObserver<protos.ItemLocationOuterClass.gItemLocation> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterItemLocationMethod(), responseObserver);
    }

    /**
     */
    public void getItemLocation(protos.ItemLocationOuterClass.gItemLocation request,
        io.grpc.stub.StreamObserver<protos.ItemLocationOuterClass.gItemLocation> responseObserver) {
      asyncUnimplementedUnaryCall(getGetItemLocationMethod(), responseObserver);
    }

    /**
     */
    public void getAllItemLocation(protos.ItemLocationOuterClass.gItemLocation request,
        io.grpc.stub.StreamObserver<protos.ItemLocationOuterClass.gItemLocationList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllItemLocationMethod(), responseObserver);
    }

    /**
     */
    public void updateItemLocation(protos.ItemLocationOuterClass.gItemLocation request,
        io.grpc.stub.StreamObserver<protos.ItemLocationOuterClass.gItemLocation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateItemLocationMethod(), responseObserver);
    }

    /**
     */
    public void removeItemLocation(protos.ItemLocationOuterClass.gItemLocation request,
        io.grpc.stub.StreamObserver<protos.ItemLocationOuterClass.gItemLocation> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveItemLocationMethod(), responseObserver);
    }

    /**
     */
    public void getByItemId(protos.ItemLocationOuterClass.gItemLocation request,
        io.grpc.stub.StreamObserver<protos.ItemLocationOuterClass.gItemLocationList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetByItemIdMethod(), responseObserver);
    }

    /**
     */
    public void getByLocationId(protos.ItemLocationOuterClass.gItemLocation request,
        io.grpc.stub.StreamObserver<protos.ItemLocationOuterClass.gItemLocationList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetByLocationIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterItemLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.ItemLocationOuterClass.gItemLocation,
                protos.ItemLocationOuterClass.gItemLocation>(
                  this, METHODID_REGISTER_ITEM_LOCATION)))
          .addMethod(
            getGetItemLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.ItemLocationOuterClass.gItemLocation,
                protos.ItemLocationOuterClass.gItemLocation>(
                  this, METHODID_GET_ITEM_LOCATION)))
          .addMethod(
            getGetAllItemLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.ItemLocationOuterClass.gItemLocation,
                protos.ItemLocationOuterClass.gItemLocationList>(
                  this, METHODID_GET_ALL_ITEM_LOCATION)))
          .addMethod(
            getUpdateItemLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.ItemLocationOuterClass.gItemLocation,
                protos.ItemLocationOuterClass.gItemLocation>(
                  this, METHODID_UPDATE_ITEM_LOCATION)))
          .addMethod(
            getRemoveItemLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.ItemLocationOuterClass.gItemLocation,
                protos.ItemLocationOuterClass.gItemLocation>(
                  this, METHODID_REMOVE_ITEM_LOCATION)))
          .addMethod(
            getGetByItemIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.ItemLocationOuterClass.gItemLocation,
                protos.ItemLocationOuterClass.gItemLocationList>(
                  this, METHODID_GET_BY_ITEM_ID)))
          .addMethod(
            getGetByLocationIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.ItemLocationOuterClass.gItemLocation,
                protos.ItemLocationOuterClass.gItemLocationList>(
                  this, METHODID_GET_BY_LOCATION_ID)))
          .build();
    }
  }

  /**
   */
  public static final class ItemLocationStub extends io.grpc.stub.AbstractStub<ItemLocationStub> {
    private ItemLocationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ItemLocationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemLocationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ItemLocationStub(channel, callOptions);
    }

    /**
     */
    public void registerItemLocation(protos.ItemLocationOuterClass.gItemLocation request,
        io.grpc.stub.StreamObserver<protos.ItemLocationOuterClass.gItemLocation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterItemLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getItemLocation(protos.ItemLocationOuterClass.gItemLocation request,
        io.grpc.stub.StreamObserver<protos.ItemLocationOuterClass.gItemLocation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetItemLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllItemLocation(protos.ItemLocationOuterClass.gItemLocation request,
        io.grpc.stub.StreamObserver<protos.ItemLocationOuterClass.gItemLocationList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllItemLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateItemLocation(protos.ItemLocationOuterClass.gItemLocation request,
        io.grpc.stub.StreamObserver<protos.ItemLocationOuterClass.gItemLocation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateItemLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeItemLocation(protos.ItemLocationOuterClass.gItemLocation request,
        io.grpc.stub.StreamObserver<protos.ItemLocationOuterClass.gItemLocation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveItemLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByItemId(protos.ItemLocationOuterClass.gItemLocation request,
        io.grpc.stub.StreamObserver<protos.ItemLocationOuterClass.gItemLocationList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetByItemIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByLocationId(protos.ItemLocationOuterClass.gItemLocation request,
        io.grpc.stub.StreamObserver<protos.ItemLocationOuterClass.gItemLocationList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetByLocationIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ItemLocationBlockingStub extends io.grpc.stub.AbstractStub<ItemLocationBlockingStub> {
    private ItemLocationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ItemLocationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemLocationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ItemLocationBlockingStub(channel, callOptions);
    }

    /**
     */
    public protos.ItemLocationOuterClass.gItemLocation registerItemLocation(protos.ItemLocationOuterClass.gItemLocation request) {
      return blockingUnaryCall(
          getChannel(), getRegisterItemLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.ItemLocationOuterClass.gItemLocation getItemLocation(protos.ItemLocationOuterClass.gItemLocation request) {
      return blockingUnaryCall(
          getChannel(), getGetItemLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.ItemLocationOuterClass.gItemLocationList getAllItemLocation(protos.ItemLocationOuterClass.gItemLocation request) {
      return blockingUnaryCall(
          getChannel(), getGetAllItemLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.ItemLocationOuterClass.gItemLocation updateItemLocation(protos.ItemLocationOuterClass.gItemLocation request) {
      return blockingUnaryCall(
          getChannel(), getUpdateItemLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.ItemLocationOuterClass.gItemLocation removeItemLocation(protos.ItemLocationOuterClass.gItemLocation request) {
      return blockingUnaryCall(
          getChannel(), getRemoveItemLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.ItemLocationOuterClass.gItemLocationList getByItemId(protos.ItemLocationOuterClass.gItemLocation request) {
      return blockingUnaryCall(
          getChannel(), getGetByItemIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.ItemLocationOuterClass.gItemLocationList getByLocationId(protos.ItemLocationOuterClass.gItemLocation request) {
      return blockingUnaryCall(
          getChannel(), getGetByLocationIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ItemLocationFutureStub extends io.grpc.stub.AbstractStub<ItemLocationFutureStub> {
    private ItemLocationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ItemLocationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemLocationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ItemLocationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.ItemLocationOuterClass.gItemLocation> registerItemLocation(
        protos.ItemLocationOuterClass.gItemLocation request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterItemLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.ItemLocationOuterClass.gItemLocation> getItemLocation(
        protos.ItemLocationOuterClass.gItemLocation request) {
      return futureUnaryCall(
          getChannel().newCall(getGetItemLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.ItemLocationOuterClass.gItemLocationList> getAllItemLocation(
        protos.ItemLocationOuterClass.gItemLocation request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllItemLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.ItemLocationOuterClass.gItemLocation> updateItemLocation(
        protos.ItemLocationOuterClass.gItemLocation request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateItemLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.ItemLocationOuterClass.gItemLocation> removeItemLocation(
        protos.ItemLocationOuterClass.gItemLocation request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveItemLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.ItemLocationOuterClass.gItemLocationList> getByItemId(
        protos.ItemLocationOuterClass.gItemLocation request) {
      return futureUnaryCall(
          getChannel().newCall(getGetByItemIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.ItemLocationOuterClass.gItemLocationList> getByLocationId(
        protos.ItemLocationOuterClass.gItemLocation request) {
      return futureUnaryCall(
          getChannel().newCall(getGetByLocationIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_ITEM_LOCATION = 0;
  private static final int METHODID_GET_ITEM_LOCATION = 1;
  private static final int METHODID_GET_ALL_ITEM_LOCATION = 2;
  private static final int METHODID_UPDATE_ITEM_LOCATION = 3;
  private static final int METHODID_REMOVE_ITEM_LOCATION = 4;
  private static final int METHODID_GET_BY_ITEM_ID = 5;
  private static final int METHODID_GET_BY_LOCATION_ID = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ItemLocationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ItemLocationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_ITEM_LOCATION:
          serviceImpl.registerItemLocation((protos.ItemLocationOuterClass.gItemLocation) request,
              (io.grpc.stub.StreamObserver<protos.ItemLocationOuterClass.gItemLocation>) responseObserver);
          break;
        case METHODID_GET_ITEM_LOCATION:
          serviceImpl.getItemLocation((protos.ItemLocationOuterClass.gItemLocation) request,
              (io.grpc.stub.StreamObserver<protos.ItemLocationOuterClass.gItemLocation>) responseObserver);
          break;
        case METHODID_GET_ALL_ITEM_LOCATION:
          serviceImpl.getAllItemLocation((protos.ItemLocationOuterClass.gItemLocation) request,
              (io.grpc.stub.StreamObserver<protos.ItemLocationOuterClass.gItemLocationList>) responseObserver);
          break;
        case METHODID_UPDATE_ITEM_LOCATION:
          serviceImpl.updateItemLocation((protos.ItemLocationOuterClass.gItemLocation) request,
              (io.grpc.stub.StreamObserver<protos.ItemLocationOuterClass.gItemLocation>) responseObserver);
          break;
        case METHODID_REMOVE_ITEM_LOCATION:
          serviceImpl.removeItemLocation((protos.ItemLocationOuterClass.gItemLocation) request,
              (io.grpc.stub.StreamObserver<protos.ItemLocationOuterClass.gItemLocation>) responseObserver);
          break;
        case METHODID_GET_BY_ITEM_ID:
          serviceImpl.getByItemId((protos.ItemLocationOuterClass.gItemLocation) request,
              (io.grpc.stub.StreamObserver<protos.ItemLocationOuterClass.gItemLocationList>) responseObserver);
          break;
        case METHODID_GET_BY_LOCATION_ID:
          serviceImpl.getByLocationId((protos.ItemLocationOuterClass.gItemLocation) request,
              (io.grpc.stub.StreamObserver<protos.ItemLocationOuterClass.gItemLocationList>) responseObserver);
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

  private static abstract class ItemLocationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ItemLocationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return protos.ItemLocationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ItemLocation");
    }
  }

  private static final class ItemLocationFileDescriptorSupplier
      extends ItemLocationBaseDescriptorSupplier {
    ItemLocationFileDescriptorSupplier() {}
  }

  private static final class ItemLocationMethodDescriptorSupplier
      extends ItemLocationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ItemLocationMethodDescriptorSupplier(String methodName) {
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
      synchronized (ItemLocationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ItemLocationFileDescriptorSupplier())
              .addMethod(getRegisterItemLocationMethod())
              .addMethod(getGetItemLocationMethod())
              .addMethod(getGetAllItemLocationMethod())
              .addMethod(getUpdateItemLocationMethod())
              .addMethod(getRemoveItemLocationMethod())
              .addMethod(getGetByItemIdMethod())
              .addMethod(getGetByLocationIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
