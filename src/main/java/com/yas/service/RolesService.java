package com.yas.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yas.dao.RolesRepository;
import com.yas.model.Roles;

@Service
public class RolesService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5141458325576253122L;

	@Autowired
	RolesRepository rp;

	public void add() {
		
		Roles role = Roles.builder().name("Admin").build();
		Roles role1 = Roles.builder().name("Sales").build();
		Roles role2 = Roles.builder().name("Editor").build();
		Roles role3 = Roles.builder().name("Shipper").build();
		rp.save(role);
		rp.save(role1);
		rp.save(role2);
		rp.save(role3);

	}

}
