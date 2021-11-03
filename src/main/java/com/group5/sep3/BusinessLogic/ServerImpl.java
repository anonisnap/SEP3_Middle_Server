package com.group5.sep3.BusinessLogic;


import com.group5.sep3.DataBaseCommunication.RestClient;
import com.group5.sep3.DataBaseCommunication.RestClientImpl;

import java.beans.PropertyChangeEvent;

public class ServerImpl implements Server{




    public void startServer()
    {

        RestClient client = new RestClientImpl();

        System.out.println(client.getSpike("snor"));

    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {

    }
}
