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
    comments = "Source: Location.proto")
public final class LocationGrpc {

  private LocationGrpc() {}

  public static final String SERVICE_NAME = "Protos.Location";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<protos.LocationOuterClass.gLocation,
      protos.LocationOuterClass.gLocation> getRegisterLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterLocation",
      requestType = protos.LocationOuterClass.gLocation.class,
      responseType = protos.LocationOuterClass.gLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.LocationOuterClass.gLocation,
      protos.LocationOuterClass.gLocation> getRegisterLocationMethod() {
    io.grpc.MethodDescriptor<protos.LocationOuterClass.gLocation, protos.LocationOuterClass.gLocation> getRegisterLocationMethod;
    if ((getRegisterLocationMethod = LocationGrpc.getRegisterLocationMethod) == null) {
      synchronized (LocationGrpc.class) {
        if ((getRegisterLocationMethod = LocationGrpc.getRegisterLocationMethod) == null) {
          LocationGrpc.getRegisterLocationMethod = getRegisterLocationMethod = 
              io.grpc.MethodDescriptor.<protos.LocationOuterClass.gLocation, protos.LocationOuterClass.gLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.Location", "RegisterLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.LocationOuterClass.gLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.LocationOuterClass.gLocation.getDefaultInstance()))
                  .setSchemaDescriptor(new LocationMethodDescriptorSupplier("RegisterLocation"))
                  .build();
          }
        }
     }
     return getRegisterLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.LocationOuterClass.gLocation,
      protos.LocationOuterClass.gLocation> getGetLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLocation",
      requestType = protos.LocationOuterClass.gLocation.class,
      responseType = protos.LocationOuterClass.gLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.LocationOuterClass.gLocation,
      protos.LocationOuterClass.gLocation> getGetLocationMethod() {
    io.grpc.MethodDescriptor<protos.LocationOuterClass.gLocation, protos.LocationOuterClass.gLocation> getGetLocationMethod;
    if ((getGetLocationMethod = LocationGrpc.getGetLocationMethod) == null) {
      synchronized (LocationGrpc.class) {
        if ((getGetLocationMethod = LocationGrpc.getGetLocationMethod) == null) {
          LocationGrpc.getGetLocationMethod = getGetLocationMethod = 
              io.grpc.MethodDescriptor.<protos.LocationOuterClass.gLocation, protos.LocationOuterClass.gLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.Location", "GetLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.LocationOuterClass.gLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.LocationOuterClass.gLocation.getDefaultInstance()))
                  .setSchemaDescriptor(new LocationMethodDescriptorSupplier("GetLocation"))
                  .build();
          }
        }
     }
     return getGetLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.LocationOuterClass.gLocation,
      protos.LocationOuterClass.gLocationList> getGetAllLocationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllLocations",
      requestType = protos.LocationOuterClass.gLocation.class,
      responseType = protos.LocationOuterClass.gLocationList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.LocationOuterClass.gLocation,
      protos.LocationOuterClass.gLocationList> getGetAllLocationsMethod() {
    io.grpc.MethodDescriptor<protos.LocationOuterClass.gLocation, protos.LocationOuterClass.gLocationList> getGetAllLocationsMethod;
    if ((getGetAllLocationsMethod = LocationGrpc.getGetAllLocationsMethod) == null) {
      synchronized (LocationGrpc.class) {
        if ((getGetAllLocationsMethod = LocationGrpc.getGetAllLocationsMethod) == null) {
          LocationGrpc.getGetAllLocationsMethod = getGetAllLocationsMethod = 
              io.grpc.MethodDescriptor.<protos.LocationOuterClass.gLocation, protos.LocationOuterClass.gLocationList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.Location", "GetAllLocations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.LocationOuterClass.gLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.LocationOuterClass.gLocationList.getDefaultInstance()))
                  .setSchemaDescriptor(new LocationMethodDescriptorSupplier("GetAllLocations"))
                  .build();
          }
        }
     }
     return getGetAllLocationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.LocationOuterClass.gLocation,
      protos.LocationOuterClass.gLocation> getUpdateLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateLocation",
      requestType = protos.LocationOuterClass.gLocation.class,
      responseType = protos.LocationOuterClass.gLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.LocationOuterClass.gLocation,
      protos.LocationOuterClass.gLocation> getUpdateLocationMethod() {
    io.grpc.MethodDescriptor<protos.LocationOuterClass.gLocation, protos.LocationOuterClass.gLocation> getUpdateLocationMethod;
    if ((getUpdateLocationMethod = LocationGrpc.getUpdateLocationMethod) == null) {
      synchronized (LocationGrpc.class) {
        if ((getUpdateLocationMethod = LocationGrpc.getUpdateLocationMethod) == null) {
          LocationGrpc.getUpdateLocationMethod = getUpdateLocationMethod = 
              io.grpc.MethodDescriptor.<protos.LocationOuterClass.gLocation, protos.LocationOuterClass.gLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.Location", "UpdateLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.LocationOuterClass.gLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.LocationOuterClass.gLocation.getDefaultInstance()))
                  .setSchemaDescriptor(new LocationMethodDescriptorSupplier("UpdateLocation"))
                  .build();
          }
        }
     }
     return getUpdateLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.LocationOuterClass.gLocation,
      protos.LocationOuterClass.gLocation> getRemoveLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveLocation",
      requestType = protos.LocationOuterClass.gLocation.class,
      responseType = protos.LocationOuterClass.gLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.LocationOuterClass.gLocation,
      protos.LocationOuterClass.gLocation> getRemoveLocationMethod() {
    io.grpc.MethodDescriptor<protos.LocationOuterClass.gLocation, protos.LocationOuterClass.gLocation> getRemoveLocationMethod;
    if ((getRemoveLocationMethod = LocationGrpc.getRemoveLocationMethod) == null) {
      synchronized (LocationGrpc.class) {
        if ((getRemoveLocationMethod = LocationGrpc.getRemoveLocationMethod) == null) {
          LocationGrpc.getRemoveLocationMethod = getRemoveLocationMethod = 
              io.grpc.MethodDescriptor.<protos.LocationOuterClass.gLocation, protos.LocationOuterClass.gLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Protos.Location", "RemoveLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.LocationOuterClass.gLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.LocationOuterClass.gLocation.getDefaultInstance()))
                  .setSchemaDescriptor(new LocationMethodDescriptorSupplier("RemoveLocation"))
                  .build();
          }
        }
     }
     return getRemoveLocationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LocationStub newStub(io.grpc.Channel channel) {
    return new LocationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LocationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LocationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LocationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LocationFutureStub(channel);
  }

  /**
   */
  public static abstract class LocationImplBase implements io.grpc.BindableService {

    /**
     */
    public void registerLocation(protos.LocationOuterClass.gLocation request,
        io.grpc.stub.StreamObserver<protos.LocationOuterClass.gLocation> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterLocationMethod(), responseObserver);
    }

    /**
     */
    public void getLocation(protos.LocationOuterClass.gLocation request,
        io.grpc.stub.StreamObserver<protos.LocationOuterClass.gLocation> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLocationMethod(), responseObserver);
    }

    /**
     */
    public void getAllLocations(protos.LocationOuterClass.gLocation request,
        io.grpc.stub.StreamObserver<protos.LocationOuterClass.gLocationList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllLocationsMethod(), responseObserver);
    }

    /**
     */
    public void updateLocation(protos.LocationOuterClass.gLocation request,
        io.grpc.stub.StreamObserver<protos.LocationOuterClass.gLocation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateLocationMethod(), responseObserver);
    }

    /**
     */
    public void removeLocation(protos.LocationOuterClass.gLocation request,
        io.grpc.stub.StreamObserver<protos.LocationOuterClass.gLocation> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveLocationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.LocationOuterClass.gLocation,
                protos.LocationOuterClass.gLocation>(
                  this, METHODID_REGISTER_LOCATION)))
          .addMethod(
            getGetLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.LocationOuterClass.gLocation,
                protos.LocationOuterClass.gLocation>(
                  this, METHODID_GET_LOCATION)))
          .addMethod(
            getGetAllLocationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.LocationOuterClass.gLocation,
                protos.LocationOuterClass.gLocationList>(
                  this, METHODID_GET_ALL_LOCATIONS)))
          .addMethod(
            getUpdateLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.LocationOuterClass.gLocation,
                protos.LocationOuterClass.gLocation>(
                  this, METHODID_UPDATE_LOCATION)))
          .addMethod(
            getRemoveLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.LocationOuterClass.gLocation,
                protos.LocationOuterClass.gLocation>(
                  this, METHODID_REMOVE_LOCATION)))
          .build();
    }
  }

  /**
   */
  public static final class LocationStub extends io.grpc.stub.AbstractStub<LocationStub> {
    private LocationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LocationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LocationStub(channel, callOptions);
    }

    /**
     */
    public void registerLocation(protos.LocationOuterClass.gLocation request,
        io.grpc.stub.StreamObserver<protos.LocationOuterClass.gLocation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLocation(protos.LocationOuterClass.gLocation request,
        io.grpc.stub.StreamObserver<protos.LocationOuterClass.gLocation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllLocations(protos.LocationOuterClass.gLocation request,
        io.grpc.stub.StreamObserver<protos.LocationOuterClass.gLocationList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllLocationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateLocation(protos.LocationOuterClass.gLocation request,
        io.grpc.stub.StreamObserver<protos.LocationOuterClass.gLocation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeLocation(protos.LocationOuterClass.gLocation request,
        io.grpc.stub.StreamObserver<protos.LocationOuterClass.gLocation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveLocationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LocationBlockingStub extends io.grpc.stub.AbstractStub<LocationBlockingStub> {
    private LocationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LocationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LocationBlockingStub(channel, callOptions);
    }

    /**
     */
    public protos.LocationOuterClass.gLocation registerLocation(protos.LocationOuterClass.gLocation request) {
      return blockingUnaryCall(
          getChannel(), getRegisterLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.LocationOuterClass.gLocation getLocation(protos.LocationOuterClass.gLocation request) {
      return blockingUnaryCall(
          getChannel(), getGetLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.LocationOuterClass.gLocationList getAllLocations(protos.LocationOuterClass.gLocation request) {
      return blockingUnaryCall(
          getChannel(), getGetAllLocationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.LocationOuterClass.gLocation updateLocation(protos.LocationOuterClass.gLocation request) {
      return blockingUnaryCall(
          getChannel(), getUpdateLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.LocationOuterClass.gLocation removeLocation(protos.LocationOuterClass.gLocation request) {
      return blockingUnaryCall(
          getChannel(), getRemoveLocationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LocationFutureStub extends io.grpc.stub.AbstractStub<LocationFutureStub> {
    private LocationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LocationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LocationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.LocationOuterClass.gLocation> registerLocation(
        protos.LocationOuterClass.gLocation request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.LocationOuterClass.gLocation> getLocation(
        protos.LocationOuterClass.gLocation request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.LocationOuterClass.gLocationList> getAllLocations(
        protos.LocationOuterClass.gLocation request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllLocationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.LocationOuterClass.gLocation> updateLocation(
        protos.LocationOuterClass.gLocation request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.LocationOuterClass.gLocation> removeLocation(
        protos.LocationOuterClass.gLocation request) {
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
    private final LocationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LocationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_LOCATION:
          serviceImpl.registerLocation((protos.LocationOuterClass.gLocation) request,
              (io.grpc.stub.StreamObserver<protos.LocationOuterClass.gLocation>) responseObserver);
          break;
        case METHODID_GET_LOCATION:
          serviceImpl.getLocation((protos.LocationOuterClass.gLocation) request,
              (io.grpc.stub.StreamObserver<protos.LocationOuterClass.gLocation>) responseObserver);
          break;
        case METHODID_GET_ALL_LOCATIONS:
          serviceImpl.getAllLocations((protos.LocationOuterClass.gLocation) request,
              (io.grpc.stub.StreamObserver<protos.LocationOuterClass.gLocationList>) responseObserver);
          break;
        case METHODID_UPDATE_LOCATION:
          serviceImpl.updateLocation((protos.LocationOuterClass.gLocation) request,
              (io.grpc.stub.StreamObserver<protos.LocationOuterClass.gLocation>) responseObserver);
          break;
        case METHODID_REMOVE_LOCATION:
          serviceImpl.removeLocation((protos.LocationOuterClass.gLocation) request,
              (io.grpc.stub.StreamObserver<protos.LocationOuterClass.gLocation>) responseObserver);
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

  private static abstract class LocationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LocationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return protos.LocationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Location");
    }
  }

  private static final class LocationFileDescriptorSupplier
      extends LocationBaseDescriptorSupplier {
    LocationFileDescriptorSupplier() {}
  }

  private static final class LocationMethodDescriptorSupplier
      extends LocationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LocationMethodDescriptorSupplier(String methodName) {
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
      synchronized (LocationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LocationFileDescriptorSupplier())
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
