package com.yas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yas.dao.CustomerRepository;
import com.yas.model.Customer;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository cr;
	
	public Customer getCustomer(Customer customer) {
		Customer custom = cr.findByAll(customer.getFirstName(), 
									   customer.getLastName(),
									   customer.getAddress(),
									   customer.getMobNo(),
									   customer.getEmail());
		if (custom == null) {
			return cr.save(customer);
		}else {
			return new Customer();
		}
	}
}
