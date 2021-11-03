package com.group5.sep3.ClientCommunication.Networking.transferobjects;

import java.io.Serializable;

public class Request implements Serializable {

	private RequestTypes type;
	private Object arg;


	public Request(RequestTypes type, Object arg) {
		this.type = type;
		this.arg = arg;
	}

	public RequestTypes getType() {
		return type;
	}

	public Object getArg() {
		return arg;
	}

	@Override
	public String toString() {
		return "Request{" +
				"type=" + type +
				", arg=" + arg +
				'}';
	}

}
