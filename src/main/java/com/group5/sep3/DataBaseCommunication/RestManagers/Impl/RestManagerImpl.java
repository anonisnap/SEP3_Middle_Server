package com.group5.sep3.DataBaseCommunication.RestManagers.Impl;

import com.group5.sep3.DataBaseCommunication.RestClientImpl;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;

public class RestManagerImpl<T> implements RestManager<T> {
	@Override
	public T put(T obj) {
		String url = obj.getClass().getSimpleName();
		RestClientImpl.getInstance().put(url, obj);
		return obj;
	}

	@Override
	public T post(T obj) {
		String url = obj.getClass().getSimpleName();
		return (T) RestClientImpl.getInstance().post(url, obj);
	}

	@Override
	public T get(T obj) {
		String url = obj.getClass().getSimpleName();
		return (T) RestClientImpl.getInstance().post(url, obj);
	}

	@Override
	public T delete(T obj) {
		String url = obj.getClass().getSimpleName();
		RestClientImpl.getInstance().delete(url);
		return obj;
	}
}
