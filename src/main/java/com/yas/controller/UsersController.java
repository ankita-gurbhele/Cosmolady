package com.yas.controller;

import java.io.Serializable;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yas.service.UsersService;

@RestController
public class UsersController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3921850868857636905L;

	@Autowired
	UsersService service;

	@PostMapping("/addUsers")
	public void addUser(String fname, String lname, String email, String userName, String mobile) {
		service.addUsers(fname, lname, email, userName, mobile);

	}

}
