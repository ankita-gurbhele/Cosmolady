package com.yas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.yas.dao.HairSpaRepository;
import com.yas.model.HairSpa;

@RestController
@CrossOrigin("*")
public class HairSpaController {
	
	@Autowired
	HairSpaRepository hsp;
	
	@PostMapping("/add-spa")
	public HairSpa addSpa( @RequestBody HairSpa spa) {
		return hsp.save(spa);
	}
	
	@GetMapping("/get-spa")
	public List<HairSpa> getSpa(){
		return hsp.findAll();
	}
	
	@PutMapping("/update-spa")
	public HairSpa updateSpa(@RequestBody HairSpa spa) {
		return hsp.save(spa);
	}
}
