package br.com.agenda.dao;
// Objeto de Acesso a Dados
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.agenda.factory.ConnectionFactory;
import br.com.agenda.model.Contato;

public class ContatoDAO {
	
	public void save(Contato contato) {
		String sql = "INSERT INTO contato (nome, idade, dataCadastro) VALUES (?, ?, ?)";
		
		Connection connect = null;		
		// Prepara a conexão
		PreparedStatement statement = null; 
		
		try {
			// Cria conexão
			connect = ConnectionFactory.createConnectionToMySQL();
			
			// Cria uma PreparedStatement, para preparar a execução da query
			statement = (PreparedStatement) connect.prepareStatement(sql);
			
			// Adiciona valores esperados pela query
			statement.setString(1, contato.getNome());
			statement.setInt(2, contato.getIdade());
			statement.setDate(3, new Date(contato.getDataCadastro().getTime()));
			
			// Executar a query
			statement.execute();
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			// Fecha as conexões
			try {
				if (statement != null) {
					statement.close();
				}
				
				if (connect != null) {
					connect.close();
				}
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}

	public void update(Contato contato) {
		String sql = "UPDATE contato SET nome = ?, idade = ?, dataCadastro= ? " + "WHERE id = ?";
		
		Connection connect = null;
		PreparedStatement statement = null;
		
		try {
			connect = ConnectionFactory.createConnectionToMySQL();
			
			statement = (PreparedStatement) connect.prepareStatement(sql);
			
			// Adicionar valores para atualizar
			statement.setString(1, contato.getNome());
			statement.setInt(2, contato.getIdade());
			statement.setDate(3, new Date(contato.getDataCadastro().getTime()));
			
			// Id do registro atualizado
			statement.setInt(4, contato.getId());
			
			// Executa query
			statement.execute();
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			// Fecha conexões
			try {
				if (statement != null) {
					statement.close();
				}
				if (connect != null) {
					connect.close();
				}
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}

	public void deleteById(int id) {
		String sql = "DELETE FROM contato WHERE id = ?";
		
		Connection connect = null;
		
		PreparedStatement statement = null;
		
		try {
			connect = ConnectionFactory.createConnectionToMySQL();
			
			statement = connect.prepareStatement(sql);
			
			statement.setInt(1, id);
			statement.execute();
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (connect != null) {
					connect.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public List<Contato> getContatos() {
		String sql = "SELECT * FROM contato";
		
		List<Contato> contatos = new ArrayList<Contato>();
		
		Connection connect = null;
		PreparedStatement statement = null;
		
		// Recupera os dados do banco de dados
		ResultSet resultSet = null;
		
		try {
			connect = ConnectionFactory.createConnectionToMySQL();
			
			statement = (PreparedStatement) connect.prepareStatement(sql);
			
			// Executa a query
			resultSet = statement.executeQuery();
			
			while (resultSet.next()) {
				Contato contato = new Contato();
				
				// id
				contato.setId(resultSet.getInt("id"));
				// nome
				contato.setNome(resultSet.getString("nome"));
				// idade
				contato.setIdade(resultSet.getInt("idade"));
				// dataCadastro
				contato.setDataCadastro(resultSet.getDate("dataCadastro"));
				
				contatos.add(contato);				
			} 
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (connect != null) {
					connect.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (resultSet != null) {
					resultSet.close();
				}
			} catch(Exception e) {
				System.out.println(e);
			}
		}
			
		return contatos;
	}
}
