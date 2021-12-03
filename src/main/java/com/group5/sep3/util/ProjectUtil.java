package com.group5.sep3.util;

public class ProjectUtil {


	public static void notImplemented() {

		StackTraceElement nameOfClass = getNameOfClass();

		System.out.println("notImplemented: " + nameOfClass);
	}


	public static void testPrint(String msg) {
		StackTraceElement nameOfClass = getNameOfClass();

		int lineNumber = getLineNumber();

		System.out.println(nameOfClass + " (Line" + lineNumber + ") : " + msg);
	}


	private static StackTraceElement getNameOfClass() {

		return new Throwable()
				.getStackTrace()[2];
	}



	private static int getLineNumber() {
		return new Throwable().getStackTrace()[2].getLineNumber();
	}


}
