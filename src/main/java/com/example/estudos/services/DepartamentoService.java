package com.example.estudos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.estudos.dao.DepartamentoRepository;
import com.example.estudos.dataModel.Departamento;

@Service
public class DepartamentoService 
{
	@Autowired 
	private DepartamentoRepository departamentoRepository;
	
	public Iterable<Departamento> findAll()
	{
		return departamentoRepository.findAll();
	}
	
}
