/**
 * 
 */
package br.com.bdalmagro.dao;

import br.com.bdalmagro.dao.generic.IGenericDAO;
import br.com.bdalmagro.domain.Venda;
import br.com.bdalmagro.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author Bruna.D
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
