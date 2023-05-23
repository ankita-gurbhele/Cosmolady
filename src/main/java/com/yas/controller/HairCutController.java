package com.yas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yas.model.HairCut;
import com.yas.service.HairCutService;

@RestController
public class HairCutController {

	@Autowired
	HairCutService haiCutService;
	
	@PostMapping("/add-cut")
	public HairCut addCut(@RequestBody HairCut cut) {
		return haiCutService.addCut(cut);
	}
	
	@GetMapping("/get-cut")
	public List<HairCut> getCut(){
		return haiCutService.getCut();
	}
	
	@GetMapping("/get-specialcut")
	public String getCut(@RequestParam("cut") String haircutType){
		return haiCutService.getCut(haircutType);
	}
	
	@PutMapping("/update-cut")
	public HairCut updateCut(@RequestBody HairCut cut) {
		return haiCutService.updateCut(cut);
	}
	
	@DeleteMapping("/delete-cut/{id}")
	public void deleteCut(@PathVariable("id") int id) {
		haiCutService.deleteCut(id);;
		
	}
}
