/**
 * 
 */
package br.com.bdalmagro.services;

import br.com.bdalmagro.dao.IProdutoDAO;
import br.com.bdalmagro.services.generic.GenericService;
import br.com.bdalmagro.domain.Produto;

/**
 * @author Bruna.D
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
