package com.yas.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yas.model.MakeUp;

@Repository
public interface MakeUpRepository extends JpaRepository<MakeUp, Integer> {

}
