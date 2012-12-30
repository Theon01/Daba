package com.daba.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daba.backend.dao.UserDaoImpl;
import com.daba.backend.domain.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDaoImpl userdao;

	@Override
	public void add(User user) {
		
		userdao.add(user);
		
	}
	
	

}
