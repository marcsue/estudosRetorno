package com.example.estudos.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.estudos.dao.DepartamentoRepository;
import com.example.estudos.dataModel.Departamento;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class DepartamentoService 
{
	private final Logger log = LoggerFactory.getLogger(DepartamentoService.class);
	
	@Autowired 
	private DepartamentoRepository departamentoRepository;
	
	public Iterable<Departamento> findAll()
	{
		try
		{
			return departamentoRepository.findAll();
		}
		catch (Exception e) 
		{
			log.error("erro ao buscar todos os departamentos",e.getMessage());
			return null;
		}
	}
	
	public Optional<Departamento> findById(Integer id)
	{
		try 
		{
			return departamentoRepository.findById(id);
		} 
		catch (Exception e) 
		{
			log.error("erro ao buscar o departamento por ID",e.getMessage());
			return null;
		}
	
	}
	
	public Departamento insertDepartamento(Departamento departamento)
	{
		try 
		{
			return departamentoRepository.save(departamento);
		} 
		catch (Exception e) 
		{
			log.error("erro ao inserir departamento",e.getMessage());
			return null;
		}
		
	}
	
	public Iterable<Departamento> departamentosContainsT ()
	{
		try
		{
			return departamentoRepository.departamentosContainsT();
		}
		catch (Exception e) 
		{
			log.error("erro ao buscar departamentos que contaim T",e.getMessage());
			return null;
		}
	}
	
	public Boolean deleteDepartamento (Departamento departamento)
	{
		try
		{
			departamentoRepository.delete(departamento);
			if (findById(departamento.getId()) == null)
				return true;
			else
				return false;
		}
		catch (Exception e) 
		{
			log.error("erro ao deletar departamento",e.getMessage());
			return false;
		}
	}
}
























