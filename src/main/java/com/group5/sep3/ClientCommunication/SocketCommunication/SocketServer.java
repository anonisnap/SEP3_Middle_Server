package com.group5.sep3.ClientCommunication.SocketCommunication;




import com.group5.sep3.ClientCommunication.TransferObjects.Request;

import java.beans.PropertyChangeEvent;
import java.io.IOException;
import java.net.Socket;

public interface SocketServer {


    void createSocketServerHandler(Socket socket) throws IOException;

    void handleRequest(Request request);

    void broadCast(PropertyChangeEvent event);

    void startSocketServer();
}
