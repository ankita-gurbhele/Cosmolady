package com.yas.service;

import java.io.Serializable;

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
	
	
	public void addUsers(String fname, String lname, String email,String userName,String mobile) {
		Users us = Users.builder().fname(fname)
				                   .lname(lname)
			                       .email(email)
			                       .userName(userName)
			                       .mobile(mobile)
			                       .build();
		usr.save(us);
	}

}
