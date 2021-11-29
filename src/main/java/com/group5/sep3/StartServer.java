package com.group5.sep3;

import com.group5.sep3.ClientCommunication.RequestHandler;
import com.group5.sep3.ClientCommunication.RequestHandlerImpl;
import com.group5.sep3.ClientCommunication.SocketCommunication.SocketServer;
import com.group5.sep3.ClientCommunication.SocketCommunication.SocketServerImpl;


public class StartServer {

    public static void main(String[] args) {

        RequestHandler requestHandler = new RequestHandlerImpl();

        SocketServer socketServer = new SocketServerImpl(requestHandler);

        socketServer.startSocketServer();

    }

}
