package com.yas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yas.dao.HairColorRepository;
import com.yas.model.HairColor;

public class HairColorService {

	@Autowired
	HairColorRepository hairColorRepository;
	
	public HairColor addColor(HairColor color) {
		return hairColorRepository.save(color);
	}
	
	public List<HairColor> getColor(){
		return hairColorRepository.findAll();
	}
	
	public HairColor updateColor(HairColor color) {
		return hairColorRepository.save(color);
	}
}
