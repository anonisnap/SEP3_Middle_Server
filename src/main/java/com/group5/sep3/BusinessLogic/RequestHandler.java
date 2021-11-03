package com.group5.sep3.BusinessLogic;

import com.group5.sep3.ClientCommunication.TransferObjects.Request;
import com.group5.sep3.util.Subject;

public interface RequestHandler extends Subject {

    void handleRequest(Request request);


}
