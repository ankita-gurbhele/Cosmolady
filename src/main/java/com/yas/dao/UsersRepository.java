package com.yas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yas.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}
