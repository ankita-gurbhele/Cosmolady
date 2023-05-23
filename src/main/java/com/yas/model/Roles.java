package com.yas.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Roles implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 408849889780367254L;
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roleId;
	private String name;
	
	@OneToMany(cascade =CascadeType.ALL, mappedBy = "roles")
	private List<RolesToPermissions> role_to_permissions; 

}
