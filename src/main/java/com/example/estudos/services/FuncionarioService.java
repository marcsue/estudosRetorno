package com.example.estudos.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.estudos.dao.FuncionarioRepository;
import com.example.estudos.dataModel.Departamento;
import com.example.estudos.dataModel.Funcionario;

@Service
public class FuncionarioService 
{
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	public Iterable<Funcionario> buscarTodos()
	{
		
		return funcionarioRepository.findAll();
	}
	
}
