package com.group5.sep3;

import com.group5.sep3.GrpcCommunication.GrpcServer;

public class StartServer {

	public static void main(String[] args) {
		GrpcServer grpcServer = new GrpcServer(9090);
		grpcServer.run();
	}

}
