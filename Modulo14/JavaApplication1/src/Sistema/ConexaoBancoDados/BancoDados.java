/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema.ConexaoBancoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author bruna
 */
public class BancoDados {
    public void salvarClienteNoBancoDeDados(String nome, String sobrenome, String cpf, String telefone, String endereco, String cep) {
        try (Connection conexao = ConexaoBancoDados.obterConexao()) {
            String sql = "INSERT INTO tabela_clientes (nome, sobrenome, cpf, telefone, endereco, cep) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);

            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, sobrenome);
            preparedStatement.setString(3, cpf);
            preparedStatement.setString(4, telefone);
            preparedStatement.setString(5, endereco);
            preparedStatement.setString(6, cep);    

            preparedStatement.executeUpdate();

            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // Lidar com exceções
        }
    }
}