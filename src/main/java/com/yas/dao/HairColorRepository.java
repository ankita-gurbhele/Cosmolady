package com.yas.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.yas.model.HairColor;
@Repository
public interface HairColorRepository extends JpaRepository<HairColor, Integer> {

	@Query(value = "SELECT * FROM hair_color", nativeQuery = true)
	public List<String> getAll();
}
