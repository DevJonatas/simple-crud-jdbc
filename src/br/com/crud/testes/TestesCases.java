package br.com.crud.testes;

import java.util.Calendar;

import br.com.crud.DAO.ContatoDAO;
import br.com.crud.modelo.Contato;

public class TestesCases {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
				
		boolean result = deleteContato(generatersObject(contato));
		
		System.out.println(result);
		
	}
	
	public static Contato generatersObject(Contato contato){
		contato.setId(5);
		
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
	
	public static boolean deleteContato(Contato contato){
		if(contato.getId().equals(null)){
			return false;
		}else{
			ContatoDAO dao = new ContatoDAO();
			dao.deleteContato(contato);
			return true;
		}
	}
}
