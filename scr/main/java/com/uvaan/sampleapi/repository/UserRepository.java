package com.uvaan.sampleapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uvaan.sampleapi.domain.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String Email);
}