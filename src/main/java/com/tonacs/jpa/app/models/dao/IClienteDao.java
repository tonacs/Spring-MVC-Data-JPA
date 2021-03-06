package com.tonacs.jpa.app.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.tonacs.jpa.app.models.entity.Cliente;

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long>{
	
}
