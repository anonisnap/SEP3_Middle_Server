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
    comments = "Source: LocationService.proto")
public final class LocationServiceGrpc {

  private LocationServiceGrpc() {}

  public static final String SERVICE_NAME = "Protos.LocationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<protos.LocationServiceOuterClass.gLocation,
      protos.LocationServiceOuterClass.gLocation> getRegisterLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterLocation",
      requestType = protos.LocationServiceOuterClass.gLocation.class,
      responseType = protos.LocationServiceOuterClass.gLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.LocationServiceOuterClass.gLocation,
      protos.LocationServiceOuterClass.gLocation> getRegisterLocationMethod() {
    io.grpc.MethodDescriptor<protos.LocationServiceOuterClass.gLocation, protos.LocationServiceOuterClass.gLocation> getRegisterLocationMethod;
    if ((getRegisterLocationMethod = LocationServiceGrpc.getRegisterLocationMethod) == null) {
      synchronized (LocationServiceGrpc.class) {
        if ((getRegisterLocationMethod = LocationServiceGrpc.getRegisterLocationMethod) == null) {
          LocationServiceGrpc.getRegisterLocationMethod = getRegisterLocationMethod = 
              io.grpc.MethodDescriptor.<protos.LocationServiceOuterClass.gLocation, protos.LocationServiceOuterClass.gLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.LocationService", "RegisterLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.LocationServiceOuterClass.gLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.LocationServiceOuterClass.gLocation.getDefaultInstance()))
                  .setSchemaDescriptor(new LocationServiceMethodDescriptorSupplier("RegisterLocation"))
                  .build();
          }
        }
     }
     return getRegisterLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.LocationServiceOuterClass.gLocationId,
      protos.LocationServiceOuterClass.gLocation> getGetLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLocation",
      requestType = protos.LocationServiceOuterClass.gLocationId.class,
      responseType = protos.LocationServiceOuterClass.gLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.LocationServiceOuterClass.gLocationId,
      protos.LocationServiceOuterClass.gLocation> getGetLocationMethod() {
    io.grpc.MethodDescriptor<protos.LocationServiceOuterClass.gLocationId, protos.LocationServiceOuterClass.gLocation> getGetLocationMethod;
    if ((getGetLocationMethod = LocationServiceGrpc.getGetLocationMethod) == null) {
      synchronized (LocationServiceGrpc.class) {
        if ((getGetLocationMethod = LocationServiceGrpc.getGetLocationMethod) == null) {
          LocationServiceGrpc.getGetLocationMethod = getGetLocationMethod = 
              io.grpc.MethodDescriptor.<protos.LocationServiceOuterClass.gLocationId, protos.LocationServiceOuterClass.gLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.LocationService", "GetLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.LocationServiceOuterClass.gLocationId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.LocationServiceOuterClass.gLocation.getDefaultInstance()))
                  .setSchemaDescriptor(new LocationServiceMethodDescriptorSupplier("GetLocation"))
                  .build();
          }
        }
     }
     return getGetLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.LocationServiceOuterClass.gLocation,
      protos.LocationServiceOuterClass.gLocationList> getGetAllLocationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllLocations",
      requestType = protos.LocationServiceOuterClass.gLocation.class,
      responseType = protos.LocationServiceOuterClass.gLocationList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.LocationServiceOuterClass.gLocation,
      protos.LocationServiceOuterClass.gLocationList> getGetAllLocationsMethod() {
    io.grpc.MethodDescriptor<protos.LocationServiceOuterClass.gLocation, protos.LocationServiceOuterClass.gLocationList> getGetAllLocationsMethod;
    if ((getGetAllLocationsMethod = LocationServiceGrpc.getGetAllLocationsMethod) == null) {
      synchronized (LocationServiceGrpc.class) {
        if ((getGetAllLocationsMethod = LocationServiceGrpc.getGetAllLocationsMethod) == null) {
          LocationServiceGrpc.getGetAllLocationsMethod = getGetAllLocationsMethod = 
              io.grpc.MethodDescriptor.<protos.LocationServiceOuterClass.gLocation, protos.LocationServiceOuterClass.gLocationList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.LocationService", "GetAllLocations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.LocationServiceOuterClass.gLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.LocationServiceOuterClass.gLocationList.getDefaultInstance()))
                  .setSchemaDescriptor(new LocationServiceMethodDescriptorSupplier("GetAllLocations"))
                  .build();
          }
        }
     }
     return getGetAllLocationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.LocationServiceOuterClass.gLocation,
      protos.LocationServiceOuterClass.gLocation> getUpdateLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateLocation",
      requestType = protos.LocationServiceOuterClass.gLocation.class,
      responseType = protos.LocationServiceOuterClass.gLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.LocationServiceOuterClass.gLocation,
      protos.LocationServiceOuterClass.gLocation> getUpdateLocationMethod() {
    io.grpc.MethodDescriptor<protos.LocationServiceOuterClass.gLocation, protos.LocationServiceOuterClass.gLocation> getUpdateLocationMethod;
    if ((getUpdateLocationMethod = LocationServiceGrpc.getUpdateLocationMethod) == null) {
      synchronized (LocationServiceGrpc.class) {
        if ((getUpdateLocationMethod = LocationServiceGrpc.getUpdateLocationMethod) == null) {
          LocationServiceGrpc.getUpdateLocationMethod = getUpdateLocationMethod = 
              io.grpc.MethodDescriptor.<protos.LocationServiceOuterClass.gLocation, protos.LocationServiceOuterClass.gLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.LocationService", "UpdateLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.LocationServiceOuterClass.gLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.LocationServiceOuterClass.gLocation.getDefaultInstance()))
                  .setSchemaDescriptor(new LocationServiceMethodDescriptorSupplier("UpdateLocation"))
                  .build();
          }
        }
     }
     return getUpdateLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.LocationServiceOuterClass.gLocationId,
      Protos.ProtoUtil.gBoolValue> getRemoveLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveLocation",
      requestType = protos.LocationServiceOuterClass.gLocationId.class,
      responseType = Protos.ProtoUtil.gBoolValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.LocationServiceOuterClass.gLocationId,
      Protos.ProtoUtil.gBoolValue> getRemoveLocationMethod() {
    io.grpc.MethodDescriptor<protos.LocationServiceOuterClass.gLocationId, Protos.ProtoUtil.gBoolValue> getRemoveLocationMethod;
    if ((getRemoveLocationMethod = LocationServiceGrpc.getRemoveLocationMethod) == null) {
      synchronized (LocationServiceGrpc.class) {
        if ((getRemoveLocationMethod = LocationServiceGrpc.getRemoveLocationMethod) == null) {
          LocationServiceGrpc.getRemoveLocationMethod = getRemoveLocationMethod = 
              io.grpc.MethodDescriptor.<protos.LocationServiceOuterClass.gLocationId, Protos.ProtoUtil.gBoolValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.LocationService", "RemoveLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.LocationServiceOuterClass.gLocationId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Protos.ProtoUtil.gBoolValue.getDefaultInstance()))
                  .setSchemaDescriptor(new LocationServiceMethodDescriptorSupplier("RemoveLocation"))
                  .build();
          }
        }
     }
     return getRemoveLocationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LocationServiceStub newStub(io.grpc.Channel channel) {
    return new LocationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LocationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LocationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LocationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LocationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class LocationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void registerLocation(protos.LocationServiceOuterClass.gLocation request,
        io.grpc.stub.StreamObserver<protos.LocationServiceOuterClass.gLocation> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterLocationMethod(), responseObserver);
    }

    /**
     */
    public void getLocation(protos.LocationServiceOuterClass.gLocationId request,
        io.grpc.stub.StreamObserver<protos.LocationServiceOuterClass.gLocation> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLocationMethod(), responseObserver);
    }

    /**
     */
    public void getAllLocations(protos.LocationServiceOuterClass.gLocation request,
        io.grpc.stub.StreamObserver<protos.LocationServiceOuterClass.gLocationList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllLocationsMethod(), responseObserver);
    }

    /**
     */
    public void updateLocation(protos.LocationServiceOuterClass.gLocation request,
        io.grpc.stub.StreamObserver<protos.LocationServiceOuterClass.gLocation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateLocationMethod(), responseObserver);
    }

    /**
     */
    public void removeLocation(protos.LocationServiceOuterClass.gLocationId request,
        io.grpc.stub.StreamObserver<Protos.ProtoUtil.gBoolValue> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveLocationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.LocationServiceOuterClass.gLocation,
                protos.LocationServiceOuterClass.gLocation>(
                  this, METHODID_REGISTER_LOCATION)))
          .addMethod(
            getGetLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.LocationServiceOuterClass.gLocationId,
                protos.LocationServiceOuterClass.gLocation>(
                  this, METHODID_GET_LOCATION)))
          .addMethod(
            getGetAllLocationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.LocationServiceOuterClass.gLocation,
                protos.LocationServiceOuterClass.gLocationList>(
                  this, METHODID_GET_ALL_LOCATIONS)))
          .addMethod(
            getUpdateLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.LocationServiceOuterClass.gLocation,
                protos.LocationServiceOuterClass.gLocation>(
                  this, METHODID_UPDATE_LOCATION)))
          .addMethod(
            getRemoveLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.LocationServiceOuterClass.gLocationId,
                Protos.ProtoUtil.gBoolValue>(
                  this, METHODID_REMOVE_LOCATION)))
          .build();
    }
  }

  /**
   */
  public static final class LocationServiceStub extends io.grpc.stub.AbstractStub<LocationServiceStub> {
    private LocationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LocationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LocationServiceStub(channel, callOptions);
    }

    /**
     */
    public void registerLocation(protos.LocationServiceOuterClass.gLocation request,
        io.grpc.stub.StreamObserver<protos.LocationServiceOuterClass.gLocation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLocation(protos.LocationServiceOuterClass.gLocationId request,
        io.grpc.stub.StreamObserver<protos.LocationServiceOuterClass.gLocation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllLocations(protos.LocationServiceOuterClass.gLocation request,
        io.grpc.stub.StreamObserver<protos.LocationServiceOuterClass.gLocationList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllLocationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateLocation(protos.LocationServiceOuterClass.gLocation request,
        io.grpc.stub.StreamObserver<protos.LocationServiceOuterClass.gLocation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeLocation(protos.LocationServiceOuterClass.gLocationId request,
        io.grpc.stub.StreamObserver<Protos.ProtoUtil.gBoolValue> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveLocationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LocationServiceBlockingStub extends io.grpc.stub.AbstractStub<LocationServiceBlockingStub> {
    private LocationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LocationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LocationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public protos.LocationServiceOuterClass.gLocation registerLocation(protos.LocationServiceOuterClass.gLocation request) {
      return blockingUnaryCall(
          getChannel(), getRegisterLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.LocationServiceOuterClass.gLocation getLocation(protos.LocationServiceOuterClass.gLocationId request) {
      return blockingUnaryCall(
          getChannel(), getGetLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.LocationServiceOuterClass.gLocationList getAllLocations(protos.LocationServiceOuterClass.gLocation request) {
      return blockingUnaryCall(
          getChannel(), getGetAllLocationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.LocationServiceOuterClass.gLocation updateLocation(protos.LocationServiceOuterClass.gLocation request) {
      return blockingUnaryCall(
          getChannel(), getUpdateLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public Protos.ProtoUtil.gBoolValue removeLocation(protos.LocationServiceOuterClass.gLocationId request) {
      return blockingUnaryCall(
          getChannel(), getRemoveLocationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LocationServiceFutureStub extends io.grpc.stub.AbstractStub<LocationServiceFutureStub> {
    private LocationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LocationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LocationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.LocationServiceOuterClass.gLocation> registerLocation(
        protos.LocationServiceOuterClass.gLocation request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.LocationServiceOuterClass.gLocation> getLocation(
        protos.LocationServiceOuterClass.gLocationId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.LocationServiceOuterClass.gLocationList> getAllLocations(
        protos.LocationServiceOuterClass.gLocation request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllLocationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.LocationServiceOuterClass.gLocation> updateLocation(
        protos.LocationServiceOuterClass.gLocation request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Protos.ProtoUtil.gBoolValue> removeLocation(
        protos.LocationServiceOuterClass.gLocationId request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveLocationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_LOCATION = 0;
  private static final int METHODID_GET_LOCATION = 1;
  private static final int METHODID_GET_ALL_LOCATIONS = 2;
  private static final int METHODID_UPDATE_LOCATION = 3;
  private static final int METHODID_REMOVE_LOCATION = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LocationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LocationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_LOCATION:
          serviceImpl.registerLocation((protos.LocationServiceOuterClass.gLocation) request,
              (io.grpc.stub.StreamObserver<protos.LocationServiceOuterClass.gLocation>) responseObserver);
          break;
        case METHODID_GET_LOCATION:
          serviceImpl.getLocation((protos.LocationServiceOuterClass.gLocationId) request,
              (io.grpc.stub.StreamObserver<protos.LocationServiceOuterClass.gLocation>) responseObserver);
          break;
        case METHODID_GET_ALL_LOCATIONS:
          serviceImpl.getAllLocations((protos.LocationServiceOuterClass.gLocation) request,
              (io.grpc.stub.StreamObserver<protos.LocationServiceOuterClass.gLocationList>) responseObserver);
          break;
        case METHODID_UPDATE_LOCATION:
          serviceImpl.updateLocation((protos.LocationServiceOuterClass.gLocation) request,
              (io.grpc.stub.StreamObserver<protos.LocationServiceOuterClass.gLocation>) responseObserver);
          break;
        case METHODID_REMOVE_LOCATION:
          serviceImpl.removeLocation((protos.LocationServiceOuterClass.gLocationId) request,
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

  private static abstract class LocationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LocationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return protos.LocationServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LocationService");
    }
  }

  private static final class LocationServiceFileDescriptorSupplier
      extends LocationServiceBaseDescriptorSupplier {
    LocationServiceFileDescriptorSupplier() {}
  }

  private static final class LocationServiceMethodDescriptorSupplier
      extends LocationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LocationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LocationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LocationServiceFileDescriptorSupplier())
              .addMethod(getRegisterLocationMethod())
              .addMethod(getGetLocationMethod())
              .addMethod(getGetAllLocationsMethod())
              .addMethod(getUpdateLocationMethod())
              .addMethod(getRemoveLocationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
