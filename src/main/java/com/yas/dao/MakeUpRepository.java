package com.yas.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.yas.model.MakeUp;

@Repository
public interface MakeUpRepository extends JpaRepository<MakeUp, Integer> {

	//@Query(value = "SELECT * FROM make_up", nativeQuery = true)
//	public List<String> getAll();
@Query(value = "SELECT make_up_name mn, price, discount_per FROM make_up"
			+ " WHERE make_up_name= :input", nativeQuery = true)
	public String getMake(@Param("input") String makeUpName);
	

MakeUp findByprice(int price);
	MakeUp findByDiscountPer(int discountPer);
	

@Query(value = "SELECT make_up_name mn FROM make_up"
		+ " WHERE price= :hi", nativeQuery = true)
 public String expMake(@Param("hi") int price);
}