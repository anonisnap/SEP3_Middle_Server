package com.group5.sep3.DataBaseCommunication.RestManagers;

import java.util.Collection;

public interface RestManager<T> {

    T put(T obj);
    T post(T obj);
    T get(T obj);
    Collection<T> getAll(T obj);
    T delete(T obj);

}
