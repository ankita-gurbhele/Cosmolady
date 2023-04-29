package com.yas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.yas.model.HairSpa;

@Repository
public interface HairSpaRepository extends JpaRepository<HairSpa, Integer> {

}
