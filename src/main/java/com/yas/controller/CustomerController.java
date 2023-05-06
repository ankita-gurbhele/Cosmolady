package com.yas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yas.model.Customer;
import com.yas.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/add-customer")
	public Customer addCustomer(@RequestBody Customer custom) {
		return customerService.addCustomer(custom);
	}
	
	@GetMapping("/get-customer")
	public List<Customer> getCustomer(){
		return customerService.getCustomer();
	}
	 
	@PutMapping("/update-customer")
	public Customer updateCustomer(@RequestBody Customer custom) {
		return customerService.updateCustomer(custom);
	}
	
}
