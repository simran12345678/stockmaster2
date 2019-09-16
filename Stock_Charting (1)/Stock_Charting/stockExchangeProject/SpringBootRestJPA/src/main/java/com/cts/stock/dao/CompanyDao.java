package com.cts.stock.dao;

import java.util.List;

import com.cts.stock.entity.Company;

public interface CompanyDao {

	List<Company> getAllCompany();
	Company getCompanyById(int cid);
	boolean storeCompanyData(Company company);
	boolean updateComapany(Company company);
	
	
	
}
