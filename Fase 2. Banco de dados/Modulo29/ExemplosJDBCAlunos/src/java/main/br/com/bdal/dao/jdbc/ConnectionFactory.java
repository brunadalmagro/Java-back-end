/**
 * 
 */
package br.com.bdal.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Bruna D.
 *
 */
public class ConnectionFactory {

	
	private static Connection connection;
	
	private ConnectionFactory(Connection connection) {
		
	}
	
	public static Connection getConnection() throws SQLException {
		if (connection == null) {
			connection = initConnection();
			return connection;
		} else if (connection.isClosed()) {
			connection = initConnection();
			return connection;
		} else {
			return connection;
		}
	}

	private static Connection initConnection() {
		try {
			Class.forName("org.postgresql.Driver");

			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/vendas_online_2", "postgres", "1234");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
	}
}
