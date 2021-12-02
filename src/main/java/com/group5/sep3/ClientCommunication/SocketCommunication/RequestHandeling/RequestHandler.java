package com.group5.sep3.ClientCommunication.SocketCommunication.RequestHandeling;

import com.group5.sep3.ClientCommunication.SocketCommunication.TransferObjects.Request;
import com.group5.sep3.util.Subject;

public interface RequestHandler extends Subject {

    Object handleRequest(Request request) throws Exception;

}
