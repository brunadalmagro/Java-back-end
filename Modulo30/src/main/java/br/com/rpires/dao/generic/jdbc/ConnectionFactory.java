package br.com.rpires.dao.generic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Factory para obter conexões com o banco de dados.
 * Utiliza o padrão Singleton para garantir uma única instância de conexão.
 *
 */
public class ConnectionFactory {

	private static Connection connection;

	// Construtor privado para evitar instanciação
	private ConnectionFactory() {
	}

	// Método para obter a conexão com o banco de dados
	public static Connection getConnection() throws SQLException {
		if (connection == null || connection.isClosed()) {
			connection = initConnection();
		}
		return connection;
	}

	// Método para inicializar a conexão com o banco de dados
	private static Connection initConnection() throws SQLException {
		try {
			// Carregar o driver JDBC
			Class.forName("org.postgresql.Driver");
			// Estabelecer a conexão
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/vendas_online_2", "postgres", "1234");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Driver do banco de dados não encontrado.", e);
		}
	}
}
