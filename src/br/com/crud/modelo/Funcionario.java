package br.com.crud.modelo;

import sun.security.util.Password;

public class Funcionario {
	
	private int id;
	private String nome;
	private String usuario;
	private Password senha;
	
	Funcionario(String usuario, Password senha){
		this.usuario = usuario;
		this.senha = senha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}
	
}
