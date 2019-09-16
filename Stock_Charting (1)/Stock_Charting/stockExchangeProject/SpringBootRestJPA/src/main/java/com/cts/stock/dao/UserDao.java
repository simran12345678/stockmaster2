package com.cts.stock.dao;


import com.cts.stock.entity.User;

public interface UserDao {

	boolean storeUserData(User user);
	User getUserById(int userid);
	
}
