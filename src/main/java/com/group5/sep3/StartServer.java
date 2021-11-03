package com.group5.sep3;

import com.group5.sep3.BusinessLogic.Server;
import com.group5.sep3.BusinessLogic.ServerImpl;

public class StartServer {

    public static void main(String[] args) {

        ServerImpl server = new ServerImpl();
        server.startServer();

    }

}
