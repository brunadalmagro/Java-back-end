package br.com.bdalmagro.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.com.bdalmagro.domain.Cliente;
import br.com.bdalmagro.exceptions.TipoChaveNaoEncontradaException;

public class ClienteDaoMock implements IClienteDAO {

	private Map<Long, Cliente> clientes; // Armazena clientes pelo cpf

	public ClienteDaoMock () {
		this.clientes = new HashMap<>();
	}

	@Override
	public Long getChave(Cliente entity) throws TipoChaveNaoEncontradaException {
		// TODO: Lógica para obter a chave primária do cliente
		return entity.getCpf();
	}

	@Override
	public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
		// Verifica se o cliente já está cadastrado
		if (clientes.containsKey(entity.getCpf())) {
			return false; // Cliente já cadastrado, não é possível cadastrar novamente
		}
		// Adiciona o cliente ao mapa de clientes
		clientes.put(entity.getCpf(), entity);
		return true; // Cliente cadastrado com sucesso
	}

	@Override
	public void excluir(Long cpf) {
		// Remove o cliente pelo CPF, se existir
		clientes.remove(cpf);
	}

	@Override
	public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {
		// Verifica se o cliente existe no mapa
		if (clientes.containsKey(entity.getCpf())) {
			// Atualiza os dados do cliente
			clientes.put(entity.getCpf(), entity);
		}
	}

	@Override
	public Cliente consultar(Long valor) {
		// Retorna o cliente pelo CPF, se existir
		return clientes.get(valor);
	}

	@Override
	public Collection<Cliente> buscarTodos() {
		// TODO: Lógica para buscar todos os clientes
		return clientes.values();
	}
}
