package br.com.crud.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection(){
		try{
			return DriverManager.getConnection(
					"jdbc:mysql://xx/xx","xx","xx");
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
}