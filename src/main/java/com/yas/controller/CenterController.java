package com.yas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yas.model.Center;
import com.yas.service.CenterService;

@RestController
public class CenterController {
	
	@Autowired
	CenterService centerService;
	
	@PostMapping("/add-center")
	public Center addCenter(@RequestBody Center center) {
		return centerService.addCenter(center);
	}
	@GetMapping("/get-center")
	public List<Center> getCenter() {
		return centerService.getCenter();
	}
	
	@GetMapping("/get-branch")
	public List<String> getCenter(@RequestParam("center") String center) {
		return centerService.getCenterByName(center);
	}
	
	@PutMapping("/change-center")
	public Center changeCenter(@RequestBody Center center) {
		return centerService.changeCenter(center);
	}
}
