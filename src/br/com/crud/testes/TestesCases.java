package br.com.crud.testes;

import java.util.Calendar;

import br.com.crud.DAO.ContatoDAO;
import br.com.crud.modelo.Contato;

public class TestesCases {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		//boolean result = insertContato(createObjeto(contato));
		
		boolean result = alteraContato(createObjeto(contato)); 
		
		System.out.println(result);
		
	}
	
	public static Contato createObjeto(Contato contato){
		contato.setId(2);
		contato.setNome("Sandro");
		contato.setEmail("Sandro.s@email.com");
		contato.setMensagem("Teste alteração 2");
		
		contato.setDataNascimento(Calendar.getInstance());
		
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
}
