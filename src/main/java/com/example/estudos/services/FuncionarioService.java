package com.example.estudos.services;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.estudos.dao.FuncionarioRepository;
import com.example.estudos.dataModel.Funcionario;

@Service
public class FuncionarioService 
{
	private final Logger log = LoggerFactory.getLogger(FuncionarioService.class);
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@Autowired
	private DepartamentoService departamentoService;
	
	public Iterable<Funcionario> findAlll()
	{
		return funcionarioRepository.findAll();
	}
	
	public Optional<Funcionario> findById(Long id)
	{
		try 
		{
			if (!(funcionarioRepository.findById(id).equals(null)))
			{
				return funcionarioRepository.findById(id);
			}
			else
			{
				return null;
			}
		} 
		catch (Exception e) 
		{
			log.error("erro ao buscar o funcionario por ID",e.getMessage());
			return null;
		}
		}
	
	public Funcionario insertFuncionario(Funcionario funcionario)
	{
		try
		{
			if (!(departamentoService.findById(funcionario.getDepartamento()).isEmpty()))
				return funcionarioRepository.save(funcionario);
			else
			{
				log.error("Departamento "+funcionario.getDepartamento() +" nao encontrado");
				return null;
			}
		}
		catch (Exception e) 
		{
			log.error("erro ao inserir ",e.getMessage());
			return null;
		}
	}
	
	public Boolean deleteFuncionario (Funcionario funcionario)
	{
		try
		{
			funcionarioRepository.delete(funcionario);
			return true;
		}	
		catch (Exception e) 
		{
			log.error("Erro ao deletar "+funcionario.getNome() ,e.getMessage());
			return false;
		}
	}
}
