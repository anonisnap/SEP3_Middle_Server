package com.group5.sep3.util;

public class ProjectUtil {


	public static void notImplemented() {

		String nameOfClass = getNameOfClass();

		String nameOfCurrMethod = getNameOfMethod();

		System.out.println("notImplemented: " + nameOfCurrMethod + " in class: " + nameOfClass);
	}


	public static void testPrint(String msg) {
		String nameOfClass = getNameOfClass();

		String nameOfCurrMethod = getNameOfMethod();

		int lineNumber = getLineNumber();

		System.out.println(nameOfClass + "." + nameOfCurrMethod + " (" + lineNumber + ") : " + msg);
	}


	private static String getNameOfClass() {

		String nameOfClass = new Throwable()
				.getStackTrace()[2].getClassName();

		String[] arr = nameOfClass.split("\\.", 4);

		return arr[3];

	}


	private static String getNameOfMethod() {
		return new Throwable()
				.getStackTrace()[2]
				.getMethodName();
	}

	private static int getLineNumber() {
		return new Throwable().getStackTrace()[2].getLineNumber();
	}


}
