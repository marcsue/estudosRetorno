package com.example.estudos.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.estudos.dataModel.Funcionario;
import com.example.estudos.services.FuncionarioService;

@Controller
@RequestMapping("/funcionario")
public class FuncionarioController 
{
	
	@Autowired
	private FuncionarioService funcionarioService;
	
	@GetMapping("/findAll")
	public @ResponseBody Iterable<Funcionario> findAll()
	{
		return funcionarioService.findAlll();
	}
	
	@GetMapping("/findById")
	public @ResponseBody Optional<Funcionario> findById(@RequestParam Long id)
	{
		return funcionarioService.findById(id);
		
	}
	
	@RequestMapping(value = "/insert",method = RequestMethod.POST,  consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Funcionario insertFuncionario (@RequestBody Funcionario funcionario)
	{
		return funcionarioService.insertFuncionario(funcionario);
	}
	
	@RequestMapping(value = "/delete",method = RequestMethod.DELETE,  consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Boolean deleteFuncionario (@RequestBody Funcionario funcionario)
	{
		return funcionarioService.deleteFuncionario(funcionario);
		
	}
	
	@RequestMapping(value = "/edit",method = RequestMethod.POST,  consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Funcionario editFuncionario (@RequestBody Funcionario funcionario)
	{
		return funcionarioService.insertFuncionario(funcionario);
	}
	
	

}




























