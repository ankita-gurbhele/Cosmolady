package com.yas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yas.dao.MakeUpRepository;
import com.yas.model.MakeUp;

@RestController
public class MakeUpController {
	
	@Autowired
	MakeUpRepository mur;
	
	@PostMapping("/add-makeup")
	public MakeUp addMakeUp(@RequestBody MakeUp makeup) {
		return mur.save(makeup);
	}
	
	@GetMapping("/get-makeup")
	public List<MakeUp> getMakeUp(){
		return mur.findAll();
	}
	
	@PutMapping("/update-makeup")
	public MakeUp updateMakeUp(@RequestBody MakeUp makeup) {
		return mur.save(makeup);
	}
}
