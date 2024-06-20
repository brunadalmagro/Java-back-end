package br.com.rpires.dao;

import br.com.rpires.domain.Marca;

public interface IMarcaDao {
    Marca cadastrar(Marca marca);
    Marca buscarPorId(Long id);
    void atualizar(Marca marca);
    void deletar(Marca marca);
}
