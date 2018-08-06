package br.com.crud.testes;

import java.util.Calendar;

import br.com.crud.DAO.ContatoDAO;
import br.com.crud.modelo.Contato;

public class TestesCases {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		boolean result = insertContato(createObjeto(contato));
		
		System.out.println(result);
		
	}
	
	public static Contato createObjeto(Contato contato){
		contato.setNome("Gabriel");
		contato.setEmail("gabriel.s@email.com");
		contato.setMensagem("Gostaria que me retornassem o contato");
		
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
}
