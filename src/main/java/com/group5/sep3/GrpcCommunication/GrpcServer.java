package com.group5.sep3.GrpcCommunication;

import com.group5.sep3.GrpcServiceFactory;
import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder;

import java.io.IOException;

public class GrpcServer {
	private final int serverPort;
	private final Server server;

	public GrpcServer(int serverPort) {
		this.serverPort = serverPort;

		ServerBuilder<?> serverBuilder = NettyServerBuilder.forPort(this.serverPort);

		for (BindableService service : GrpcServiceFactory.getInstance().allClients().values()) {
//			System.out.println(service.bindService().getServiceDescriptor().getName());
			serverBuilder.addService(service);
		}

		server = serverBuilder.build();
	}

	public void run() {
		try {
			server.start();
			System.out.println("> Server has Started at port: " + server.getPort());
			server.awaitTermination();
		} catch (IOException e) {
			System.out.println("> Server failed to Start at port: " + serverPort);
			e.printStackTrace();
		} catch (InterruptedException e) {
			System.out.println("> Server was Terminated");
			e.printStackTrace();
		}
	}
}
