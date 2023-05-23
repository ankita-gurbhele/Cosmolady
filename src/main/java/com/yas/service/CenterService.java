package com.yas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yas.dao.CenterRepository;
import com.yas.model.Center;

@Service
public class CenterService {

	@Autowired
	CenterRepository centerRepository;
	
	public Center addCenter(Center center) {
		return centerRepository.save(center);
	}
	
	public List<Center> getCenter() {
		return centerRepository.findAll();
	}
	
	public List<String> getCenterByName(String center) {
		return centerRepository.getCenterByName(center);
	}
	
	public Center changeCenter(Center center) {
		return centerRepository.save(center);
	}
}
