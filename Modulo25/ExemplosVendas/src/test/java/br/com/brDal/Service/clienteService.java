package br.com.brDal.Service;

import br.com.brDal.dao.ClienteDAO;
import br.com.brDal.dao.IClienteDAO;
import br.com.brDal.domain.Cliente;

public class clienteService implements IClienteService {
	
	private IClienteDAO clienteDAO;
	
	public void ClienteService(IClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO();
	}
	
	@Override
	public void salvar(Cliente cliente) {
		clienteDAO.salvar(cliente);
	}

	@Override
	public Cliente buscarPorCpf(Long cpf) {
		return null;
	}

}
