package br.com.crud.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.crud.jdbc.ConnectionFactory;
import br.com.crud.modelo.Funcionario;

public class FuncionarioDAO {
	
	private Connection connection;
	
	FuncionarioDAO(){
		this.connection = new ConnectionFactory().getConnection();
	}

	public void insereFuncionario(Funcionario funcionario){
		String sql = "insert into funcionarios"+
					 "(nome,usuario,senha)"+
					 "values (?,?,?)";
		
		try{
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getUsuario());
			
			//Passsword
			
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
		
	} 
	
	public void alteraFuncionario(Funcionario funcionario){
		String sql = "update funcionarios set nome=?, usuario=?"+
					 "where id=?";
		
		try{
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getUsuario());
			
			stmt.setInt(3, funcionario.getId());
			
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public void deletaFuncionario(int id){
		String sql = "delete from funcionarios where id=?";
		
		try{
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setInt(1, id);
			
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
}
