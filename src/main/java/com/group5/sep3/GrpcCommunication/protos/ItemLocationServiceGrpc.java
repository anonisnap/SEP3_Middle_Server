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
    comments = "Source: ItemLocationService.proto")
public final class ItemLocationServiceGrpc {

  private ItemLocationServiceGrpc() {}

  public static final String SERVICE_NAME = "Protos.ItemLocationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<protos.ItemLocationServiceOuterClass.gItemLocation,
      protos.ItemLocationServiceOuterClass.gItemLocation> getRegisterItemLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterItemLocation",
      requestType = protos.ItemLocationServiceOuterClass.gItemLocation.class,
      responseType = protos.ItemLocationServiceOuterClass.gItemLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.ItemLocationServiceOuterClass.gItemLocation,
      protos.ItemLocationServiceOuterClass.gItemLocation> getRegisterItemLocationMethod() {
    io.grpc.MethodDescriptor<protos.ItemLocationServiceOuterClass.gItemLocation, protos.ItemLocationServiceOuterClass.gItemLocation> getRegisterItemLocationMethod;
    if ((getRegisterItemLocationMethod = ItemLocationServiceGrpc.getRegisterItemLocationMethod) == null) {
      synchronized (ItemLocationServiceGrpc.class) {
        if ((getRegisterItemLocationMethod = ItemLocationServiceGrpc.getRegisterItemLocationMethod) == null) {
          ItemLocationServiceGrpc.getRegisterItemLocationMethod = getRegisterItemLocationMethod = 
              io.grpc.MethodDescriptor.<protos.ItemLocationServiceOuterClass.gItemLocation, protos.ItemLocationServiceOuterClass.gItemLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.ItemLocationService", "RegisterItemLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemLocationServiceOuterClass.gItemLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemLocationServiceOuterClass.gItemLocation.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemLocationServiceMethodDescriptorSupplier("RegisterItemLocation"))
                  .build();
          }
        }
     }
     return getRegisterItemLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.ItemLocationServiceOuterClass.gItemLocation,
      protos.ItemLocationServiceOuterClass.gItemLocation> getGetItemLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetItemLocation",
      requestType = protos.ItemLocationServiceOuterClass.gItemLocation.class,
      responseType = protos.ItemLocationServiceOuterClass.gItemLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.ItemLocationServiceOuterClass.gItemLocation,
      protos.ItemLocationServiceOuterClass.gItemLocation> getGetItemLocationMethod() {
    io.grpc.MethodDescriptor<protos.ItemLocationServiceOuterClass.gItemLocation, protos.ItemLocationServiceOuterClass.gItemLocation> getGetItemLocationMethod;
    if ((getGetItemLocationMethod = ItemLocationServiceGrpc.getGetItemLocationMethod) == null) {
      synchronized (ItemLocationServiceGrpc.class) {
        if ((getGetItemLocationMethod = ItemLocationServiceGrpc.getGetItemLocationMethod) == null) {
          ItemLocationServiceGrpc.getGetItemLocationMethod = getGetItemLocationMethod = 
              io.grpc.MethodDescriptor.<protos.ItemLocationServiceOuterClass.gItemLocation, protos.ItemLocationServiceOuterClass.gItemLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.ItemLocationService", "GetItemLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemLocationServiceOuterClass.gItemLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemLocationServiceOuterClass.gItemLocation.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemLocationServiceMethodDescriptorSupplier("GetItemLocation"))
                  .build();
          }
        }
     }
     return getGetItemLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.ItemLocationServiceOuterClass.gItemLocation,
      protos.ItemLocationServiceOuterClass.gItemLocationList> getGetAllItemLocationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllItemLocations",
      requestType = protos.ItemLocationServiceOuterClass.gItemLocation.class,
      responseType = protos.ItemLocationServiceOuterClass.gItemLocationList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.ItemLocationServiceOuterClass.gItemLocation,
      protos.ItemLocationServiceOuterClass.gItemLocationList> getGetAllItemLocationsMethod() {
    io.grpc.MethodDescriptor<protos.ItemLocationServiceOuterClass.gItemLocation, protos.ItemLocationServiceOuterClass.gItemLocationList> getGetAllItemLocationsMethod;
    if ((getGetAllItemLocationsMethod = ItemLocationServiceGrpc.getGetAllItemLocationsMethod) == null) {
      synchronized (ItemLocationServiceGrpc.class) {
        if ((getGetAllItemLocationsMethod = ItemLocationServiceGrpc.getGetAllItemLocationsMethod) == null) {
          ItemLocationServiceGrpc.getGetAllItemLocationsMethod = getGetAllItemLocationsMethod = 
              io.grpc.MethodDescriptor.<protos.ItemLocationServiceOuterClass.gItemLocation, protos.ItemLocationServiceOuterClass.gItemLocationList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.ItemLocationService", "GetAllItemLocations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemLocationServiceOuterClass.gItemLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemLocationServiceOuterClass.gItemLocationList.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemLocationServiceMethodDescriptorSupplier("GetAllItemLocations"))
                  .build();
          }
        }
     }
     return getGetAllItemLocationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.ItemLocationServiceOuterClass.gItemLocation,
      protos.ItemLocationServiceOuterClass.gItemLocation> getUpdateItemLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateItemLocation",
      requestType = protos.ItemLocationServiceOuterClass.gItemLocation.class,
      responseType = protos.ItemLocationServiceOuterClass.gItemLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.ItemLocationServiceOuterClass.gItemLocation,
      protos.ItemLocationServiceOuterClass.gItemLocation> getUpdateItemLocationMethod() {
    io.grpc.MethodDescriptor<protos.ItemLocationServiceOuterClass.gItemLocation, protos.ItemLocationServiceOuterClass.gItemLocation> getUpdateItemLocationMethod;
    if ((getUpdateItemLocationMethod = ItemLocationServiceGrpc.getUpdateItemLocationMethod) == null) {
      synchronized (ItemLocationServiceGrpc.class) {
        if ((getUpdateItemLocationMethod = ItemLocationServiceGrpc.getUpdateItemLocationMethod) == null) {
          ItemLocationServiceGrpc.getUpdateItemLocationMethod = getUpdateItemLocationMethod = 
              io.grpc.MethodDescriptor.<protos.ItemLocationServiceOuterClass.gItemLocation, protos.ItemLocationServiceOuterClass.gItemLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.ItemLocationService", "UpdateItemLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemLocationServiceOuterClass.gItemLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemLocationServiceOuterClass.gItemLocation.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemLocationServiceMethodDescriptorSupplier("UpdateItemLocation"))
                  .build();
          }
        }
     }
     return getUpdateItemLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.ItemLocationServiceOuterClass.gItemLocation,
      protos.ItemLocationServiceOuterClass.gItemLocation> getRemoveItemLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveItemLocation",
      requestType = protos.ItemLocationServiceOuterClass.gItemLocation.class,
      responseType = protos.ItemLocationServiceOuterClass.gItemLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.ItemLocationServiceOuterClass.gItemLocation,
      protos.ItemLocationServiceOuterClass.gItemLocation> getRemoveItemLocationMethod() {
    io.grpc.MethodDescriptor<protos.ItemLocationServiceOuterClass.gItemLocation, protos.ItemLocationServiceOuterClass.gItemLocation> getRemoveItemLocationMethod;
    if ((getRemoveItemLocationMethod = ItemLocationServiceGrpc.getRemoveItemLocationMethod) == null) {
      synchronized (ItemLocationServiceGrpc.class) {
        if ((getRemoveItemLocationMethod = ItemLocationServiceGrpc.getRemoveItemLocationMethod) == null) {
          ItemLocationServiceGrpc.getRemoveItemLocationMethod = getRemoveItemLocationMethod = 
              io.grpc.MethodDescriptor.<protos.ItemLocationServiceOuterClass.gItemLocation, protos.ItemLocationServiceOuterClass.gItemLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.ItemLocationService", "RemoveItemLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemLocationServiceOuterClass.gItemLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemLocationServiceOuterClass.gItemLocation.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemLocationServiceMethodDescriptorSupplier("RemoveItemLocation"))
                  .build();
          }
        }
     }
     return getRemoveItemLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.ItemLocationServiceOuterClass.gItemLocation,
      protos.ItemLocationServiceOuterClass.gItemLocationList> getGetByItemIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByItemId",
      requestType = protos.ItemLocationServiceOuterClass.gItemLocation.class,
      responseType = protos.ItemLocationServiceOuterClass.gItemLocationList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.ItemLocationServiceOuterClass.gItemLocation,
      protos.ItemLocationServiceOuterClass.gItemLocationList> getGetByItemIdMethod() {
    io.grpc.MethodDescriptor<protos.ItemLocationServiceOuterClass.gItemLocation, protos.ItemLocationServiceOuterClass.gItemLocationList> getGetByItemIdMethod;
    if ((getGetByItemIdMethod = ItemLocationServiceGrpc.getGetByItemIdMethod) == null) {
      synchronized (ItemLocationServiceGrpc.class) {
        if ((getGetByItemIdMethod = ItemLocationServiceGrpc.getGetByItemIdMethod) == null) {
          ItemLocationServiceGrpc.getGetByItemIdMethod = getGetByItemIdMethod = 
              io.grpc.MethodDescriptor.<protos.ItemLocationServiceOuterClass.gItemLocation, protos.ItemLocationServiceOuterClass.gItemLocationList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.ItemLocationService", "GetByItemId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemLocationServiceOuterClass.gItemLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemLocationServiceOuterClass.gItemLocationList.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemLocationServiceMethodDescriptorSupplier("GetByItemId"))
                  .build();
          }
        }
     }
     return getGetByItemIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.ItemLocationServiceOuterClass.gItemLocation,
      protos.ItemLocationServiceOuterClass.gItemLocationList> getGetByLocationIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByLocationId",
      requestType = protos.ItemLocationServiceOuterClass.gItemLocation.class,
      responseType = protos.ItemLocationServiceOuterClass.gItemLocationList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.ItemLocationServiceOuterClass.gItemLocation,
      protos.ItemLocationServiceOuterClass.gItemLocationList> getGetByLocationIdMethod() {
    io.grpc.MethodDescriptor<protos.ItemLocationServiceOuterClass.gItemLocation, protos.ItemLocationServiceOuterClass.gItemLocationList> getGetByLocationIdMethod;
    if ((getGetByLocationIdMethod = ItemLocationServiceGrpc.getGetByLocationIdMethod) == null) {
      synchronized (ItemLocationServiceGrpc.class) {
        if ((getGetByLocationIdMethod = ItemLocationServiceGrpc.getGetByLocationIdMethod) == null) {
          ItemLocationServiceGrpc.getGetByLocationIdMethod = getGetByLocationIdMethod = 
              io.grpc.MethodDescriptor.<protos.ItemLocationServiceOuterClass.gItemLocation, protos.ItemLocationServiceOuterClass.gItemLocationList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.ItemLocationService", "GetByLocationId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemLocationServiceOuterClass.gItemLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemLocationServiceOuterClass.gItemLocationList.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemLocationServiceMethodDescriptorSupplier("GetByLocationId"))
                  .build();
          }
        }
     }
     return getGetByLocationIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ItemLocationServiceStub newStub(io.grpc.Channel channel) {
    return new ItemLocationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ItemLocationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ItemLocationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ItemLocationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ItemLocationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ItemLocationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void registerItemLocation(protos.ItemLocationServiceOuterClass.gItemLocation request,
        io.grpc.stub.StreamObserver<protos.ItemLocationServiceOuterClass.gItemLocation> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterItemLocationMethod(), responseObserver);
    }

