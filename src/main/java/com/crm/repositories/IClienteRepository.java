package com.crm.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.crm.entity.Cliente;

public interface IClienteRepository extends CrudRepository<Cliente, Long>{
	
	public List<Cliente> findAllByOrderByNombreAsc();
	

}
