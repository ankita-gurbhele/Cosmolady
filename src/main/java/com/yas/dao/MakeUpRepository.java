package com.yas.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.yas.model.MakeUp;

@Repository
public interface MakeUpRepository extends JpaRepository<MakeUp, Integer> {

	@Query(value = "SELECT * FROM make_up", nativeQuery = true)
	public List<String> getAll();
}
