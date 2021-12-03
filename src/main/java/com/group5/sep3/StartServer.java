package com.group5.sep3;

import com.group5.sep3.ClientCommunication.SocketCommunication.RequestHandeling.RequestHandler;
import com.group5.sep3.ClientCommunication.SocketCommunication.RequestHandeling.RequestHandlerImpl;
import com.group5.sep3.ClientCommunication.SocketCommunication.SocketServer;
import com.group5.sep3.ClientCommunication.SocketCommunication.SocketServerImpl;

public class StartServer {

    public static void main(String[] args) {

//        Item item = new Item(); TODO: Sander??

        RequestHandler requestHandler = new RequestHandlerImpl();

        SocketServer socketServer = new SocketServerImpl(requestHandler);

        socketServer.startSocketServer();

    }

}
