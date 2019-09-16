package com.cts.stock.daoImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.stock.dao.UserDao;
import com.cts.stock.entity.Admin;
import com.cts.stock.entity.Company;
import com.cts.stock.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	@PersistenceContext
	private EntityManager manager;

	@Transactional
	@Override
	public boolean storeUserData(User user) {
		// TODO Auto-generated method stub
		manager.persist(user);		
		User company_found=getUserById(user.getUserId());
		if(company_found!=null){
		return true;}
		else{
			return false;
	}
	}

	@Override
	public User getUserById(int userid) {
		// TODO Auto-generated method stub
		Query query=manager.createNamedQuery("findUserById");
		query.setParameter("Id", userid);
		return (User)query.getSingleResult();
	}

//	@Override
//	public User getUserByName(String username) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
