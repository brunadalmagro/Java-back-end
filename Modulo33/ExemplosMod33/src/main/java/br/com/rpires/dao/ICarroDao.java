package br.com.rpires.dao;

import br.com.rpires.domain.Carro;

public interface ICarroDao {
    Carro cadastrar(Carro carro);
    Carro buscarPorId(Long id);
    void atualizar(Carro carro);
    void deletar(Carro carro);
}
