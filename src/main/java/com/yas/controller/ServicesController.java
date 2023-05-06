package com.yas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yas.model.Services;
import com.yas.service.ServicesService;

@RestController
public class ServicesController {
	
	@Autowired
	ServicesService servicesService;
	
	@PostMapping("/add-service")
	public Services addService(@RequestBody Services serve) {
		return servicesService.addService(serve);
	}
	
	@GetMapping("/get-service")
	public List<Services> getService(){
		return servicesService.getService();
	}
	
}
