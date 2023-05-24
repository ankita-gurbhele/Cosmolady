package com.yas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yas.dao.HairColorRepository;
import com.yas.dao.HairCutRepository;
import com.yas.dao.HairSpaRepository;
import com.yas.dao.MakeUpRepository;
import com.yas.dao.ServicesRepository;
import com.yas.model.HairCut;
import com.yas.model.Services;

import lombok.Builder;
@Service
public class ServicesService {

	@Autowired
	ServicesRepository serviceRepository;
	
	@Autowired
	HairColorRepository hairColorRepository; 
	
	@Autowired
	HairSpaRepository hairSpaRepository;
	
	@Autowired
	MakeUpRepository makeUpRepository;
	
	@Autowired
	HairCutRepository hairCutRepository;
	
	@Autowired
	Services service;
	
	
	
	public Services addService(Services serve) {
		return serviceRepository.save(serve);
	}
	
	public List<Services> getService(){
		return serviceRepository.findAll();
	} 
	
	public List<HairCut> getServiceById(){
		return hairCutRepository.findAll();
	}
}
