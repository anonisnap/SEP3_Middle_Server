package com.group5.sep3.DataBaseCommunication.RestManagers;

import com.group5.sep3.BusinessLogic.model.User;

public interface UserRestManager extends RestManager<User> {

    User login(User user);

}
