package com.example.estudos.dataModel;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "departamentos")
public class Departamento 
{
	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "sigla")
	private String sigla;

	

	public Departamento() {}
	
	public Departamento(Long id, String nome, String sigla) 
	{
		super();
		this.id = id;
		this.nome = nome;
		this.sigla = sigla;
	}

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nome=" + nome + ", sigla=" + sigla + "]";
	}
	
	

	
	
	
	
}
