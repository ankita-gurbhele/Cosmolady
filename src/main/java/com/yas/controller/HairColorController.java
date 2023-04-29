package com.yas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yas.dao.HairColorRepository;
import com.yas.model.HairColor;

@RestController
public class HairColorController {
	
	@Autowired
	HairColorRepository hcr;
	
	@PostMapping("/add-color")
	public HairColor addColor(@RequestBody HairColor color) {
		return hcr.save(color);
	}
	
	@GetMapping("/get-color")
	public List<HairColor> getColor(){
		return hcr.findAll();
	}
	
	@PutMapping("/update-color")
	public HairColor updateColor(@RequestBody HairColor color) {
		return hcr.save(color);
	}
	
//	@DeleteMapping("/delete-color")
//	public HairColor deleteColor(@RequestBody HairColor color) {
//		return hcr.delete(color);;
//	}
}
