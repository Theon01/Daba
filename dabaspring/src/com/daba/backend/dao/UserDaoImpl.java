package com.daba.backend.dao;

import javax.jdo.PersistenceManager;
import org.springframework.stereotype.Repository;

import com.daba.backend.domain.User;
import com.daba.backend.service.PMF;



@Repository
public class UserDaoImpl implements UserDao {
	
	@Override
	public void add(User user) {
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
	
		try {
		
		pm.makePersistent(user);
		
		} finally {
		
		pm.close();
	
		}
		

	}

}
