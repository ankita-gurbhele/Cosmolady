package com.yas.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yas.dao.UsersRepository;
import com.yas.model.Users;


@Service
public class UsersService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1809291743972667158L;
	
	@Autowired
	UsersRepository usr;
	
	
	public Users addUsers(Users user) {
		
		return usr.save(user);
	}

}
