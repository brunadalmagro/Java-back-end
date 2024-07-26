/**
 * 
 */
package br.com.rpires.dao;

import java.util.List;

import br.com.rpires.dao.generic.IGenericDAO;
import br.com.rpires.domain.Cliente;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
