package com.group5.sep3.BusinessLogic.LogicModels.impl;

import com.group5.sep3.BusinessLogic.LogicModels.UserModel;
import com.group5.sep3.BusinessLogic.model.User;
import com.group5.sep3.DataBaseCommunication.RestManagers.UserRestManager;
import com.group5.sep3.util.ProjectUtil;

public class UserModelImpl implements UserModel {
	private final UserRestManager userRestManager;

	public UserModelImpl(UserRestManager userRestManager) {
		this.userRestManager = userRestManager;
	}

	@Override
	public User login(User user) {
		return userRestManager.login(user);
	}

	@Override
	public User logout(User user) {
		// Can be used for logging work-times
		ProjectUtil.notImplemented();
		return user;
	}
}
