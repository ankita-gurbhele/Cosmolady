package com.yas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yas.model.Services;

@Repository
public interface ServicesRepository extends JpaRepository<Services, Integer> {

}
