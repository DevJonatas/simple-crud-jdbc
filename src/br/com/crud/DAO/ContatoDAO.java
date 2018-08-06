package br.com.crud.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.crud.jdbc.ConnectionFactory;
import br.com.crud.modelo.Contato;

public class ContatoDAO {
	
	private Connection connection;
	
	public ContatoDAO(){
		this.connection = new ConnectionFactory().getConnection();
		
	}
	
	public void insereContato(Contato contato){
		String sql = "insert into contatos"+
					  "(nome,email,mensagem,dataNascimento)"+
					  "values (?,?,?,?)";
		
		try{
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getMensagem());
			
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
			
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public void alteraContato(Contato contato){
		String sql = "update contatos set nome=?, email=?, mensagem=?, "+
					 "dataNascimento=? where id=?";
		
		try{
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getMensagem());
			
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
			
			stmt.setLong(5, contato.getId());
			
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}

	}
	
	public void removeContato(Contato contato){
		
	}

}
