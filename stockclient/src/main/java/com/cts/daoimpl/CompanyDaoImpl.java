package com.cts.daoimpl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.transaction.annotation.Transactional;

import com.cts.dao.CompanyDao;
import com.cts.model.Company;

import org.springframework.stereotype.Repository;
@Repository
public class CompanyDaoImpl implements CompanyDao {

	@PersistenceContext
	private EntityManager manager;
	
	

	@Override
	public Company getCompanyById(int cid) {
		// TODO Auto-generated method stub
		Query query=manager.createNamedQuery("findCompanyById");
		query.setParameter("Id", cid);
		return (Company)query.getSingleResult();
	}

	@Transactional
	@Override
	public boolean storeCompanyData(Company company) {
		// TODO Auto-generated method stub
		manager.persist(company);		
		Company company_found=getCompanyById(company.getCid());
		if(company_found!=null){
		return true;}
		else{
			return false;
	}
	}

	
}
