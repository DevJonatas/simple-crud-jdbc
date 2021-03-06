package br.com.crud.teste;

import java.util.Calendar;

import br.com.crud.DAO.ContatoDAO;
import br.com.crud.modelo.Contato;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
				
		boolean result = deleteContato(3);
		
		System.out.println(result);
		
	}
	
	public static Contato generatersObject(Contato contato){
		contato.setId(1);
		
		return contato;
	}
	
	public static boolean insertContato(Contato contatos){
		if(contatos.getNome().equals("")){
			return false;
		}else{
			ContatoDAO dao = new ContatoDAO();
			dao.insereContato(contatos);
			return true;
		}
	}
	
	public static boolean alteraContato(Contato contato){
		if(contato.getId().equals(null)){
			return false;
		}else{
			ContatoDAO dao = new ContatoDAO();
			dao.alteraContato(contato);
			return true;
		}
	}
	
	public static boolean deleteContato(int id){
		if(id == 0){
			return false;
		}else{
			ContatoDAO dao = new ContatoDAO();
			dao.deleteContato(id);
			return true;
		}
	}
}
