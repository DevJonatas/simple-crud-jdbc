package DAO;

import java.sql.Connection;
import jdbc.ConnectionFactory;
import modelo.Contato;

public class ContatoDAO {
	
	private Connection connection;
	
	public ContatoDAO(){
		this.connection = new ConnectionFactory().getConnection();
		
	}
	
	public void insereContato(Contato contato){
		
	}

}
