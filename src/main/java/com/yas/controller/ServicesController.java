package com.yas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yas.dao.ServicesRepository;
import com.yas.model.Services;

@RestController
public class ServicesController {
	
	@Autowired
	ServicesRepository sr;
	
	@PostMapping("/add-service")
	public Services addService(@RequestBody Services serve) {
		return sr.save(serve);
	}
	
	@GetMapping("/get-service")
	public List<Services> getService(){
		return sr.findAll();
	}
	
}
