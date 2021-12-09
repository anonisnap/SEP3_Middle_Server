package com.group5.sep3.DataBaseCommunication.RestManagers.Impl;

import com.group5.sep3.BusinessLogic.model.User;
import com.group5.sep3.DataBaseCommunication.RestClientImpl;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;
import com.group5.sep3.util.JsonHelper;
import com.group5.sep3.util.ProjectUtil;
import org.springframework.web.client.RestClientException;

import java.util.List;

public class UserRestManagerImpl implements RestManager<User> {
	@Override
	public User create(User obj) throws RestClientException {
		ProjectUtil.notImplemented();
		return null;
	}

	@Override
	public User update(User obj) throws RestClientException {
		ProjectUtil.notImplemented();
		return null;
	}

	@Override
	public User get(User obj) throws RestClientException {
		String restUrl = obj.getClass().getSimpleName() + obj.getUsername();
		String tmp = (String) RestClientImpl.getInstance().get(restUrl);

		return JsonHelper.fromJson(tmp, User.class);
	}

	@Override
	public List<User> getAll() throws RestClientException {
		ProjectUtil.notImplemented();
		return null;
	}

	@Override
	public User delete(User obj) throws RestClientException {
		ProjectUtil.notImplemented();
		return null;
	}
}
