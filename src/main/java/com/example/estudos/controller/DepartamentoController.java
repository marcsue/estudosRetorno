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
	
	@GetMapping("/findById")
	public @ResponseBody Optional<Departamento> findById(@RequestParam Integer id)
	{
		return departamentoService.findById(id);
	}
	
	@RequestMapping(value = "/insert",method = RequestMethod.POST,  consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Departamento insertDepartamento (@RequestBody Departamento departamento)
	{
		return departamentoService.insertDepartamento(departamento);
	}
	
	
	 @GetMapping("/departamentosContainsT") 
	 public @ResponseBody Iterable<Departamento> departamentosContainsT() 
	 { 
		 return departamentoService.departamentosContainsT(); 
	 }
	 
	
	@RequestMapping(value = "/delete",method = RequestMethod.DELETE,  consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public Boolean deleteDepartamento (@RequestBody Departamento departamento)
	{
		return departamentoService.deleteDepartamento(departamento);
		
	}
	
	@RequestMapping(value = "/edit",method = RequestMethod.POST,  consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Departamento editDepartamento (@RequestBody Departamento departamento)
	{
		return departamentoService.insertDepartamento(departamento);
	}
	
	
	
	
	
	
	
	
	
}
