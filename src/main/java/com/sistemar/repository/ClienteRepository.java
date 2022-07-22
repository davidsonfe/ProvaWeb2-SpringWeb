package com.sistemar.repository;

import org.springframework.data.repository.CrudRepository;

import com.sistemar.models.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, String> {
	
	Cliente findByLogin(String login);
}
