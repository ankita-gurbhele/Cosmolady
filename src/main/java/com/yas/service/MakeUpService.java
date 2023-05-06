package com.yas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yas.dao.MakeUpRepository;
import com.yas.model.MakeUp;

public class MakeUpService {

	@Autowired
	MakeUpRepository makeUpRepository;
	
	public MakeUp addMakeUp(MakeUp makeup) {
		return makeUpRepository.save(makeup);
	}
	
	public List<MakeUp> getMakeUp(){
		return makeUpRepository.findAll();
	}
	
	public MakeUp updateMakeUp(MakeUp makeup) {
		return makeUpRepository.save(makeup);
	}
}
