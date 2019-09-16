package com.cts.stock.dao;


import com.cts.stock.entity.Admin;

public interface AdminDao {

	Admin getAdminByName(String username);
	
}


