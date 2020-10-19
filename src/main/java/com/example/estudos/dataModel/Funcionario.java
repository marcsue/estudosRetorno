package com.example.estudos.dataModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "funcionarios")
public class Funcionario 
{
	@Id
	@Column( name = "cpf")
	private Long cpf;
	
	@Column( name = "nome")
	private String nome;
	
	@Column( name = "departamento")
	private String sigla;
	
	public Funcionario () {}
	
	public Funcionario(long cpf, String nome, String departamento) 
	{
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.sigla = departamento;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return sigla;
	}

	public void setDepartamento(String departamento) {
		this.sigla = departamento;
	}

	@Override
	public String toString() {
		return "Funcionario [cpf=" + cpf + ", nome=" + nome + ", departamento=" + sigla + "]";
	}
	
	
}
