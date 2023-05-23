package com.yas.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.yas.model.HairCut;
import com.yas.model.Services;

@Repository
public interface ServicesRepository extends JpaRepository<Services, Integer> {
	
//	@Query(value = "SELECT hair_cut.* FROM services "
//			+ "INNER JOIN services_hair_cut ON services.id = services_hair_cut.services_id "
//			+ "INNER JOIN hair_cut ON hair_cut.id =services_hair_cut.hair_cut_id "
//			+ "WHERE service_name = :input", nativeQuery = true)
//	public List<HairCut> getService(String serviceName);
}
