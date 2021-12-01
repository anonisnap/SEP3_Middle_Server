package com.group5.sep3.ClientCommunication.SocketCommunication.TransferObjects;

public class RequestReply {

    public int Id;
    public String ClassName;
    public Object Arg;


    public RequestReply(int id, String className, Object arg)
    {
        Id = id;
        ClassName = className;
        Arg = arg;
    }

}
