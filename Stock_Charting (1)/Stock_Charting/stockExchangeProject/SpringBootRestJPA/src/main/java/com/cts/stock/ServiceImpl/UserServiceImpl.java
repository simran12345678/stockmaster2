package com.cts.stock.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.stock.dao.UserDao;
import com.cts.stock.entity.Admin;
import com.cts.stock.entity.User;
import com.cts.stock.exception.AdminException;
import com.cts.stock.exception.UserException;
import com.cts.stock.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	

	@Override
	public boolean storeUserData(User user) {
		// TODO Auto-generated method stub
		return userDao.storeUserData(user);
	}

	@Override
	public User getUserById(int userid) {
		// TODO Auto-generated method stub
		User user=userDao.getUserById(userid);
		if(user.getUserId()==0){
			throw new UserException("User not found");
		}
		return user;
	}

}
