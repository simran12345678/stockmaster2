package com.cts.dao;


import com.cts.model.Company;


public interface CompanyDao {

	
	Company getCompanyById(int cid);
	boolean storeCompanyData(Company company);
	
	
	
	
}
