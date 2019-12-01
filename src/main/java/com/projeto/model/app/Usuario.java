package com.projeto.model.app;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Usuario {

	@Id
	@GeneratedValue
	private Integer id;
	@NotBlank(message="O campo Nome precisa ser preenchido")
	private String nome;
	@NotBlank(message="O campo Nome precisa ser preenchido")
	
	@NotBlank(message="O campo CPF precisa ser preenchido")

	private String cpf;
	private Calendar dataNascimento;
	@NotBlank(message="O campo estado civil precisa ser preenchido")
	private String estadoCivil;
	

	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	
}
