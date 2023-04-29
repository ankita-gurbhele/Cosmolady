package com.yas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yas.model.HairColor;
@Repository
public interface HairColorRepository extends JpaRepository<HairColor, Integer> {

}
