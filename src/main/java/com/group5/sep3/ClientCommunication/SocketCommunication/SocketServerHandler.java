package com.group5.sep3.ClientCommunication.SocketCommunication;


import com.group5.sep3.ClientCommunication.TransferObjects.Request;
import com.group5.sep3.util.JsonHelper;
import com.group5.sep3.util.ProjectUtil;

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

                Request request =  readFromClient();
                handleReceivedObject(request);

                Thread.sleep(500);
            } catch (SocketException e) {
                System.out.println(socket + " disconnected");
                break;
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }

        }

    }

    private void handleReceivedObject(Request request) throws IOException {
        try {
            socketServer.handleRequest(request);
        } catch (Exception e) {
            ProjectUtil.testPrint("Error: " + e.getMessage() + " of type " + e.getClass().getSimpleName());
            send("Exception (ExceptionClass): " + e.getLocalizedMessage());
        }
    }

    public void send(Serializable msg) throws IOException {
        String requestAsJson = JsonHelper.toJson(msg);

        byte[] responseAsBytes = requestAsJson.getBytes();
        outToClient.write(responseAsBytes, 0, responseAsBytes.length);
    }


    private Request readFromClient() throws IOException {

        byte[] lenbytes = new byte[1024];
        int readLen = inFromClient.read(lenbytes,0,lenbytes.length);
        String message = new String(lenbytes,0,readLen);
        ProjectUtil.testPrint(message);
        return JsonHelper.fromJson(message, Request.class);
    }

}
