package com.yas.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yas.dao.CustomerRepository;
import com.yas.dao.ServicesRepository;
import com.yas.model.Customer;
import com.yas.model.Services;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerRepository cr;
	
	@Autowired
	ServicesRepository sr;
	

	@PostMapping("/add-customer")
	public Customer addCustomer(@RequestBody Customer custom) {
		List<Services> listServe = sr.findAll();
		custom.setServe(listServe);
		return cr.save(custom);
	}
	
	@GetMapping("/get-customer")
	public List<Customer> getCustomer(){
		return cr.findAll();
	}
	 
	@PutMapping("/update-customer")
	public Customer updateCustomer(@RequestBody Customer custom) {
		return cr.save(custom);
	}
	
}
