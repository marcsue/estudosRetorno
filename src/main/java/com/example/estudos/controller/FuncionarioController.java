package com.example.estudos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.estudos.dataModel.Funcionario;
import com.example.estudos.services.FuncionarioService;

@Controller
@RequestMapping("/funcionario")
public class FuncionarioController 
{
	
	@Autowired
	FuncionarioService funcionarioService;
	
	@GetMapping("/findAll")
	public @ResponseBody Iterable<Funcionario> buscarTodos()
	{
		return funcionarioService.findAlll();
	}

}
