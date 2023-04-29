package com.yas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.yas.dao.CustomerRepository;
import com.yas.dao.ServicesRepository;
import com.yas.model.Customer;
import com.yas.model.Services;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository cr;

	@Autowired
	ServicesRepository sr;

	public Customer getCustomer(Customer customer) {
		Customer custom = cr.findByAll(customer.getFirstName(), customer.getLastName(), customer.getAddress(),
				customer.getMobNo(), customer.getEmail());
		if (custom == null) {
			return cr.save(customer);
		} else {
			return new Customer();
		}
	}

	public Customer addCustomer(Customer custom) {
		List<Services> listServe = sr.findAll();
		custom.setServe(listServe);
		return cr.save(custom);
	}

	public List<Customer> getCustomer() {
		return cr.findAll();
	}

	public Customer updateCustomer(Customer custom) {
		return cr.save(custom);
	}
}
