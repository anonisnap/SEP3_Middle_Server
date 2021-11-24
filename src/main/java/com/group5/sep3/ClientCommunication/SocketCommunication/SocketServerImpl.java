package com.group5.sep3.ClientCommunication.SocketCommunication;
import com.group5.sep3.BusinessLogic.RequestHandler;
import com.group5.sep3.ClientCommunication.TransferObjects.Request;
import com.group5.sep3.util.ProjectUtil;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class SocketServerImpl implements SocketServer, PropertyChangeListener {

    private RequestHandler requestHandler;
    private ArrayList<SocketServerHandler> socketServerHandlers;

    public SocketServerImpl(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
        this.requestHandler.addListener(this);
        socketServerHandlers = new ArrayList<>();
    }

    @Override
    public void startSocketServer() {
        try (ServerSocket serverSocket = new ServerSocket(1235)) {
            System.out.println("Server running");

            while (true) {

                Socket socket = serverSocket.accept();
                System.out.println("accepted socket" + socket.toString());
                createSocketServerHandler(socket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createSocketServerHandler(Socket socket) throws IOException {
        SocketServerHandler socketServerHandler = new SocketServerHandler(socket, this);

        socketServerHandlers.add(socketServerHandler);

        Thread socketThread = new Thread(socketServerHandler);
        socketThread.start();

    }


    public void sendToClient(SocketServerHandler socketServerHandler, Request request) {

        try {
            socketServerHandler.send(request);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Override
    public void handleRequest(Request request) {
        ProjectUtil.TestPrint("Hallo im socketserimple it got this request" + request);
        requestHandler.handleRequest(request);
    }

    @Override
    public void broadCast(PropertyChangeEvent event) {
        ProjectUtil.NotImplemented();
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        ProjectUtil.NotImplemented();
        ProjectUtil.TestPrint("got event from request handler" + evt);
    }
}
