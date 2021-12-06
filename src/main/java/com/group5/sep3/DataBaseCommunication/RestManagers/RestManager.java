package com.group5.sep3.DataBaseCommunication.RestManagers;

import org.springframework.web.client.RestClientException;

import java.util.List;

public interface RestManager<T> {

    T put(T obj) throws RestClientException;
    T post(T obj) throws RestClientException;
    T get(T obj) throws RestClientException;
    List<T> getAll() throws RestClientException;
    T delete(T obj) throws RestClientException;

}
