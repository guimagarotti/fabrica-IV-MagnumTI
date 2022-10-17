package br.com.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	// Usuário MySQL;
	private static final String USERNAME = "root";
	
	// Senha MySQL;
	private static final String PASSWORD = "Guilherme10!";
	
	// Caminho, porta e nome do banco de dados;
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";
	
	// Conexão
	public static Connection createConnectionToMySQL() throws Exception {
		// Carrega a classe pela JVM
		Class.forName("com.mysql.jdbc.Driver");
		
		// Cria conexão com o banco de dados
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		return connection;
	}
	
	public static void main(String[] args) throws Exception {
		// Recuperar conexão
		Connection connect = createConnectionToMySQL();
		
		// Testa conexão
		if (connect != null) {
			System.out.println("Conexão realizada com sucesso!");
			connect.close();
		}
	}
}
