package com.yas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yas.dao.HairSpaRepository;
import com.yas.model.HairSpa;
@Service
public class HairSpaService {

	@Autowired
	HairSpaRepository hairspaRepository;
	
	public HairSpa addSpa(HairSpa spa) {
		return hairspaRepository.save(spa);
	}
	public List<HairSpa> getSpa(){
		return hairspaRepository.findAll();
	}
	
	public HairSpa updateSpa(HairSpa spa) {
		return hairspaRepository.save(spa);
	}
}
