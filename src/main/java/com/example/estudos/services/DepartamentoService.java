package com.example.estudos.services;

import java.util.Optional;

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
	
	public Optional<Departamento> findById(Integer id)
	{
		return departamentoRepository.findById(id);
	}
	
	public Departamento insertDepartamento(Departamento departamento)
	{
		return departamentoRepository.save(departamento);
	}
	
	public Iterable<Departamento> departamentosContainsT ()
	{
		return departamentoRepository.departamentosContainsT();
	}
	
	public Boolean deleteDepartamento (Departamento departamento)
	{
		departamentoRepository.delete(departamento);
		if (findById(departamento.getId()) == null)
			return true;
		else
			return false;
	}
}
























