package com.yas.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Permissions implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8927459549132249206L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int permissionId;

	private String name;

}
