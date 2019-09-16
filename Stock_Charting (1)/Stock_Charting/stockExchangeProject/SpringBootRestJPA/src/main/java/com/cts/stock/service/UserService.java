package com.cts.stock.service;

import com.cts.stock.entity.User;

public interface UserService {

	boolean storeUserData(User user);
	User getUserById(int userid);
	
	
}
