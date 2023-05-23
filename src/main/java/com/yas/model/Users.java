package com.yas.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Users implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5917211146937750871L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@Column(name = "firstName" , nullable = false)
	@NotEmpty(message = "First name is required")
	private String fname;
	
	
	@Column(name = "lastName" , nullable = false)
	@NotEmpty(message = "Last name is required")
	private String lname;
	
	
	@Column(name = "email" , nullable = false, unique = true)
	@NotEmpty(message = "Email is required")
	@Pattern(regexp = "\\b[A-Za-z0-9._]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b", message = "Invalid email format")
	private String email;
	
	
	@Column(name = "userName" , nullable = false , unique = true)
	@NotEmpty(message = "User Name Is required")
	private String userName;
	
	
	@Column(name = "mobile" , nullable = false , unique = true)
	@NotEmpty(message = "Mobile is required")
	private String mobile;
	
	
	@Column(name = "isActive" , nullable = false)
	private boolean isActive;
	
	
	@OneToOne 
	private Roles userRoles;

}
