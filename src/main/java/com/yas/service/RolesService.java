package com.yas.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yas.dao.RolesRepository;
import com.yas.model.Permissions;
import com.yas.model.Roles;

@Service
public class RolesService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5141458325576253122L;

	@Autowired
	RolesRepository rp;

	public Roles addRoleWithPermissons(Roles role) {


		Roles roles = new Roles();
		roles.setName(role.getName());

		List<Permissions> list = new ArrayList<>();

		for (Permissions set : role.getPermissions()) {

			Permissions perm = new Permissions();
			
			perm.setName(set.getName());
			
			list.add(perm);

		}

		roles.setPermissions(list);
		Roles saveRoles = rp.save(roles);
		return saveRoles;

	}
	
	public List<String> getRoleById(String name) {
		
		return rp.mission(name);
		
	}

}
