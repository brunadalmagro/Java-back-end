
package br.com.brDal;

import org.junit.Assert;
import org.junit.Test;
import br.com.brDal.Service.IClienteService;
import br.com.brDal.Service.clienteService;
import br.com.brDal.dao.ClienteDaoMock;
import br.com.brDal.domain.Cliente;
import br.com.brDal.dao.IClienteDAO;

/**
 * @author brDal
 */

public class ClienteTest {

	private IClienteService clienteService;
	
	public ClienteTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new clienteService(dao);
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente cliente = new Cliente();
		cliente.setCpf(123123);
		cliente.setNome(null);
		cliente.setCidade(null);
		cliente.setEnd(null);
		cliente.setEstado(null);
		cliente.setNumero(null);
		cliente.setTel(null);
		
		clienteService.salvar(cliente);
		
		Cliente clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());
		
		Assert.assertNotNull((clienteConsultado));
	}
}


