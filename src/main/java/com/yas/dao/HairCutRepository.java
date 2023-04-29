package com.yas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yas.model.HairCut;

@Repository
public interface HairCutRepository extends JpaRepository<HairCut, Integer>{

}
