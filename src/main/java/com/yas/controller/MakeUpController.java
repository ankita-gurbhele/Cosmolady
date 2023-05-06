package com.yas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
}
