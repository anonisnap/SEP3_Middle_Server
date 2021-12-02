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

            } catch (SocketException e) {
                System.out.println(socket + " disconnected");
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    private void handleReceivedObject(Request request) throws IOException {
        try {
            ProjectUtil.testPrint("Received request: (Id) " + request.getId());
            // sends request to request handler for a result
            Object retVal = socketServer.handleRequest(request);
            // result will be wrapped in a RequestReply
            RequestReply reply = createReply(retVal);
            reply.setId(request.getId());
            // send the reply object to client
            send(reply);
        } catch (Exception e) {
            e.printStackTrace();
//            ProjectUtil.testPrint("Error: " + e.getMessage() + " of type " + e.getClass().getSimpleName());
            send("Exception (ExceptionClass): " + e.getLocalizedMessage());
        }
    }


    public void send(Object obj) throws IOException {
        String replyJson = JsonHelper.toJson(obj);
        byte[] responseAsBytes = replyJson.getBytes();
        outToClient.write(responseAsBytes, 0, responseAsBytes.length);
    }


    private Request readFromClient() throws IOException {

        byte[] lenbytes = new byte[65536];
        int readLen = inFromClient.read(lenbytes,0,lenbytes.length);
        String message = new String(lenbytes,0,readLen);
        ProjectUtil.testPrint(message);
        return JsonHelper.fromJson(message, Request.class);

    }

    private RequestReply createReply(Object requestReturnValue){
        RequestReply newRequestReply = new RequestReply();
        newRequestReply.setClassname(requestReturnValue.getClass().getSimpleName());
        newRequestReply.setArg(requestReturnValue);
        return newRequestReply;
    }



}
