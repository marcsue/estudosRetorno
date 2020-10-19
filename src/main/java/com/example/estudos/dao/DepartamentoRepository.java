package com.example.estudos.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.example.estudos.dataModel.Departamento;

public interface DepartamentoRepository extends CrudRepository<Departamento, Integer> 
{
	@Query( value = "select * from departamentos where nome like '%t%'", nativeQuery = true)
	Iterable<Departamento> departamentosContainsT();
}
