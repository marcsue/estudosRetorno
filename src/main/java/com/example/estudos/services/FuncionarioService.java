package com.example.estudos.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.estudos.dao.FuncionarioRepository;
import com.example.estudos.dataModel.Funcionario;

@Service
public class FuncionarioService 
{
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	public Iterable<Funcionario> findAlll()
	{
		return funcionarioRepository.findAll();
	}
	
	public Optional<Funcionario> findById(Long id)
	{
		return funcionarioRepository.findById(id);
	}
	
	public Funcionario insertDepartamento(Funcionario funcionario)
	{
		return funcionarioRepository.save(funcionario);
	}
	
	public long countDepartementos ()
	{
		return funcionarioRepository.count();
	}
	
	public void deleteDepartamento (Funcionario funcionario)
	{
		funcionarioRepository.delete(funcionario);
	}
	
}
