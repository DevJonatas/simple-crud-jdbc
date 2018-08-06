package br.com.crud.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection(){
		try{
			return DriverManager.getConnection(
					"jdbc:mysql://xxx/xxx","xxx","xxx");
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
}