    /**
     */
    public void getItemLocation(protos.ItemLocationServiceOuterClass.gItemLocation request,
        io.grpc.stub.StreamObserver<protos.ItemLocationServiceOuterClass.gItemLocation> responseObserver) {
      asyncUnimplementedUnaryCall(getGetItemLocationMethod(), responseObserver);
    }

    /**
     */
    public void getAllItemLocations(protos.ItemLocationServiceOuterClass.gItemLocation request,
        io.grpc.stub.StreamObserver<protos.ItemLocationServiceOuterClass.gItemLocationList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllItemLocationsMethod(), responseObserver);
    }

    /**
     */
    public void updateItemLocation(protos.ItemLocationServiceOuterClass.gItemLocation request,
        io.grpc.stub.StreamObserver<protos.ItemLocationServiceOuterClass.gItemLocation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateItemLocationMethod(), responseObserver);
    }

    /**
     */
    public void removeItemLocation(protos.ItemLocationServiceOuterClass.gItemLocation request,
        io.grpc.stub.StreamObserver<protos.ItemLocationServiceOuterClass.gItemLocation> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveItemLocationMethod(), responseObserver);
    }

    /**
     */
    public void getByItemId(protos.ItemLocationServiceOuterClass.gItemLocation request,
        io.grpc.stub.StreamObserver<protos.ItemLocationServiceOuterClass.gItemLocationList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetByItemIdMethod(), responseObserver);
    }

    /**
     */
    public void getByLocationId(protos.ItemLocationServiceOuterClass.gItemLocation request,
        io.grpc.stub.StreamObserver<protos.ItemLocationServiceOuterClass.gItemLocationList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetByLocationIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterItemLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.ItemLocationServiceOuterClass.gItemLocation,
                protos.ItemLocationServiceOuterClass.gItemLocation>(
                  this, METHODID_REGISTER_ITEM_LOCATION)))
          .addMethod(
            getGetItemLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.ItemLocationServiceOuterClass.gItemLocation,
                protos.ItemLocationServiceOuterClass.gItemLocation>(
                  this, METHODID_GET_ITEM_LOCATION)))
          .addMethod(
            getGetAllItemLocationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.ItemLocationServiceOuterClass.gItemLocation,
                protos.ItemLocationServiceOuterClass.gItemLocationList>(
                  this, METHODID_GET_ALL_ITEM_LOCATIONS)))
          .addMethod(
            getUpdateItemLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.ItemLocationServiceOuterClass.gItemLocation,
                protos.ItemLocationServiceOuterClass.gItemLocation>(
                  this, METHODID_UPDATE_ITEM_LOCATION)))
          .addMethod(
            getRemoveItemLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.ItemLocationServiceOuterClass.gItemLocation,
                protos.ItemLocationServiceOuterClass.gItemLocation>(
                  this, METHODID_REMOVE_ITEM_LOCATION)))
          .addMethod(
            getGetByItemIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.ItemLocationServiceOuterClass.gItemLocation,
                protos.ItemLocationServiceOuterClass.gItemLocationList>(
                  this, METHODID_GET_BY_ITEM_ID)))
          .addMethod(
            getGetByLocationIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.ItemLocationServiceOuterClass.gItemLocation,
                protos.ItemLocationServiceOuterClass.gItemLocationList>(
                  this, METHODID_GET_BY_LOCATION_ID)))
          .build();
    }
  }

  /**
   */
  public static final class ItemLocationServiceStub extends io.grpc.stub.AbstractStub<ItemLocationServiceStub> {
    private ItemLocationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ItemLocationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemLocationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ItemLocationServiceStub(channel, callOptions);
    }

    /**
     */
    public void registerItemLocation(protos.ItemLocationServiceOuterClass.gItemLocation request,
        io.grpc.stub.StreamObserver<protos.ItemLocationServiceOuterClass.gItemLocation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterItemLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getItemLocation(protos.ItemLocationServiceOuterClass.gItemLocation request,
        io.grpc.stub.StreamObserver<protos.ItemLocationServiceOuterClass.gItemLocation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetItemLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllItemLocations(protos.ItemLocationServiceOuterClass.gItemLocation request,
        io.grpc.stub.StreamObserver<protos.ItemLocationServiceOuterClass.gItemLocationList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllItemLocationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateItemLocation(protos.ItemLocationServiceOuterClass.gItemLocation request,
        io.grpc.stub.StreamObserver<protos.ItemLocationServiceOuterClass.gItemLocation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateItemLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeItemLocation(protos.ItemLocationServiceOuterClass.gItemLocation request,
        io.grpc.stub.StreamObserver<protos.ItemLocationServiceOuterClass.gItemLocation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveItemLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByItemId(protos.ItemLocationServiceOuterClass.gItemLocation request,
        io.grpc.stub.StreamObserver<protos.ItemLocationServiceOuterClass.gItemLocationList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetByItemIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByLocationId(protos.ItemLocationServiceOuterClass.gItemLocation request,
        io.grpc.stub.StreamObserver<protos.ItemLocationServiceOuterClass.gItemLocationList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetByLocationIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ItemLocationServiceBlockingStub extends io.grpc.stub.AbstractStub<ItemLocationServiceBlockingStub> {
    private ItemLocationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ItemLocationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemLocationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ItemLocationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public protos.ItemLocationServiceOuterClass.gItemLocation registerItemLocation(protos.ItemLocationServiceOuterClass.gItemLocation request) {
      return blockingUnaryCall(
          getChannel(), getRegisterItemLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.ItemLocationServiceOuterClass.gItemLocation getItemLocation(protos.ItemLocationServiceOuterClass.gItemLocation request) {
      return blockingUnaryCall(
          getChannel(), getGetItemLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.ItemLocationServiceOuterClass.gItemLocationList getAllItemLocations(protos.ItemLocationServiceOuterClass.gItemLocation request) {
      return blockingUnaryCall(
          getChannel(), getGetAllItemLocationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.ItemLocationServiceOuterClass.gItemLocation updateItemLocation(protos.ItemLocationServiceOuterClass.gItemLocation request) {
      return blockingUnaryCall(
          getChannel(), getUpdateItemLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.ItemLocationServiceOuterClass.gItemLocation removeItemLocation(protos.ItemLocationServiceOuterClass.gItemLocation request) {
      return blockingUnaryCall(
          getChannel(), getRemoveItemLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.ItemLocationServiceOuterClass.gItemLocationList getByItemId(protos.ItemLocationServiceOuterClass.gItemLocation request) {
      return blockingUnaryCall(
          getChannel(), getGetByItemIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.ItemLocationServiceOuterClass.gItemLocationList getByLocationId(protos.ItemLocationServiceOuterClass.gItemLocation request) {
      return blockingUnaryCall(
          getChannel(), getGetByLocationIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ItemLocationServiceFutureStub extends io.grpc.stub.AbstractStub<ItemLocationServiceFutureStub> {
    private ItemLocationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ItemLocationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemLocationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ItemLocationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.ItemLocationServiceOuterClass.gItemLocation> registerItemLocation(
        protos.ItemLocationServiceOuterClass.gItemLocation request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterItemLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.ItemLocationServiceOuterClass.gItemLocation> getItemLocation(
        protos.ItemLocationServiceOuterClass.gItemLocation request) {
      return futureUnaryCall(
          getChannel().newCall(getGetItemLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.ItemLocationServiceOuterClass.gItemLocationList> getAllItemLocations(
        protos.ItemLocationServiceOuterClass.gItemLocation request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllItemLocationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.ItemLocationServiceOuterClass.gItemLocation> updateItemLocation(
        protos.ItemLocationServiceOuterClass.gItemLocation request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateItemLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.ItemLocationServiceOuterClass.gItemLocation> removeItemLocation(
        protos.ItemLocationServiceOuterClass.gItemLocation request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveItemLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.ItemLocationServiceOuterClass.gItemLocationList> getByItemId(
        protos.ItemLocationServiceOuterClass.gItemLocation request) {
      return futureUnaryCall(
          getChannel().newCall(getGetByItemIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.ItemLocationServiceOuterClass.gItemLocationList> getByLocationId(
        protos.ItemLocationServiceOuterClass.gItemLocation request) {
      return futureUnaryCall(
          getChannel().newCall(getGetByLocationIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_ITEM_LOCATION = 0;
  private static final int METHODID_GET_ITEM_LOCATION = 1;
  private static final int METHODID_GET_ALL_ITEM_LOCATIONS = 2;
  private static final int METHODID_UPDATE_ITEM_LOCATION = 3;
  private static final int METHODID_REMOVE_ITEM_LOCATION = 4;
  private static final int METHODID_GET_BY_ITEM_ID = 5;
  private static final int METHODID_GET_BY_LOCATION_ID = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ItemLocationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ItemLocationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_ITEM_LOCATION:
          serviceImpl.registerItemLocation((protos.ItemLocationServiceOuterClass.gItemLocation) request,
              (io.grpc.stub.StreamObserver<protos.ItemLocationServiceOuterClass.gItemLocation>) responseObserver);
          break;
        case METHODID_GET_ITEM_LOCATION:
          serviceImpl.getItemLocation((protos.ItemLocationServiceOuterClass.gItemLocation) request,
              (io.grpc.stub.StreamObserver<protos.ItemLocationServiceOuterClass.gItemLocation>) responseObserver);
          break;
        case METHODID_GET_ALL_ITEM_LOCATIONS:
          serviceImpl.getAllItemLocations((protos.ItemLocationServiceOuterClass.gItemLocation) request,
              (io.grpc.stub.StreamObserver<protos.ItemLocationServiceOuterClass.gItemLocationList>) responseObserver);
          break;
        case METHODID_UPDATE_ITEM_LOCATION:
          serviceImpl.updateItemLocation((protos.ItemLocationServiceOuterClass.gItemLocation) request,
              (io.grpc.stub.StreamObserver<protos.ItemLocationServiceOuterClass.gItemLocation>) responseObserver);
          break;
        case METHODID_REMOVE_ITEM_LOCATION:
          serviceImpl.removeItemLocation((protos.ItemLocationServiceOuterClass.gItemLocation) request,
              (io.grpc.stub.StreamObserver<protos.ItemLocationServiceOuterClass.gItemLocation>) responseObserver);
          break;
        case METHODID_GET_BY_ITEM_ID:
          serviceImpl.getByItemId((protos.ItemLocationServiceOuterClass.gItemLocation) request,
              (io.grpc.stub.StreamObserver<protos.ItemLocationServiceOuterClass.gItemLocationList>) responseObserver);
          break;
        case METHODID_GET_BY_LOCATION_ID:
          serviceImpl.getByLocationId((protos.ItemLocationServiceOuterClass.gItemLocation) request,
              (io.grpc.stub.StreamObserver<protos.ItemLocationServiceOuterClass.gItemLocationList>) responseObserver);
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

  private static abstract class ItemLocationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ItemLocationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return protos.ItemLocationServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ItemLocationService");
    }
  }

  private static final class ItemLocationServiceFileDescriptorSupplier
      extends ItemLocationServiceBaseDescriptorSupplier {
    ItemLocationServiceFileDescriptorSupplier() {}
  }

  private static final class ItemLocationServiceMethodDescriptorSupplier
      extends ItemLocationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ItemLocationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ItemLocationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ItemLocationServiceFileDescriptorSupplier())
              .addMethod(getRegisterItemLocationMethod())
              .addMethod(getGetItemLocationMethod())
              .addMethod(getGetAllItemLocationsMethod())
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
