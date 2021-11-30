package com.group5.sep3.DataBaseCommunication.RestManagers;

import org.springframework.web.client.RestClientException;

import java.util.Collection;

public interface RestManager<T> {

    T put(T obj) throws RestClientException;
    T post(T obj) throws RestClientException;
    T get(T obj) throws RestClientException;
    Collection<T> getAll(T obj) throws RestClientException;
    T delete(T obj) throws RestClientException;

}
