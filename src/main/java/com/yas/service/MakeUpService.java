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
	
/*	public int discount(int price) {
		int discountPer=1;
		if(makeUpRepository.findByprice()>2000) {
			discountPer=5;
		}else if(makeUpRepository.findByprice()>5000) {
			discountPer=10;
		}
		else  {
			System.out.println("there no discount  for this service");
		}
	int	result= (price*discountPer)/100;
	return result;
		
	}*/
	public String show(String makeUpName) {
		return  makeUpRepository.getMake(makeUpName);
	}
	public String expmake(int price) {
		return  ""+makeUpRepository.expMake(price);
	}
}


