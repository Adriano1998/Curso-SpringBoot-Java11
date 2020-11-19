package com.project.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	//para indicar que é o metodo get.
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "99843834", "12345");
		return ResponseEntity.ok().body(u);
	}
}
