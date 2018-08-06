package br.com.crud.modelo;

import java.util.Calendar;

public class Contato {
	private Long id;
	private String nome;
	private String email;
	private String mensagem;
	private Calendar dataNascimento;
	
	public Long getId() {
		return id;
	}

	public void setId(int i) {
		this.id = (long) i;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
}
