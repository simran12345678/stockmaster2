package com.cts.stock.service;

import com.cts.stock.entity.Admin;

public interface AdminService {

	Admin retrieveAdminByService(String username);
	
}
