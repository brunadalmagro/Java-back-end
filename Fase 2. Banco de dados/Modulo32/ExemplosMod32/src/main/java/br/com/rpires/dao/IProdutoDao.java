package br.com.rpires.dao;

import br.com.rpires.domain.Produto;

import java.util.List;

public interface IProdutoDao {

    Produto cadastrar(Produto produto);

    Produto buscarPorId(Long id);

    void excluir(Produto produto);

    List<Produto> buscarTodos();
}
