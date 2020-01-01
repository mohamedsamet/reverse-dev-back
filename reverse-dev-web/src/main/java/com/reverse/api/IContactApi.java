package com.reverse.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface IContactApi {
	@GetMapping(value = "/contacts")
	ResponseEntity<?> getContacts();
}
