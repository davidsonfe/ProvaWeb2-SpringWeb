package com.sistemar.repository;

import org.springframework.data.repository.CrudRepository;

import com.sistemar.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{

	Evento findByCodigo(long codigo);
	
}
