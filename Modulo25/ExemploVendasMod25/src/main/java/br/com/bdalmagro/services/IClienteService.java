/**
 * 
 */
package br.com.bdalmagro.services;

import br.com.bdalmagro.exceptions.TipoChaveNaoEncontradaException;
import br.com.bdalmagro.domain.Cliente;

/**
 * @author Bruna.D
 *
 */
public interface IClienteService {

	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
