package com.yas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yas.dao.CustomerRepository;
import com.yas.dao.ServicesRepository;
import com.yas.model.Customer;
import com.yas.model.Services;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	ServicesRepository servicesRepository;
	
	public Customer getCustomer(Customer customer) {
		Customer custom = customerRepository.findByFirstNameAndLastName(customer.getFirstName(),
																		customer.getLastName());
		if (custom == null) {
			return customerRepository.save(customer);
		}else {
			return new Customer();
		}
	}
	
	public Customer addCustomer( Customer custom) {
		List<Services> listServe = servicesRepository.findAll();
		custom.setServe(listServe);
		return customerRepository.save(custom);
	}
	
	public List<Customer> getCustomer(){
		return customerRepository.findAll();
	}
	 
	public Customer updateCustomer(Customer custom) {
		return customerRepository.save(custom);
	}
}
