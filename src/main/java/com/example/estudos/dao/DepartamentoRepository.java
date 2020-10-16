package com.example.estudos.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.estudos.dataModel.Departamento;

public interface DepartamentoRepository extends CrudRepository<Departamento, Integer> 
{

}
