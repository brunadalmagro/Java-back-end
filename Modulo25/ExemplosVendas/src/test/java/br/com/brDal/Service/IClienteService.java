package br.com.brDal.Service;

import br.com.brDal.domain.Cliente;

public interface IClienteService {

	void salvar(Cliente cliente);

	Cliente buscarPorCpf(Long cpf);
	
}