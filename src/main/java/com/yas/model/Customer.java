package com.yas.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private String address;
	private long mobNo;
	private String email;
	
	@ManyToMany
	private List<Services> serve;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Services> getServe() {
		return serve;
	}
	public void setServe(List<Services> serve) {
		this.serve = serve;
	}
	public Customer(int id, String firstName, String lastName, String address, long mobNo, String email) {
	
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobNo = mobNo;
		this.email = email;
	}
	public Customer() {
	}
	
	
}
