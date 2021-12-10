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
    comments = "Source: InventoryService.proto")
public final class InventoryServiceGrpc {

  private InventoryServiceGrpc() {}

  public static final String SERVICE_NAME = "Protos.InventoryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<protos.InventoryServiceOuterClass.gInventory,
      protos.InventoryServiceOuterClass.gInventory> getRegisterInventoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterInventory",
      requestType = protos.InventoryServiceOuterClass.gInventory.class,
      responseType = protos.InventoryServiceOuterClass.gInventory.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.InventoryServiceOuterClass.gInventory,
      protos.InventoryServiceOuterClass.gInventory> getRegisterInventoryMethod() {
    io.grpc.MethodDescriptor<protos.InventoryServiceOuterClass.gInventory, protos.InventoryServiceOuterClass.gInventory> getRegisterInventoryMethod;
    if ((getRegisterInventoryMethod = InventoryServiceGrpc.getRegisterInventoryMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getRegisterInventoryMethod = InventoryServiceGrpc.getRegisterInventoryMethod) == null) {
          InventoryServiceGrpc.getRegisterInventoryMethod = getRegisterInventoryMethod = 
              io.grpc.MethodDescriptor.<protos.InventoryServiceOuterClass.gInventory, protos.InventoryServiceOuterClass.gInventory>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.InventoryService", "RegisterInventory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.InventoryServiceOuterClass.gInventory.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.InventoryServiceOuterClass.gInventory.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("RegisterInventory"))
                  .build();
          }
        }
     }
     return getRegisterInventoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.InventoryServiceOuterClass.gInventoryId,
      protos.InventoryServiceOuterClass.gInventory> getGetInventoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInventory",
      requestType = protos.InventoryServiceOuterClass.gInventoryId.class,
      responseType = protos.InventoryServiceOuterClass.gInventory.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.InventoryServiceOuterClass.gInventoryId,
      protos.InventoryServiceOuterClass.gInventory> getGetInventoryMethod() {
    io.grpc.MethodDescriptor<protos.InventoryServiceOuterClass.gInventoryId, protos.InventoryServiceOuterClass.gInventory> getGetInventoryMethod;
    if ((getGetInventoryMethod = InventoryServiceGrpc.getGetInventoryMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getGetInventoryMethod = InventoryServiceGrpc.getGetInventoryMethod) == null) {
          InventoryServiceGrpc.getGetInventoryMethod = getGetInventoryMethod = 
              io.grpc.MethodDescriptor.<protos.InventoryServiceOuterClass.gInventoryId, protos.InventoryServiceOuterClass.gInventory>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.InventoryService", "GetInventory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.InventoryServiceOuterClass.gInventoryId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.InventoryServiceOuterClass.gInventory.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("GetInventory"))
                  .build();
          }
        }
     }
     return getGetInventoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.InventoryServiceOuterClass.gInventory,
      protos.InventoryServiceOuterClass.gInventoryList> getGetAllInventoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllInventory",
      requestType = protos.InventoryServiceOuterClass.gInventory.class,
      responseType = protos.InventoryServiceOuterClass.gInventoryList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.InventoryServiceOuterClass.gInventory,
      protos.InventoryServiceOuterClass.gInventoryList> getGetAllInventoryMethod() {
    io.grpc.MethodDescriptor<protos.InventoryServiceOuterClass.gInventory, protos.InventoryServiceOuterClass.gInventoryList> getGetAllInventoryMethod;
    if ((getGetAllInventoryMethod = InventoryServiceGrpc.getGetAllInventoryMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getGetAllInventoryMethod = InventoryServiceGrpc.getGetAllInventoryMethod) == null) {
          InventoryServiceGrpc.getGetAllInventoryMethod = getGetAllInventoryMethod = 
              io.grpc.MethodDescriptor.<protos.InventoryServiceOuterClass.gInventory, protos.InventoryServiceOuterClass.gInventoryList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.InventoryService", "GetAllInventory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.InventoryServiceOuterClass.gInventory.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.InventoryServiceOuterClass.gInventoryList.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("GetAllInventory"))
                  .build();
          }
        }
     }
     return getGetAllInventoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.InventoryServiceOuterClass.gInventory,
      protos.InventoryServiceOuterClass.gInventory> getUpdateInventoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateInventory",
      requestType = protos.InventoryServiceOuterClass.gInventory.class,
      responseType = protos.InventoryServiceOuterClass.gInventory.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.InventoryServiceOuterClass.gInventory,
      protos.InventoryServiceOuterClass.gInventory> getUpdateInventoryMethod() {
    io.grpc.MethodDescriptor<protos.InventoryServiceOuterClass.gInventory, protos.InventoryServiceOuterClass.gInventory> getUpdateInventoryMethod;
    if ((getUpdateInventoryMethod = InventoryServiceGrpc.getUpdateInventoryMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getUpdateInventoryMethod = InventoryServiceGrpc.getUpdateInventoryMethod) == null) {
          InventoryServiceGrpc.getUpdateInventoryMethod = getUpdateInventoryMethod = 
              io.grpc.MethodDescriptor.<protos.InventoryServiceOuterClass.gInventory, protos.InventoryServiceOuterClass.gInventory>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.InventoryService", "UpdateInventory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.InventoryServiceOuterClass.gInventory.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.InventoryServiceOuterClass.gInventory.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("UpdateInventory"))
                  .build();
          }
        }
     }
     return getUpdateInventoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.InventoryServiceOuterClass.gInventoryId,
      Protos.ProtoUtil.gBoolValue> getRemoveInventoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveInventory",
      requestType = protos.InventoryServiceOuterClass.gInventoryId.class,
      responseType = Protos.ProtoUtil.gBoolValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.InventoryServiceOuterClass.gInventoryId,
      Protos.ProtoUtil.gBoolValue> getRemoveInventoryMethod() {
    io.grpc.MethodDescriptor<protos.InventoryServiceOuterClass.gInventoryId, Protos.ProtoUtil.gBoolValue> getRemoveInventoryMethod;
    if ((getRemoveInventoryMethod = InventoryServiceGrpc.getRemoveInventoryMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getRemoveInventoryMethod = InventoryServiceGrpc.getRemoveInventoryMethod) == null) {
          InventoryServiceGrpc.getRemoveInventoryMethod = getRemoveInventoryMethod = 
              io.grpc.MethodDescriptor.<protos.InventoryServiceOuterClass.gInventoryId, Protos.ProtoUtil.gBoolValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.InventoryService", "RemoveInventory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.InventoryServiceOuterClass.gInventoryId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Protos.ProtoUtil.gBoolValue.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("RemoveInventory"))
                  .build();
          }
        }
     }
     return getRemoveInventoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.ItemServiceOuterClass.gItemId,
      protos.InventoryServiceOuterClass.gInventoryList> getGetByItemIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByItemId",
      requestType = protos.ItemServiceOuterClass.gItemId.class,
      responseType = protos.InventoryServiceOuterClass.gInventoryList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.ItemServiceOuterClass.gItemId,
      protos.InventoryServiceOuterClass.gInventoryList> getGetByItemIdMethod() {
    io.grpc.MethodDescriptor<protos.ItemServiceOuterClass.gItemId, protos.InventoryServiceOuterClass.gInventoryList> getGetByItemIdMethod;
    if ((getGetByItemIdMethod = InventoryServiceGrpc.getGetByItemIdMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getGetByItemIdMethod = InventoryServiceGrpc.getGetByItemIdMethod) == null) {
          InventoryServiceGrpc.getGetByItemIdMethod = getGetByItemIdMethod = 
              io.grpc.MethodDescriptor.<protos.ItemServiceOuterClass.gItemId, protos.InventoryServiceOuterClass.gInventoryList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.InventoryService", "GetByItemId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.ItemServiceOuterClass.gItemId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.InventoryServiceOuterClass.gInventoryList.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("GetByItemId"))
                  .build();
          }
        }
     }
     return getGetByItemIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.LocationServiceOuterClass.gLocationId,
      protos.InventoryServiceOuterClass.gInventoryList> getGetByLocationIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByLocationId",
      requestType = protos.LocationServiceOuterClass.gLocationId.class,
      responseType = protos.InventoryServiceOuterClass.gInventoryList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.LocationServiceOuterClass.gLocationId,
      protos.InventoryServiceOuterClass.gInventoryList> getGetByLocationIdMethod() {
    io.grpc.MethodDescriptor<protos.LocationServiceOuterClass.gLocationId, protos.InventoryServiceOuterClass.gInventoryList> getGetByLocationIdMethod;
    if ((getGetByLocationIdMethod = InventoryServiceGrpc.getGetByLocationIdMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getGetByLocationIdMethod = InventoryServiceGrpc.getGetByLocationIdMethod) == null) {
          InventoryServiceGrpc.getGetByLocationIdMethod = getGetByLocationIdMethod = 
              io.grpc.MethodDescriptor.<protos.LocationServiceOuterClass.gLocationId, protos.InventoryServiceOuterClass.gInventoryList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.InventoryService", "GetByLocationId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.LocationServiceOuterClass.gLocationId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.InventoryServiceOuterClass.gInventoryList.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("GetByLocationId"))
                  .build();
          }
        }
     }
     return getGetByLocationIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.InventoryServiceOuterClass.gInventory,
      protos.InventoryServiceOuterClass.gInventoryList> getGetStockInventoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStockInventory",
      requestType = protos.InventoryServiceOuterClass.gInventory.class,
      responseType = protos.InventoryServiceOuterClass.gInventoryList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.InventoryServiceOuterClass.gInventory,
      protos.InventoryServiceOuterClass.gInventoryList> getGetStockInventoryMethod() {
    io.grpc.MethodDescriptor<protos.InventoryServiceOuterClass.gInventory, protos.InventoryServiceOuterClass.gInventoryList> getGetStockInventoryMethod;
    if ((getGetStockInventoryMethod = InventoryServiceGrpc.getGetStockInventoryMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getGetStockInventoryMethod = InventoryServiceGrpc.getGetStockInventoryMethod) == null) {
          InventoryServiceGrpc.getGetStockInventoryMethod = getGetStockInventoryMethod = 
              io.grpc.MethodDescriptor.<protos.InventoryServiceOuterClass.gInventory, protos.InventoryServiceOuterClass.gInventoryList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.InventoryService", "GetStockInventory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.InventoryServiceOuterClass.gInventory.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.InventoryServiceOuterClass.gInventoryList.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("GetStockInventory"))
                  .build();
          }
        }
     }
     return getGetStockInventoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InventoryServiceStub newStub(io.grpc.Channel channel) {
    return new InventoryServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InventoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InventoryServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InventoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InventoryServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class InventoryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void registerInventory(protos.InventoryServiceOuterClass.gInventory request,
        io.grpc.stub.StreamObserver<protos.InventoryServiceOuterClass.gInventory> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterInventoryMethod(), responseObserver);
    }

    /**
     */
    public void getInventory(protos.InventoryServiceOuterClass.gInventoryId request,
        io.grpc.stub.StreamObserver<protos.InventoryServiceOuterClass.gInventory> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInventoryMethod(), responseObserver);
    }

    /**
     */
    public void getAllInventory(protos.InventoryServiceOuterClass.gInventory request,
        io.grpc.stub.StreamObserver<protos.InventoryServiceOuterClass.gInventoryList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllInventoryMethod(), responseObserver);
    }

    /**
     */
    public void updateInventory(protos.InventoryServiceOuterClass.gInventory request,
        io.grpc.stub.StreamObserver<protos.InventoryServiceOuterClass.gInventory> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateInventoryMethod(), responseObserver);
    }

    /**
     */
    public void removeInventory(protos.InventoryServiceOuterClass.gInventoryId request,
        io.grpc.stub.StreamObserver<Protos.ProtoUtil.gBoolValue> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveInventoryMethod(), responseObserver);
    }

    /**
     */
    public void getByItemId(protos.ItemServiceOuterClass.gItemId request,
        io.grpc.stub.StreamObserver<protos.InventoryServiceOuterClass.gInventoryList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetByItemIdMethod(), responseObserver);
    }

    /**
     */
    public void getByLocationId(protos.LocationServiceOuterClass.gLocationId request,
        io.grpc.stub.StreamObserver<protos.InventoryServiceOuterClass.gInventoryList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetByLocationIdMethod(), responseObserver);
    }

    /**
     */
    public void getStockInventory(protos.InventoryServiceOuterClass.gInventory request,
        io.grpc.stub.StreamObserver<protos.InventoryServiceOuterClass.gInventoryList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStockInventoryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterInventoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.InventoryServiceOuterClass.gInventory,
                protos.InventoryServiceOuterClass.gInventory>(
                  this, METHODID_REGISTER_INVENTORY)))
          .addMethod(
            getGetInventoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.InventoryServiceOuterClass.gInventoryId,
                protos.InventoryServiceOuterClass.gInventory>(
                  this, METHODID_GET_INVENTORY)))
          .addMethod(
            getGetAllInventoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.InventoryServiceOuterClass.gInventory,
                protos.InventoryServiceOuterClass.gInventoryList>(
                  this, METHODID_GET_ALL_INVENTORY)))
          .addMethod(
            getUpdateInventoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.InventoryServiceOuterClass.gInventory,
                protos.InventoryServiceOuterClass.gInventory>(
                  this, METHODID_UPDATE_INVENTORY)))
          .addMethod(
            getRemoveInventoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.InventoryServiceOuterClass.gInventoryId,
                Protos.ProtoUtil.gBoolValue>(
                  this, METHODID_REMOVE_INVENTORY)))
          .addMethod(
            getGetByItemIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.ItemServiceOuterClass.gItemId,
                protos.InventoryServiceOuterClass.gInventoryList>(
                  this, METHODID_GET_BY_ITEM_ID)))
          .addMethod(
            getGetByLocationIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.LocationServiceOuterClass.gLocationId,
                protos.InventoryServiceOuterClass.gInventoryList>(
                  this, METHODID_GET_BY_LOCATION_ID)))
          .addMethod(
            getGetStockInventoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.InventoryServiceOuterClass.gInventory,
                protos.InventoryServiceOuterClass.gInventoryList>(
                  this, METHODID_GET_STOCK_INVENTORY)))
          .build();
    }
  }

  /**
   */
  public static final class InventoryServiceStub extends io.grpc.stub.AbstractStub<InventoryServiceStub> {
    private InventoryServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InventoryServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InventoryServiceStub(channel, callOptions);
    }

    /**
     */
    public void registerInventory(protos.InventoryServiceOuterClass.gInventory request,
        io.grpc.stub.StreamObserver<protos.InventoryServiceOuterClass.gInventory> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterInventoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getInventory(protos.InventoryServiceOuterClass.gInventoryId request,
        io.grpc.stub.StreamObserver<protos.InventoryServiceOuterClass.gInventory> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInventoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllInventory(protos.InventoryServiceOuterClass.gInventory request,
        io.grpc.stub.StreamObserver<protos.InventoryServiceOuterClass.gInventoryList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllInventoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateInventory(protos.InventoryServiceOuterClass.gInventory request,
        io.grpc.stub.StreamObserver<protos.InventoryServiceOuterClass.gInventory> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateInventoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeInventory(protos.InventoryServiceOuterClass.gInventoryId request,
        io.grpc.stub.StreamObserver<Protos.ProtoUtil.gBoolValue> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveInventoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByItemId(protos.ItemServiceOuterClass.gItemId request,
        io.grpc.stub.StreamObserver<protos.InventoryServiceOuterClass.gInventoryList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetByItemIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByLocationId(protos.LocationServiceOuterClass.gLocationId request,
        io.grpc.stub.StreamObserver<protos.InventoryServiceOuterClass.gInventoryList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetByLocationIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStockInventory(protos.InventoryServiceOuterClass.gInventory request,
        io.grpc.stub.StreamObserver<protos.InventoryServiceOuterClass.gInventoryList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStockInventoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InventoryServiceBlockingStub extends io.grpc.stub.AbstractStub<InventoryServiceBlockingStub> {
    private InventoryServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InventoryServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InventoryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public protos.InventoryServiceOuterClass.gInventory registerInventory(protos.InventoryServiceOuterClass.gInventory request) {
      return blockingUnaryCall(
          getChannel(), getRegisterInventoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.InventoryServiceOuterClass.gInventory getInventory(protos.InventoryServiceOuterClass.gInventoryId request) {
      return blockingUnaryCall(
          getChannel(), getGetInventoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.InventoryServiceOuterClass.gInventoryList getAllInventory(protos.InventoryServiceOuterClass.gInventory request) {
      return blockingUnaryCall(
          getChannel(), getGetAllInventoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.InventoryServiceOuterClass.gInventory updateInventory(protos.InventoryServiceOuterClass.gInventory request) {
      return blockingUnaryCall(
          getChannel(), getUpdateInventoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public Protos.ProtoUtil.gBoolValue removeInventory(protos.InventoryServiceOuterClass.gInventoryId request) {
      return blockingUnaryCall(
          getChannel(), getRemoveInventoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.InventoryServiceOuterClass.gInventoryList getByItemId(protos.ItemServiceOuterClass.gItemId request) {
      return blockingUnaryCall(
          getChannel(), getGetByItemIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.InventoryServiceOuterClass.gInventoryList getByLocationId(protos.LocationServiceOuterClass.gLocationId request) {
      return blockingUnaryCall(
          getChannel(), getGetByLocationIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.InventoryServiceOuterClass.gInventoryList getStockInventory(protos.InventoryServiceOuterClass.gInventory request) {
      return blockingUnaryCall(
          getChannel(), getGetStockInventoryMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InventoryServiceFutureStub extends io.grpc.stub.AbstractStub<InventoryServiceFutureStub> {
    private InventoryServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InventoryServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InventoryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.InventoryServiceOuterClass.gInventory> registerInventory(
        protos.InventoryServiceOuterClass.gInventory request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterInventoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.InventoryServiceOuterClass.gInventory> getInventory(
        protos.InventoryServiceOuterClass.gInventoryId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInventoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.InventoryServiceOuterClass.gInventoryList> getAllInventory(
        protos.InventoryServiceOuterClass.gInventory request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllInventoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.InventoryServiceOuterClass.gInventory> updateInventory(
        protos.InventoryServiceOuterClass.gInventory request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateInventoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Protos.ProtoUtil.gBoolValue> removeInventory(
        protos.InventoryServiceOuterClass.gInventoryId request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveInventoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.InventoryServiceOuterClass.gInventoryList> getByItemId(
        protos.ItemServiceOuterClass.gItemId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetByItemIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.InventoryServiceOuterClass.gInventoryList> getByLocationId(
        protos.LocationServiceOuterClass.gLocationId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetByLocationIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.InventoryServiceOuterClass.gInventoryList> getStockInventory(
        protos.InventoryServiceOuterClass.gInventory request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStockInventoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_INVENTORY = 0;
  private static final int METHODID_GET_INVENTORY = 1;
  private static final int METHODID_GET_ALL_INVENTORY = 2;
  private static final int METHODID_UPDATE_INVENTORY = 3;
  private static final int METHODID_REMOVE_INVENTORY = 4;
  private static final int METHODID_GET_BY_ITEM_ID = 5;
  private static final int METHODID_GET_BY_LOCATION_ID = 6;
  private static final int METHODID_GET_STOCK_INVENTORY = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InventoryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InventoryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_INVENTORY:
          serviceImpl.registerInventory((protos.InventoryServiceOuterClass.gInventory) request,
              (io.grpc.stub.StreamObserver<protos.InventoryServiceOuterClass.gInventory>) responseObserver);
          break;
        case METHODID_GET_INVENTORY:
          serviceImpl.getInventory((protos.InventoryServiceOuterClass.gInventoryId) request,
              (io.grpc.stub.StreamObserver<protos.InventoryServiceOuterClass.gInventory>) responseObserver);
          break;
        case METHODID_GET_ALL_INVENTORY:
          serviceImpl.getAllInventory((protos.InventoryServiceOuterClass.gInventory) request,
              (io.grpc.stub.StreamObserver<protos.InventoryServiceOuterClass.gInventoryList>) responseObserver);
          break;
        case METHODID_UPDATE_INVENTORY:
          serviceImpl.updateInventory((protos.InventoryServiceOuterClass.gInventory) request,
              (io.grpc.stub.StreamObserver<protos.InventoryServiceOuterClass.gInventory>) responseObserver);
          break;
        case METHODID_REMOVE_INVENTORY:
          serviceImpl.removeInventory((protos.InventoryServiceOuterClass.gInventoryId) request,
              (io.grpc.stub.StreamObserver<Protos.ProtoUtil.gBoolValue>) responseObserver);
          break;
        case METHODID_GET_BY_ITEM_ID:
          serviceImpl.getByItemId((protos.ItemServiceOuterClass.gItemId) request,
              (io.grpc.stub.StreamObserver<protos.InventoryServiceOuterClass.gInventoryList>) responseObserver);
          break;
        case METHODID_GET_BY_LOCATION_ID:
          serviceImpl.getByLocationId((protos.LocationServiceOuterClass.gLocationId) request,
              (io.grpc.stub.StreamObserver<protos.InventoryServiceOuterClass.gInventoryList>) responseObserver);
          break;
        case METHODID_GET_STOCK_INVENTORY:
          serviceImpl.getStockInventory((protos.InventoryServiceOuterClass.gInventory) request,
              (io.grpc.stub.StreamObserver<protos.InventoryServiceOuterClass.gInventoryList>) responseObserver);
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

  private static abstract class InventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InventoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return protos.InventoryServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InventoryService");
    }
  }

  private static final class InventoryServiceFileDescriptorSupplier
      extends InventoryServiceBaseDescriptorSupplier {
    InventoryServiceFileDescriptorSupplier() {}
  }

  private static final class InventoryServiceMethodDescriptorSupplier
      extends InventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InventoryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (InventoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InventoryServiceFileDescriptorSupplier())
              .addMethod(getRegisterInventoryMethod())
              .addMethod(getGetInventoryMethod())
              .addMethod(getGetAllInventoryMethod())
              .addMethod(getUpdateInventoryMethod())
              .addMethod(getRemoveInventoryMethod())
              .addMethod(getGetByItemIdMethod())
              .addMethod(getGetByLocationIdMethod())
              .addMethod(getGetStockInventoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
