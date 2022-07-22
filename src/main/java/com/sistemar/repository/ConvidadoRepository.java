package com.sistemar.repository;

import org.springframework.data.repository.CrudRepository;

import com.sistemar.models.Convidado;
import com.sistemar.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{
	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByRg(String rg);
}
