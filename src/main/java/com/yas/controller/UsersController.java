package com.yas.controller;

import java.io.Serializable;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yas.model.Users;
import com.yas.service.RolesService;
import com.yas.service.UsersService;

@RestController
public class UsersController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3921850868857636905L;

	@Autowired
	UsersService service;
	
	@Autowired
	RolesService rs;

//	@PostMapping("/addUsers")
//	public Users addUser(String fname, String lname, String email, String userName, String mobile) {
//        rs.add();
//		Users us = service.addUsers(fname, lname, email, userName, mobile);
//		return us;
//
//	}
	
	@PostMapping("/addUsers")
	public Users addUser(@RequestBody Users user) {
		Users us = service.addUsers(user);
		return us;

	}

}
