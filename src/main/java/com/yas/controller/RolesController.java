package com.yas.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yas.service.RolesService;


@RestController
public class RolesController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5288801766505178965L;
	
	@Autowired
	RolesService role;
	
	
	@PostMapping("/addRoles")
	public void addRoles() {
		
		role.add();
		
	}

}
