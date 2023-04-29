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
import com.yas.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService cs;

	@PostMapping("/add-customer")
	public Customer addCustomer(@RequestBody Customer custom) {
		return cs.addCustomer(custom);
	}

	@GetMapping("/get-customer")
	public List<Customer> getCustomer() {
		return cs.getCustomer();
	}

	@PutMapping("/update-customer")
	public Customer updateCustomer(@RequestBody Customer custom) {
		return cs.updateCustomer(custom);
	}

}
