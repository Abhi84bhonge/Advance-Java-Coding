package com.User.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.User.DAO.UserRepository;
import com.User.Entity.User;

@Service
public class UserService {

    @Autowired
    UserRepository repo;

	public void save(User user) {
		 repo.save(user);
		
	}

  
}
