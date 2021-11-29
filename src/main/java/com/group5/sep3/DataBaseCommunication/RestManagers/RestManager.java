package com.group5.sep3.DataBaseCommunication.RestManagers;

public interface RestManager<T> {

    T put(T obj);
    T post(T obj);
    T get(T obj);
    T delete(T obj);

}
