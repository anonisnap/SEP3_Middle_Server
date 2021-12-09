package com.group5.sep3.BusinessLogic.LogicModels;

import com.group5.sep3.BusinessLogic.model.User;

public interface UserModel extends LogicModel {
	User login(User user);
	User logout(User user);
}
