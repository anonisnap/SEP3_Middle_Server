package com.group5.sep3;

import com.group5.sep3.BusinessLogic.LogicModels.ItemModel;
import com.group5.sep3.BusinessLogic.LogicModels.SpikeModel;
import com.group5.sep3.BusinessLogic.LogicModels.impl.ItemModelImpl;
import com.group5.sep3.BusinessLogic.LogicModels.impl.SpikeModelImpl;
import com.group5.sep3.BusinessLogic.RequestHandler;
import com.group5.sep3.BusinessLogic.RequestHandlerImpl;
import com.group5.sep3.ClientCommunication.SocketCommunication.SocketServer;
import com.group5.sep3.ClientCommunication.SocketCommunication.SocketServerImpl;
import com.group5.sep3.DataBaseCommunication.RestClient;
import com.group5.sep3.DataBaseCommunication.RestClientImpl;
import com.group5.sep3.DataBaseCommunication.RestManagers.Impl.ItemRestManagerImpl;


public class StartServer {

    public static void main(String[] args) {



        ItemModel itemModel = new ItemModelImpl(new ItemRestManagerImpl());

        RequestHandler requestHandler = new RequestHandlerImpl(itemModel);

        SocketServer socketServer = new SocketServerImpl(requestHandler);

        socketServer.startSocketServer();

    }

}
