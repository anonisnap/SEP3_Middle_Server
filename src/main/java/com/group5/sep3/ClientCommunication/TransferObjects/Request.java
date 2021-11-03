package com.group5.sep3.ClientCommunication.TransferObjects;

import com.group5.sep3.BusinessLogic.model.Spike;
import com.group5.sep3.util.JsonHelper;
import com.group5.sep3.util.ProjectUtil;

import java.io.Serializable;
import java.lang.reflect.Type;

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
