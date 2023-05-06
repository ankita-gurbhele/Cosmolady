package com.yas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yas.model.HairColor;
import com.yas.service.HairColorService;

@RestController
public class HairColorController {
	
	@Autowired
	HairColorService hairColorService;
	
	@PostMapping("/add-color")
	public HairColor addColor(@RequestBody HairColor color) {
		return hairColorService.addColor(color);
	}
	
	@GetMapping("/get-color")
	public List<HairColor> getColor(){
		return hairColorService.getColor();
	}
	
	@PutMapping("/update-color")
	public HairColor updateColor(@RequestBody HairColor color) {
		return hairColorService.updateColor(color);
	}
	

}
