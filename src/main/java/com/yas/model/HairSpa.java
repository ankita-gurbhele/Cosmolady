package com.yas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HairSpa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String spaName;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpaName() {
		return spaName;
	}
	public void setSpaName(String spaName) {
		this.spaName = spaName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public HairSpa(int id, String spaName, int price) {
		this.id = id;
		this.spaName = spaName;
		this.price = price;
	}
	public HairSpa() {
		
	}
	
	
}
