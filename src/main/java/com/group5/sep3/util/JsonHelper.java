package com.group5.sep3.util;

import com.google.gson.Gson;

import java.lang.reflect.Type;

public class JsonHelper {
	private static Gson gson = new Gson();

	public static <T> T fromJson(String jsonString, Type classType){
		return gson.fromJson(jsonString, classType);
	}

	public static String toJson(Object obj){
		return gson.toJson(obj);
	}

}
