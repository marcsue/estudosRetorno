package com.example.estudos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.example.estudos.controller","com.example.estudos.dataModel","com.example.estudos.services","com.example.estudos.dao"})
@EntityScan(basePackages = {"com.example.estudos.controller","com.example.estudos.dataModel","com.example.estudos.services","com.example.estudos.dao"})
@EnableJpaRepositories(basePackages = {"com.example.estudos.controller","com.example.estudos.dataModel","com.example.estudos.services","com.example.estudos.dao"})
@SpringBootApplication
public class EstudosApplication extends SpringBootServletInitializer
{

	public static void main(String[] args) 
	{
		SpringApplication.run(EstudosApplication.class, args);
	}

}
