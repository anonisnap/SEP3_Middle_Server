package com.group5.sep3.BusinessLogic;


import com.group5.sep3.ClientCommunication.ClientCommunication;
import com.group5.sep3.ClientCommunication.Networking.SocketServer;
import com.group5.sep3.ClientCommunication.Networking.SocketServerImpl;
import com.group5.sep3.DataBaseCommunication.RestClient;
import com.group5.sep3.DataBaseCommunication.RestClientImpl;

import java.beans.PropertyChangeEvent;

public class ServerImpl implements Server{




    public void startServer()
    {
        ClientCommunication socketServer = new SocketServerImpl(this::propertyChange);

        socketServer.startClientCom();

        RestClient client = new RestClientImpl();

        //System.out.println(client.getSpike("snor"));

    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(evt.getNewValue());
    }
}
