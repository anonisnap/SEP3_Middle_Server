package com.group5.sep3.DataBaseCommunication.RestManagers.Impl;

import com.group5.sep3.DataBaseCommunication.RestClientImpl;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;
import com.group5.sep3.util.ProjectUtil;

public class NOT_USED_RestManagerImpl<T> implements RestManager<T> {
	public NOT_USED_RestManagerImpl(T debugItem) {
		ProjectUtil.testPrint("Manager Type Variable: " + debugItem.getClass().getSimpleName());
	}

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
		return (T) RestClientImpl.getInstance().get(url);
	}

	@Override
	public T delete(T obj) {
		String url = obj.getClass().getSimpleName();
		RestClientImpl.getInstance().delete(url);
		return obj;
	}
}
