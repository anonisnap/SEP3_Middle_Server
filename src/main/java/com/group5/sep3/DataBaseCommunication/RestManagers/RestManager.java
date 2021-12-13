package com.group5.sep3.DataBaseCommunication.RestManagers;

import org.springframework.web.client.RestClientException;

import java.util.ArrayList;

public interface RestManager<T> {

    T create(T obj) throws RestClientException;
    T update(T obj) throws RestClientException;
    T get(int objId) throws RestClientException;
    ArrayList<T> getAll() throws RestClientException;
    boolean delete(int objId) throws RestClientException;

}
