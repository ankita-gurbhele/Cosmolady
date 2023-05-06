package com.yas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yas.model.HairSpa;
import com.yas.service.HairSpaService;

@RestController
@CrossOrigin("*")
public class HairSpaController {
	
	@Autowired
	HairSpaService hairSpaService;
	
	@PostMapping("/add-spa")
	public HairSpa addSpa( @RequestBody HairSpa spa) {
		return hairSpaService.addSpa(spa);
	}
	
	@GetMapping("/get-spa")
	public List<HairSpa> getSpa(){
		return hairSpaService.getSpa();
	}
	
	@PutMapping("/update-spa")
	public HairSpa updateSpa(@RequestBody HairSpa spa) {
		return hairSpaService.updateSpa(spa);
	}
}
