package com.yas.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.yas.model.HairCut;
import com.yas.model.Services;

@Repository
public interface ServicesRepository extends JpaRepository<Services, Integer> {
	
//	@Query(value = "SELECT * FROM hair_cut WHERE hair_cut.id = 4", nativeQuery = true)
//	public List<HairCut> findAllById(String serviceName);
}
