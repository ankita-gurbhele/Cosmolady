package com.yas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yas.dao.MakeUpRepository;
import com.yas.model.MakeUp;
@Service
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
