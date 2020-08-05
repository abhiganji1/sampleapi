package com.uvaan.sampleapi.service;

import java.util.Optional;

import com.uvaan.sampleapi.domain.User;
import com.uvaan.sampleapi.param.UserParam;



public interface UserService {

	Optional<User> getUserById(Long id);
	User createUser(UserParam userParam);

	void deleteUser(Long id);
	User updateUser(UserParam userParam);
	
	User findByEmail(String email);
	
}
