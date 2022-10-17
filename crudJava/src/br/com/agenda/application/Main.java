package br.com.agenda.application;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {
	public static void main(String[] args) {
		Contato contato = new Contato();
		ContatoDAO contatoDAO = new ContatoDAO();
		
		// INSERT banco de dados
		contato.setNome("Rodinei");
		contato.setIdade(24);
		contato.setDataCadastro(new Date());
		
		// Salvar novo contato
		// contatoDAO.save(contato);
		
		// UPDATE banco de dados
		Contato newCont = new Contato();
		newCont.setNome("Guilherme Cambi");
		newCont.setIdade(19);
		newCont.setDataCadastro(new Date());
		newCont.setId(3);
		
		// Atualizar contato existente
		contatoDAO.update(newCont);
		
		// Remover contato existente
		contatoDAO.deleteById(0);
		
		// Select banco de dados
		for(Contato cont : contatoDAO.getContatos()) {
			System.out.println("Contato: " + cont.getNome());
		}		
	}
}
