package com.cts.service;

import com.cts.model.Company;


public interface CompanyService {

	
	Company getCompanyById(int cid);
	boolean storeCompanyData(Company company);
	
	
}
