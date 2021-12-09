package com.group5.sep3.BusinessLogic.LogicModels.impl;

import com.group5.sep3.BusinessLogic.LogicModels.UserModel;
import com.group5.sep3.BusinessLogic.model.User;
import com.group5.sep3.DataBaseCommunication.RestManagers.RestManager;
import com.group5.sep3.util.ProjectUtil;

public class UserModelImpl implements UserModel {
	private final RestManager<User> userRestManager;

	public UserModelImpl(RestManager<User> userRestManager) {
		this.userRestManager = userRestManager;
	}

	@Override
	public User login(User user) {
		User actualUser = userRestManager.get(user);

		return actualUser;
	}

	@Override
	public User logout(User user) {
		// Can be used for logging work-times

		return user;
	}
}
