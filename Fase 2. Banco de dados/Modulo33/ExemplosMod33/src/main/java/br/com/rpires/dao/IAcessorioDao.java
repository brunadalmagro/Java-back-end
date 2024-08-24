package br.com.rpires.dao;

import br.com.rpires.domain.Acessorio;

public interface IAcessorioDao {
    Acessorio cadastrar(Acessorio acessorio);
    Acessorio buscarPorId(Long id);
    void atualizar(Acessorio acessorio);
    void deletar(Acessorio acessorio);
}
