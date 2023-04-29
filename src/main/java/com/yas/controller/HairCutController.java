package com.yas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yas.dao.HairColorRepository;
import com.yas.dao.HairCutRepository;
import com.yas.model.HairColor;
import com.yas.model.HairCut;

@RestController
public class HairCutController {

	@Autowired
	HairCutRepository hc;
	
	@PostMapping("/add-cut")
	public HairCut addCut(@RequestBody HairCut cut) {
		return hc.save(cut);
	}
	
	@GetMapping("/get-cut")
	public List<HairCut> getCut(){
		return hc.findAll();
	}
	
	@PutMapping("/update-cut")
	public HairCut updateCut(@RequestBody HairCut cut) {
		return hc.save(cut);
	}
	
	@DeleteMapping("/delete-cut/{id}")
	public void deleteCut(@PathVariable("id") int id) {
		hc.deleteById(id);
		
	}
}
