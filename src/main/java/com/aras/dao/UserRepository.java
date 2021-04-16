package com.aras.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aras.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
