package com.example.estudos.dao;

import org.springframework.data.repository.CrudRepository;
import com.example.estudos.dataModel.Funcionario;


public interface FuncionarioRepository extends CrudRepository<Funcionario,Long>
{

}
