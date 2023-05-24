package com.yas.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yas.model.Permissions;
import com.yas.model.Roles;
import com.yas.service.RolesService;

@RestController
public class RolesController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5288801766505178965L;

	@Autowired
	RolesService roles;

	@PostMapping("/addroles")
	public Roles addRoles(@RequestBody Roles role) {
		return roles.addRoleWithPermissons(role);

	}

	@GetMapping("/getroles")
	public List<String> getRoles(@RequestParam("role") String name) {
		return roles.getRoleById(name);

	}

}
