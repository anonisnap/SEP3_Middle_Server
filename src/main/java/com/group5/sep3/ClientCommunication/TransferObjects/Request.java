package com.group5.sep3.ClientCommunication.TransferObjects;

import java.io.Serializable;

public class Request implements Serializable {

	private RequestType type;
	private String className;
	private Object arg;


	public Request(RequestType type, String className, Object arg) {
		this.type = type;
		this.className = className;
		this.arg = arg;
	}


	public RequestType getType() {
		return type;
	}

	public String getClassName() {
		return className;
	}

	public Object getArg() {
		return arg;
	}


	@Override
	public String toString() {
		return "Request{" +
				"type=" + type +
				", className='" + className + '\'' +
				", arg=" + arg +
				'}';
	}

}
