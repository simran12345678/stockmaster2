package com.cts.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.CompanyDao;
import com.cts.exception.CompanyException;
import com.cts.model.Company;
import com.cts.service.CompanyService;




@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyDao companyDao;
	
	

	@Override
	public Company getCompanyById(int cid) {
		// TODO Auto-generated method stub
	Company company=companyDao.getCompanyById(cid);
		if(company.getCid()==0){
			throw new CompanyException("Company not found");
		}
		return company;
	}

	@Override
	public boolean storeCompanyData(Company company) {
		// TODO Auto-generated method stub
		
		return companyDao.storeCompanyData(company);
		
	}

	

}
