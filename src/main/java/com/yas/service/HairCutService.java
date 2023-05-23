package com.yas.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yas.dao.HairCutRepository;
import com.yas.dao.ServicesRepository;
import com.yas.model.HairCut;
import com.yas.model.Services;
@Service
public class HairCutService {

	@Autowired
	HairCutRepository hairCutRepository;
	@Autowired
	ServicesRepository servicesRepository;
	@Autowired
	Services services;
	@Autowired
	HairCut hairCut;
	
	public HairCut addCut(HairCut cut) {
		hairCut.setService(services);
		return hairCutRepository.save(cut);	
	}
	
	public List<HairCut> getCut(){
		return hairCutRepository.findAll();
	}
	
	public String getCut(String haircutType){
		return hairCutRepository.getCut(haircutType);
	}
	
	public HairCut updateCut(HairCut cut) {
		return hairCutRepository.save(cut);
	}
	
	public void deleteCut(int id) {
		hairCutRepository.deleteById(id);
		
	}
}
