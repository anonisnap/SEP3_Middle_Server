package com.group5.sep3;

import com.google.gson.Gson;

import java.lang.reflect.Type;

public class JsonHelper {
	private static Gson gson = new Gson();

	public static <T> T FromJson(String jsonString, Type classType){
		return gson.fromJson(jsonString, classType);
	}
}
