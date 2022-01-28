package com.example.meVirando.resourses;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.meVirando.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResourse {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "maria", "maria@gmail.com", "99999", "123");
		return ResponseEntity.ok().body(u);
	}

}
