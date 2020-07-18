package br.com.rogeriopccejrfm.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rogeriopccejrfm.curso.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
