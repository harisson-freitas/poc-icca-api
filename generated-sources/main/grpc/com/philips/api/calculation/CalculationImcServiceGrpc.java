package com.philips.api.calculation;

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
    value = "by gRPC proto compiler (version 1.29.0)",
    comments = "Source: calculationImc.proto")
public final class CalculationImcServiceGrpc {

  private CalculationImcServiceGrpc() {}

  public static final String SERVICE_NAME = "calculationImc.CalculationImcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.philips.api.calculation.CalculationImcRequest,
      com.philips.api.calculation.CalculationImcResponse> getCalculationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Calculation",
      requestType = com.philips.api.calculation.CalculationImcRequest.class,
      responseType = com.philips.api.calculation.CalculationImcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.philips.api.calculation.CalculationImcRequest,
      com.philips.api.calculation.CalculationImcResponse> getCalculationMethod() {
    io.grpc.MethodDescriptor<com.philips.api.calculation.CalculationImcRequest, com.philips.api.calculation.CalculationImcResponse> getCalculationMethod;
    if ((getCalculationMethod = CalculationImcServiceGrpc.getCalculationMethod) == null) {
      synchronized (CalculationImcServiceGrpc.class) {
        if ((getCalculationMethod = CalculationImcServiceGrpc.getCalculationMethod) == null) {
          CalculationImcServiceGrpc.getCalculationMethod = getCalculationMethod =
              io.grpc.MethodDescriptor.<com.philips.api.calculation.CalculationImcRequest, com.philips.api.calculation.CalculationImcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Calculation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.philips.api.calculation.CalculationImcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.philips.api.calculation.CalculationImcResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculationImcServiceMethodDescriptorSupplier("Calculation"))
              .build();
        }
      }
    }
    return getCalculationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculationImcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculationImcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculationImcServiceStub>() {
        @java.lang.Override
        public CalculationImcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculationImcServiceStub(channel, callOptions);
        }
      };
    return CalculationImcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculationImcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculationImcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculationImcServiceBlockingStub>() {
        @java.lang.Override
        public CalculationImcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculationImcServiceBlockingStub(channel, callOptions);
        }
      };
    return CalculationImcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculationImcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculationImcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculationImcServiceFutureStub>() {
        @java.lang.Override
        public CalculationImcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculationImcServiceFutureStub(channel, callOptions);
        }
      };
    return CalculationImcServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CalculationImcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void calculation(com.philips.api.calculation.CalculationImcRequest request,
        io.grpc.stub.StreamObserver<com.philips.api.calculation.CalculationImcResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCalculationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCalculationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.philips.api.calculation.CalculationImcRequest,
                com.philips.api.calculation.CalculationImcResponse>(
                  this, METHODID_CALCULATION)))
          .build();
    }
  }

  /**
   */
  public static final class CalculationImcServiceStub extends io.grpc.stub.AbstractAsyncStub<CalculationImcServiceStub> {
    private CalculationImcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculationImcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculationImcServiceStub(channel, callOptions);
    }

    /**
     */
    public void calculation(com.philips.api.calculation.CalculationImcRequest request,
        io.grpc.stub.StreamObserver<com.philips.api.calculation.CalculationImcResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCalculationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CalculationImcServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CalculationImcServiceBlockingStub> {
    private CalculationImcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculationImcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculationImcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.philips.api.calculation.CalculationImcResponse calculation(com.philips.api.calculation.CalculationImcRequest request) {
      return blockingUnaryCall(
          getChannel(), getCalculationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CalculationImcServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CalculationImcServiceFutureStub> {
    private CalculationImcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculationImcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculationImcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.philips.api.calculation.CalculationImcResponse> calculation(
        com.philips.api.calculation.CalculationImcRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCalculationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CALCULATION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalculationImcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalculationImcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALCULATION:
          serviceImpl.calculation((com.philips.api.calculation.CalculationImcRequest) request,
              (io.grpc.stub.StreamObserver<com.philips.api.calculation.CalculationImcResponse>) responseObserver);
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

  private static abstract class CalculationImcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculationImcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.philips.api.calculation.CalculationImcOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CalculationImcService");
    }
  }

  private static final class CalculationImcServiceFileDescriptorSupplier
      extends CalculationImcServiceBaseDescriptorSupplier {
    CalculationImcServiceFileDescriptorSupplier() {}
  }

  private static final class CalculationImcServiceMethodDescriptorSupplier
      extends CalculationImcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalculationImcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CalculationImcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculationImcServiceFileDescriptorSupplier())
              .addMethod(getCalculationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
