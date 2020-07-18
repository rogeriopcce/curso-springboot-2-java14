package br.com.rogeriopccejrfm.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rogeriopccejrfm.curso.entities.User;



@RestController
@RequestMapping( value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User us = new User(1L, "Rogerio Menezes", "rogeriopcce@gmail.com", "74988452314", "12345");
		return ResponseEntity.ok().body(us);
	}
}
