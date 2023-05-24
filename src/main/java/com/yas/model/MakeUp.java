package com.yas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class MakeUp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String makeUpName;
	private int price;
	private int discountPer;
	
	
	public MakeUp() {
		
	}
	
	
}
