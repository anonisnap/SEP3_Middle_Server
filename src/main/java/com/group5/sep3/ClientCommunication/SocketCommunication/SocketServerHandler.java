package com.group5.sep3.ClientCommunication.SocketCommunication;


import com.group5.sep3.ClientCommunication.SocketCommunication.TransferObjects.Request;
import com.group5.sep3.ClientCommunication.SocketCommunication.TransferObjects.RequestReply;
import com.group5.sep3.util.JsonHelper;
import com.group5.sep3.util.ProjectUtil;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;

public class SocketServerHandler implements  Runnable {
    private final Socket socket;
    private final OutputStream outToClient;
    private final InputStream inFromClient;
    private final SocketServer socketServer;
    RequestReply reply;


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
            System.out.println("data transfer iteration: " + i++);
            try {

                Request request =  readFromClient();
                handleReceivedObject(request);

                Thread.sleep(500);
            } catch (SocketException | StringIndexOutOfBoundsException e) {
                System.out.println(socket + " disconnected");
                break;
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }

        }

    }

    private void handleReceivedObject(Request request) throws IOException {
        try {
            reply = new RequestReply(request.getId());
            ProjectUtil.testPrint("Created Reply: (Id) " + reply.getId());
            Object retVal = socketServer.handleRequest(request);
            send(retVal);
        } catch (Exception e) {
            e.printStackTrace();
//            ProjectUtil.testPrint("Error: " + e.getMessage() + " of type " + e.getClass().getSimpleName());
            send("Exception (ExceptionClass): " + e.getLocalizedMessage());
        }
    }

    public void send(Object obj) throws IOException {
        reply.setClassname(obj.getClass().getSimpleName());
        reply.setArg(obj);

        String requestAsJson = JsonHelper.toJson(reply);

        reply = null;

        byte[] responseAsBytes = requestAsJson.getBytes();
        outToClient.write(responseAsBytes, 0, responseAsBytes.length);
    }


    private Request readFromClient() throws IOException {

        byte[] lenbytes = new byte[65536];
        int readLen = inFromClient.read(lenbytes,0,lenbytes.length);
        String message = new String(lenbytes,0,readLen);
        ProjectUtil.testPrint(message);
        return JsonHelper.fromJson(message, Request.class);

    }

}
