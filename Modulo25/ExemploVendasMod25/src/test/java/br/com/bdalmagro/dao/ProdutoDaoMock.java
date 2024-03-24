package br.com.bdalmagro.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.com.bdalmagro.domain.Produto;
import br.com.bdalmagro.exceptions.TipoChaveNaoEncontradaException;

public class ProdutoDaoMock implements IProdutoDAO {

	private Map<String, Produto> produtos; // Armazena produtos pelo código

	public ProdutoDaoMock() {
		this.produtos = new HashMap<>();
	}

	@Override
	public String getChave(Produto entity) throws TipoChaveNaoEncontradaException {
		return entity.getCodigo();
	}

	@Override
	public Boolean cadastrar(Produto entity) throws TipoChaveNaoEncontradaException {
		// Verifica se o produto já está cadastrado
		if (produtos.containsKey(entity.getCodigo())) {
			return false; // Produto já cadastrado, não é possível cadastrar novamente
		}
		// Adiciona o produto ao mapa de produtos
		produtos.put(entity.getCodigo(), entity);
		return true; // Produto cadastrado com sucesso
	}

	@Override
	public void excluir(String codigo) {
		// Remove o produto pelo código, se existir
		produtos.remove(codigo);
	}

	@Override
	public void alterar(Produto entity) throws TipoChaveNaoEncontradaException {
		// Verifica se o produto existe no mapa
		if (produtos.containsKey(entity.getCodigo())) {
			// Atualiza os dados do produto
			produtos.put(entity.getCodigo(), entity);
		}
	}

	@Override
	public Produto consultar(String codigo) {
		// Retorna o produto pelo código, se existir
		return produtos.get(codigo);
	}

	@Override
	public Collection<Produto> buscarTodos() {
		// Retorna todos os produtos armazenados
		return produtos.values();
	}
}
