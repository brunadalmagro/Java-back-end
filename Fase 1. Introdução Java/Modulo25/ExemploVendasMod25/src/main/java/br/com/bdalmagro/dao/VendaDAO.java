/**
 * 
 */
package br.com.bdalmagro.dao;

import br.com.bdalmagro.dao.generic.GenericDAO;
import br.com.bdalmagro.domain.Venda;
import br.com.bdalmagro.domain.Venda.Status;
import br.com.bdalmagro.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author Bruna.D
 *
 */
public class VendaDAO extends GenericDAO<Venda, String> implements IVendaDAO {

	@Override
	public Class<Venda> getTipoClasse() {
		return Venda.class;
	}

	@Override
	public void atualiarDados(Venda entity, Venda entityCadastrado) {
		entityCadastrado.setCodigo(entity.getCodigo());
		entityCadastrado.setStatus(entity.getStatus());
	}

	@Override
	public void excluir(String valor) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException {
		venda.setStatus(Status.CONCLUIDA);
		super.alterar(venda);
	}
	
	

}
