package com.yas.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.yas.model.HairSpa;

@Repository
public interface HairSpaRepository extends JpaRepository<HairSpa, Integer> {

	@Query(value = "SELECT * FROM hair_spa", nativeQuery = true)
	public List<String> getAll();
}
