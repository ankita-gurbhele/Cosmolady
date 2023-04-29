package com.yas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HairCut {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String haircutType;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHaircutType() {
		return haircutType;
	}
	public void setHaircutType(String haircutType) {
		this.haircutType = haircutType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public HairCut(int id, String haircutType, int price) {
		this.id = id;
		this.haircutType = haircutType;
		this.price = price;
	}
	public HairCut() {
		
	}
	
}
