package com.group5.sep3.ClientCommunication.SocketCommunication;




import com.group5.sep3.ClientCommunication.SocketCommunication.TransferObjects.Request;

import java.beans.PropertyChangeEvent;
import java.io.IOException;
import java.io.Serializable;
import java.net.Socket;

public interface SocketServer {


    void createSocketServerHandler(Socket socket) throws IOException;

    Object handleRequest(Request request) throws Exception;

    void broadCast(PropertyChangeEvent event);

    void startSocketServer();
}
