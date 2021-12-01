package com.group5.sep3.ClientCommunication.SocketCommunication.TransferObjects;

import java.io.Serializable;

public class RequestReply implements Serializable {

	public int id;
	public String classname;
	public Object arg;

	public RequestReply(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public Object getArg() {
		return arg;
	}

	public void setArg(Object arg) {
		this.arg = arg;
	}
}
