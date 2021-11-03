package com.group5.sep3.util;

public class ProjectUtil {



    public static void NotImplemented(){


        String nameofCurrMethod = new Throwable()
                .getStackTrace()[1]
                .getMethodName();

        String nameOfClass = new Throwable()
                .getStackTrace()[1].getClassName();

        System.out.println("NotImplemented: " + nameofCurrMethod  + " in class "+ nameOfClass);
    }


}
