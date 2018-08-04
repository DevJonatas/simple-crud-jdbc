package br.com.crud.testes;

import java.util.Calendar;

import br.com.crud.DAO.ContatoDAO;
import br.com.crud.modelo.Contato;

public class TestesCases {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Gabriel Santos");
		contato.setEmail("gabriel.s@email.com");
		contato.setMensagem("Gostaria que me retornassem o contato");
		
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDAO dao = new ContatoDAO();
		dao.insereContato(contato);
		
		System.out.println("Insert OK");
		
	}
	
}
