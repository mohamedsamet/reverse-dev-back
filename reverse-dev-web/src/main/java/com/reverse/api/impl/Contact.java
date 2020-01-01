package com.reverse.api.impl;

import java.util.Collections;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reverse.api.IContactApi;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/api/")
public class Contact implements IContactApi {

	@Override
	public ResponseEntity<?> getContacts() {
		Object httpResponseBody;
		httpResponseBody = Collections.emptyList();
		return new ResponseEntity<>(httpResponseBody, HttpStatus.OK);
	}

}
