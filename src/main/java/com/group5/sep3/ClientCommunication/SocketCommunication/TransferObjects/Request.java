package com.group5.sep3.ClientCommunication.SocketCommunication.TransferObjects;

import com.group5.sep3.util.JsonHelper;

import java.io.Serializable;
import java.lang.reflect.Type;

public class Request implements Serializable {

	private int id;
	private RequestType type;
	private String className;
	private Object arg;


	public Request(RequestType type, int id, String className, Object arg) {
		this.id = id;
		this.type = type;
		this.className = className;
		this.arg = arg;
	}

	public int getId() {
		return id;
	}

	public RequestType getType() {
		return type;
	}

	public String getClassName() {
		return className;
	}

	public <T> T getArg(Type classType) {
		return JsonHelper.fromJson(arg.toString(), classType);
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
