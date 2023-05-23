package com.yas.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.yas.model.HairCut;

@Repository
public interface HairCutRepository extends JpaRepository<HairCut, Integer>{
	@Query(value = "SELECT haircut_type ht, price, description, image FROM hair_"
			+ "cut WHERE haircut_type = :input", nativeQuery = true)
	public String getCut(@Param("input") String haircutType);
	
	@Query(value = "SELECT haircut_type FROM hair_cut", nativeQuery = true)
	public List<String> getAll();
}
