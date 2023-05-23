package com.yas.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.yas.model.Center;

@Repository
public interface CenterRepository extends JpaRepository<Center, Integer>{
	@Query(value = "SELECT * FROM center WHERE center = :input",nativeQuery = true)
	public List<String> getCenterByName(@Param("input") String center);
}
