package com.yas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MakeUp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String makeUpName;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMakeUpName() {
		return makeUpName;
	}
	public void setMakeUpName(String makeUpName) {
		this.makeUpName = makeUpName;
	}
	public int getPrice() { 
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public MakeUp(int id, String makeUpName, int price) {
		this.id = id;
		this.makeUpName = makeUpName;
		this.price = price;
	}
	public MakeUp() {
		
	}
	
	
}
