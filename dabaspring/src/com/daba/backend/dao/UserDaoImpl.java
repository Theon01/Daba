package com.daba.backend.dao;

import javax.jdo.PersistenceManager;
import org.springframework.stereotype.Repository;

import com.daba.backend.domain.User;
import com.daba.backend.service.PMF;



@Repository
public class UserDaoImpl implements UserDao {
	
	private static PersistenceManager pm;
	
	@Override
	public void add(User user) {
		
		if (pm == null || pm.isClosed()) {
			pm = PMF.get().getPersistenceManager();
		}
	
		try {
		
		pm.makePersistent(user);	
		} finally {
		
		pm.close();
	
		}
		

	}

}
