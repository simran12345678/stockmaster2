package com.cts.stock.ServiceImpl;

import com.cts.stock.service.AdminService;
import com.cts.stock.exception.AdminException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.stock.dao.AdminDao;
import com.cts.stock.entity.Admin;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminDao adminDao;

	public Admin retrieveAdminByService(String username) {
		// TODO Auto-generated method stub
		Admin admin=adminDao.getAdminByName(username);
		if(admin.getUsername()==""){
			throw new AdminException("Admin not found");
		}
		return admin;
	}

}
