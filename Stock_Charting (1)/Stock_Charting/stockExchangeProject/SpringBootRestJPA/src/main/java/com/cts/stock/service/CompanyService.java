package com.cts.stock.service;

import java.util.List;

import com.cts.stock.entity.Company;

public interface CompanyService {

	List<Company> getAllCompany();
	Company getCompanyById(int cid);
	boolean storeCompanyData(Company company);
	boolean updateComapany(Company company);
	
}
