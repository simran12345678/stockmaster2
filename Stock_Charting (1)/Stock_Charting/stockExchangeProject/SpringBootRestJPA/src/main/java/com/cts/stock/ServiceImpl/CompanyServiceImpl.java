package com.cts.stock.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.stock.dao.CompanyDao;
import com.cts.stock.entity.Company;
import com.cts.stock.exception.CompanyException;
import com.cts.stock.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyDao companyDao;
	
	
	@Override
	public List<Company> getAllCompany() {
		// TODO Auto-generated method stub
		List<Company> company= companyDao.getAllCompany();
		if(company.isEmpty()){
			throw new CompanyException("No Company records found");
		}else{
			
			return company;
		}
	}
	

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

	@Override
	public boolean updateComapany(Company company) {
		// TODO Auto-generated method stub
		return companyDao.updateComapany(company);
	}

}
