/**
 * 
 */
package br.com.bdal.dao;

import br.com.bdal.domain.Cliente;

import java.security.PublicKey;
import java.util.List;

/**
 * @author Bruna D.
 *
 */
public interface IClienteDAO {

	
	public Integer cadastrar(Cliente cliente) throws Exception;

	public Cliente consultar(String codigo) throws Exception;

	public Integer excluir(Cliente clienteBD) throws Exception;

	public Integer atualizar(Cliente cliente) throws Exception;

	public List<Cliente> buscarTodos() throws Exception;
	}