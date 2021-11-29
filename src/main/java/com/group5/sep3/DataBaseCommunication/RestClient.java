package com.group5.sep3.DataBaseCommunication;


public interface RestClient {


    Object put(String restUrl, Object obj);
    Object post(String restUrl, Object obj);
    Object get(String restUrl);
    boolean delete(String restUrl);


}
