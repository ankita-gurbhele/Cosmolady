package com.yas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Data
public class HairCut {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String haircutType;
	private int price;
	@Column(length = 2000)
	private String description;
	
	@Lob
	private byte[] image;
	
	@ManyToOne
	private Services service;
	
	public HairCut() {
		
	}

}
