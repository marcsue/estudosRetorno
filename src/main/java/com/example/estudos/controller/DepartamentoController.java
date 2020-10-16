package com.example.estudos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.estudos.dataModel.Departamento;
import com.example.estudos.services.DepartamentoService;

@Controller
@RequestMapping("/departamento")
public class DepartamentoController 
{
	@Autowired
	private DepartamentoService departamentoService;
	
	@GetMapping("/findAll")
	public @ResponseBody Iterable<Departamento> findAll()
	{
		return departamentoService.findAll();
	}
	
	
}
