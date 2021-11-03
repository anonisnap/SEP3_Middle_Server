package com.group5.sep3;


import com.group5.sep3.BusinessLogic.LogicModels.SpikeModel;
import com.group5.sep3.BusinessLogic.LogicModels.impl.SpikeModelImpl;
import com.group5.sep3.BusinessLogic.RequestHandler;
import com.group5.sep3.BusinessLogic.RequestHandlerImpl;
import com.group5.sep3.ClientCommunication.SocketCommunication.SocketServer;
import com.group5.sep3.ClientCommunication.SocketCommunication.SocketServerImpl;
import com.group5.sep3.DataBaseCommunication.RestClient;
import com.group5.sep3.DataBaseCommunication.RestClientImpl;
import com.group5.sep3.util.ProjectUtil;

public class StartServer {

    public static void main(String[] args) {


        RestClient restClient = new RestClientImpl();

        SpikeModel spikeModel = new SpikeModelImpl(restClient);

        RequestHandler requestHandler = new RequestHandlerImpl(spikeModel);

        SocketServer socketServer = new SocketServerImpl(requestHandler);

        socketServer.startSocketServer();

    }





}
