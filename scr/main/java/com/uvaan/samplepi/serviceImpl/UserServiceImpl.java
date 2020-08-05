package com.uvaan.samplepi.serviceImpl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.uvaan.sampleapi.domain.User;
import com.uvaan.sampleapi.exception.ResourceNotFoundException;
import com.uvaan.sampleapi.param.UserParam;
import com.uvaan.sampleapi.repository.UserRepository;
import com.uvaan.sampleapi.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	

	@Override
	public Optional<User> getUserById(Long id) {
		Optional<User> a = userRepository.findById(id);
		return a;
	}

	@Override
	public User createUser(UserParam userParam) {

		User user = null;
		user = new User();
		user.setEmail(userParam.getEmail());
		user.setPassword(userParam.getPassword());
		user.setCreatedBy(userParam.getCreatedby());
		user.setCreatedDate(userParam.getCreateddate());
		user.setUpdatedBy(userParam.getUpdatedby());
		user.setUpdatedDate(userParam.getUpdaateddate());

		try {
			user = userRepository.save(getUserByParams(userParam, null));
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException(
					"User is already exist for selected the mobile & countryCode,Please provide different valid fields.");
		}
		return user;
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);

	}

	@Override
	public User updateUser(UserParam userParam) {
		User user = getUserById(userParam.getId())
				.orElseThrow(() -> new ResourceNotFoundException("User", "id", userParam.getId()));
		try {
			user = getUserByParams(userParam, user);
			user = userRepository.save(user);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException(
					"User is already exist for selected the mobile & countryCode,Please provide different valid fields.");
		}
		return user;
	}

	private User getUserByParams(UserParam userParam, User user) {

		if (null == userParam.getEmail()) {
			userParam.setEmail(user.getEmail());

		}
		if (null == userParam.getPassword()) {
			userParam.setPassword(user.getPassword());

		}
		if (0 == userParam.getCreatedby()) {
			userParam.setCreatedby(user.getCreatedBy());

		}
		if (null == userParam.getCreateddate()) {
			userParam.setCreateddate(user.getCreatedDate());

		}
		if (0 == userParam.getCreatedby()) {
			userParam.setUpdatedby(user.getUpdatedBy());

		}
		if (null == userParam.getUpdaateddate()) {
			userParam.setUpdaateddate(user.getUpdatedDate());

		}

		user.setEmail(userParam.getEmail());
		user.setPassword(userParam.getPassword());
		user.setCreatedBy(userParam.getCreatedby());
		user.setCreatedDate(userParam.getCreateddate());
		user.setUpdatedBy(userParam.getUpdatedby());
		user.setUpdatedDate(userParam.getUpdaateddate());
		return user;
	}

	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

}
