package br.com.crud.DAO;

import java.sql.Connection;

import br.com.crud.jdbc.ConnectionFactory;
import br.com.crud.modelo.Contato;

public class FuncionarioDAO {
	
	private Connection connection;
	
	FuncionarioDAO(){
		this.connection = new ConnectionFactory().getConnection();
	}

	public void insereFuncionario(Contato contato){
		
	} 
	
	public void alteraFuncionario(Contato contato){
		
	}
	
	public void deletaFuncionario(int id){
		
	}
}
