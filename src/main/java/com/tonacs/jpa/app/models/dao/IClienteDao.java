package com.tonacs.jpa.app.models.dao;



import org.springframework.data.repository.CrudRepository;

import com.tonacs.jpa.app.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{
	
}
