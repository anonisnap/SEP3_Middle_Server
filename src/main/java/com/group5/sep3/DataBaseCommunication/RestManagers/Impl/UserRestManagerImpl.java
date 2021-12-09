package com.group5.sep3.DataBaseCommunication.RestManagers.Impl;

import com.group5.sep3.BusinessLogic.model.Item;
import com.group5.sep3.BusinessLogic.model.User;
import com.group5.sep3.DataBaseCommunication.RestClientImpl;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;
import com.group5.sep3.DataBaseCommunication.RestManagers.UserRestManager;
import com.group5.sep3.util.JsonHelper;
import com.group5.sep3.util.ProjectUtil;
import org.springframework.web.client.RestClientException;

import java.util.List;

public class UserRestManagerImpl implements UserRestManager {


	@Override
	public User login(User user) {
		String restUrl = "login/" + user.getUsername();
		Object restResponse = RestClientImpl.getInstance().get(restUrl);

		return JsonHelper.fromJson((String) restResponse, User.class);
	}




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
	public User get(int objId) throws RestClientException {
		ProjectUtil.notImplemented();
		return null;
	}

	@Override
	public List<User> getAll() throws RestClientException {
		ProjectUtil.notImplemented();
		return null;
	}

	@Override
	public boolean delete(int objId) throws RestClientException {
		ProjectUtil.notImplemented();
		return false;
	}
}
