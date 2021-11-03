package com.group5.sep3.ClientCommunication.Networking;
import com.group5.sep3.ClientCommunication.Networking.transferobjects.Request;
import com.group5.sep3.util.Subject;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class SocketServerImpl implements SocketServer, Subject {


    private final PropertyChangeListener propertyChangeListener;
    private ArrayList<SocketServerHandler> socketServerHandlers;

    public SocketServerImpl(PropertyChangeListener propertyChangeListener) {
        this.propertyChangeListener = propertyChangeListener;
        socketServerHandlers = new ArrayList<>();

    }
    @Override
    public void startClientCom() {
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

    @Override
    public void broadCast(Object obj) {

    }


    @Override
    public void sendToClient(SocketServerHandler socketServerHandler, Request request) {

        try {
            socketServerHandler.send(request);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    @Override
    public void handleRequest(Request request) {
        propertyChangeListener.propertyChange(
                new PropertyChangeEvent(this,request.getType().name(), null, request));
    }


    //subject
    @Override
    public void addListener(String name, PropertyChangeListener listener) {

    }

    @Override
    public void addListener(PropertyChangeListener listener) {

    }

    @Override
    public void removeListener(String name, PropertyChangeListener listener) {

    }

    @Override
    public void removeListener(PropertyChangeListener listener) {

    }



}
