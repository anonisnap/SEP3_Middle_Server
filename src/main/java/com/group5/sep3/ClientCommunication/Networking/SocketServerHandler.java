package com.group5.sep3.ClientCommunication.Networking;


import com.group5.sep3.ClientCommunication.Networking.transferobjects.Request;
import com.group5.sep3.util.JsonHelper;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;

public class SocketServerHandler implements  Runnable {

    private Socket socket;
    private OutputStream outToClient;
    private InputStream inFromClient;
    private SocketServer socketServer;


    public SocketServerHandler(Socket socket, SocketServer socketServer) throws IOException {
        this.socket = socket;
        outToClient = this.socket.getOutputStream();
        inFromClient = this.socket.getInputStream();

        this.socketServer = socketServer;

    }



    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println("iteration: " + i++);
            try {

                Request noget =  readFromClient();
                System.out.println("did we get it ?");
                System.out.println(noget);

               // handleReceivedObject(request);
                Thread.sleep(500);
            } catch (SocketException e) {
                e.printStackTrace();
                break;
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    private void handleReceivedObject(Request request) {
        socketServer.handleRequest(request);
    }

    public void send(Request request) throws IOException {
        String requestAsJson = JsonHelper.toJson(request);

        byte[] responseAsBytes = requestAsJson.getBytes();
        outToClient.write(responseAsBytes, 0, responseAsBytes.length);

    }


    private Request readFromClient() throws IOException {

        byte[] lenbytes = new byte[1024];
        int readLen = inFromClient.read(lenbytes,0,lenbytes.length);
        String message = new String(lenbytes,0,readLen);

        return JsonHelper.fromJson(message, Request.class);
    }


}
