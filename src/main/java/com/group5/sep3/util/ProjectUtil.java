package com.group5.sep3.util;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ProjectUtil {


    public static void NotImplemented() {

        String nameOfClass = getNameOfClass();

        String nameofCurrMethod = getNameOfMethode();

        System.out.println("NotImplemented: " + nameofCurrMethod + " in class: " + nameOfClass);
    }


    public static void TestPrint(String msg) {
        String nameOfClass = getNameOfClass();

        String nameofCurrMethod = getNameOfMethode();

        int lineNumber = getLineNumber();

        System.out.println(nameOfClass + "." + nameofCurrMethod + " (" + lineNumber + ") : " + msg);
    }


    private static String getNameOfClass(){

        String nameOfClass = new Throwable()
                .getStackTrace()[2].getClassName();

        String[] arr = nameOfClass.split("\\.", 4);

        return arr[3];

    }


    private static String getNameOfMethode(){
        return new Throwable()
                .getStackTrace()[2]
                .getMethodName();
    }
    private static int getLineNumber(){
        return new Throwable().getStackTrace()[2].getLineNumber();
    }



}
