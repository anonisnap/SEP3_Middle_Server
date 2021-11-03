package com.group5.sep3.ClientCommunication;

import com.group5.sep3.ClientCommunication.Networking.SocketServerHandler;
import com.group5.sep3.ClientCommunication.Networking.transferobjects.Request;

public interface ClientCommunication {


    void startClientCom();

    void broadCast(Object obj);

    void sendToClient(SocketServerHandler socketServerHandler, Request request);


}
