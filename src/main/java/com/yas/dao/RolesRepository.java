package com.yas.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.yas.model.Permissions;
import com.yas.model.Roles;


public interface RolesRepository extends JpaRepository<Roles, Integer> {
	
	@Query(value = "SELECT p.name FROM roles r "
			+ "INNER JOIN roles_permissions rp ON rp.roles_role_id = r.role_id "
			+ "INNER JOIN permissions p ON p.permission_id = rp.permissions_permission_id WHERE r.name = :input ", nativeQuery = true)
	public List<String> mission(@Param("input") String name);

}
