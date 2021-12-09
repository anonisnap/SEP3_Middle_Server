package com.group5.sep3.DataBaseCommunication.RestManagers;

import org.springframework.web.client.RestClientException;

import java.util.List;

public interface RestManager<T> {

    T create(T obj) throws RestClientException;
    T update(T obj) throws RestClientException;
    T get(int objId) throws RestClientException;
    List<T> getAll() throws RestClientException;
    boolean delete(int objId) throws RestClientException;


}
