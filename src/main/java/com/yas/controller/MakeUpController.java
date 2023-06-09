package com.yas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yas.model.MakeUp;
import com.yas.service.MakeUpService;

@RestController
public class MakeUpController {
	
	@Autowired
	MakeUpService makeUpService;
	
	@PostMapping("/add-makeup")
	public MakeUp addMakeUp(@RequestBody MakeUp makeup) {
		return makeUpService.addMakeUp(makeup);
	}
	
	@GetMapping("/get-makeup")
	public List<MakeUp> getMakeUp(){
		return makeUpService.getMakeUp();
	}
	
	@PutMapping("/update-makeup")
	public MakeUp updateMakeUp(@RequestBody MakeUp makeup) {
		return makeUpService.updateMakeUp(makeup);
	}
	/*@GetMapping("/discount")
	public int discount(@RequestParam("price") int price ) {
	return makeUpService.discount(price);
}*/
	@GetMapping("/saw")
	public String show(@RequestParam("makeUpName")String  makeUpName) {
		return makeUpService.show(makeUpName);
	}
	@GetMapping("/exp")
	public String expMake(@RequestParam("pay")int price) {
		return makeUpService.expmake(price);
	}
}
