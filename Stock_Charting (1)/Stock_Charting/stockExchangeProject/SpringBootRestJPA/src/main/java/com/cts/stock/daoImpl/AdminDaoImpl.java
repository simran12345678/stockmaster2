package com.cts.stock.daoImpl;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cts.stock.dao.AdminDao;
import com.cts.stock.entity.Admin;

@Repository
public class AdminDaoImpl implements AdminDao {
	
	@PersistenceContext
	private EntityManager manager;
	

	public Admin getAdminByName(String username) {
		// TODO Auto-generated method stub
		Query query=manager.createNamedQuery("findInternByName");
		query.setParameter("Id", username);
		return (Admin)query.getSingleResult();
	}

	
	}


