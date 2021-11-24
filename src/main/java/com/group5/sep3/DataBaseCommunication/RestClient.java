package com.group5.sep3.DataBaseCommunication;


public interface RestClient {


    void put(String restUrl, Object obj);
    void post(String restUrl, Object obj);
    Object get(String restUrl);
    Object delete(String restUrl);


}
