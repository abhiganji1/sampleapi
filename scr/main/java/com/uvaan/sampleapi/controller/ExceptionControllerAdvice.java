package com.uvaan.sampleapi.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.uvaan.sampleapi.dto.ApiResponse;
import com.uvaan.sampleapi.exception.SampleException;

@RestController
@ControllerAdvice
public class ExceptionControllerAdvice extends ResponseEntityExceptionHandler {

	@SuppressWarnings("rawtypes")
	@ExceptionHandler(value = SampleException.class)
	public ResponseEntity exception(SampleException exception) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("message", exception.getErrorMessage());
		// return new ResponseEntity<Map<String,String>>(map, HttpStatus.BAD_REQUEST);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse(HttpStatus.BAD_REQUEST, exception.getMessage(), null));
	}

	@ExceptionHandler({ RuntimeException.class })
	public ResponseEntity handleRunTimeException(RuntimeException e) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("message", e.getMessage());
		map.put("error", HttpStatus.NOT_FOUND.value() + "");
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse(HttpStatus.BAD_REQUEST, e.getMessage(), null));
	}

	@SuppressWarnings("rawtypes")
	@ExceptionHandler(value = DataIntegrityViolationException.class)
	public ResponseEntity exception1(DataIntegrityViolationException exception) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("message", exception.getMessage());
		// return new ResponseEntity<Map<String,String>>(map, HttpStatus.BAD_REQUEST);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse(HttpStatus.BAD_REQUEST, exception.getMessage(), null));
	}

	// com.fasterxml.jackson.databind.exc.InvalidFormatException

	@SuppressWarnings("rawtypes")
	@ExceptionHandler(value = InvalidFormatException.class)
	public ResponseEntity exception5(InvalidFormatException exception) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("message", "Invalid format");
		// return new ResponseEntity<Map<String,String>>(map, HttpStatus.BAD_REQUEST);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse(HttpStatus.BAD_REQUEST, exception.getMessage(), null));
	}

	/*
	 * @ResponseStatus(HttpStatus.NOT_FOUND)
	 * 
	 * @ExceptionHandler(NoHandlerFoundException.class) public ResponseEntity
	 * handleNoHandlerFoundException(NoHandlerFoundException ex) { Map<String,
	 * String> map = new HashMap<String, String>(); map.put("message",
	 * "Invalid format"); return
	 * ResponseEntity.status(HttpStatus.NOT_FOUND).body(map); }
	 */

	/*
	 * @SuppressWarnings("rawtypes")
	 * 
	 * @ExceptionHandler(value = BadCredentialsException.class) public
	 * ResponseEntity exception3(BadCredentialsException exception) {
	 * Map<String,String> map =new HashMap<String, String>(); map.put("message",
	 * exception.getMessage()); //return new ResponseEntity<Map<String,String>>(map,
	 * HttpStatus.BAD_REQUEST); return
	 * ResponseEntity.status(HttpStatus.BAD_REQUEST).body(map); }
	 */

}
