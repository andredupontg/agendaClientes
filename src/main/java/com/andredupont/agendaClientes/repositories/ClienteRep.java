package com.andredupont.agendaClientes.repositories;

import com.andredupont.agendaClientes.models.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRep extends CrudRepository<Cliente, Long> {
}
