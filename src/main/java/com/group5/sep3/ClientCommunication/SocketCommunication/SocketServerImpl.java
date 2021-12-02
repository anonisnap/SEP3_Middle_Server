package com.group5.sep3.ClientCommunication.SocketCommunication;
import com.group5.sep3.ClientCommunication.SocketCommunication.RequestHandeling.RequestHandler;
import com.group5.sep3.ClientCommunication.SocketCommunication.TransferObjects.Request;
import com.group5.sep3.ClientCommunication.SocketCommunication.TransferObjects.RequestReply;
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


    public void boardCastToClients(RequestReply replay) {

        try {
            for (SocketServerHandler socketServerHandler : socketServerHandlers) {
                socketServerHandler.send(replay);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Override
    public Object handleRequest(Request request) throws Exception {
        ProjectUtil.testPrint("Request Received : " + request);
        Object tmp = requestHandler.handleRequest(request);
        ProjectUtil.testPrint(this.getClass().getSimpleName() + " wishes to return Object; " + tmp.getClass().getSimpleName());
        return tmp;
    }

    @Override
    public void broadCast(PropertyChangeEvent event) {
        ProjectUtil.notImplemented();
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        ProjectUtil.notImplemented();
        ProjectUtil.testPrint("got event from request handler" + evt);
    }
}
