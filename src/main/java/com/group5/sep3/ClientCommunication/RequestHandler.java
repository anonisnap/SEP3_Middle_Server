package com.group5.sep3.ClientCommunication;

import com.group5.sep3.ClientCommunication.TransferObjects.Request;
import com.group5.sep3.util.Subject;

public interface RequestHandler extends Subject {

    Object handleRequest(Request request) throws Exception;


}
