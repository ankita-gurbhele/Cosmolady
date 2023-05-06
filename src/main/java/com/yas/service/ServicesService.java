package com.yas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yas.dao.ServicesRepository;
import com.yas.model.Services;

public class ServicesService {

	@Autowired
	ServicesRepository serviceRepository;
	
	public Services addService(Services serve) {
		return serviceRepository.save(serve);
	}
	
	public List<Services> getService(){
		return serviceRepository.findAll();
	}
}
