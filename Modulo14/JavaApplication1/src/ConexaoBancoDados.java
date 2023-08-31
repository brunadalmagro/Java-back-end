package Sistema.ConexaoBancoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
* @author Bruna
*/
public class ConexaoBancoDados {
    private static final String URL = "jdbc:sqlite:seu_banco_de_dados.db"; // Substitua pelo URL correto do seu banco
    private static Connection conexao;

    public static Connection obterConexao() {
        try {
            if (conexao == null || conexao.isClosed()) {
                conexao = DriverManager.getConnection(URL);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conexao;
    }
}
