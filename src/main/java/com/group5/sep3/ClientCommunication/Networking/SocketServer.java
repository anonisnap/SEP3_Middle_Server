package com.group5.sep3.ClientCommunication.Networking;


import com.group5.sep3.ClientCommunication.ClientCommunication;
import com.group5.sep3.ClientCommunication.Networking.transferobjects.Request;

import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.net.Socket;

public interface SocketServer extends ClientCommunication {


    void createSocketServerHandler(Socket socket) throws IOException;

    void handleRequest(Request request);


}
