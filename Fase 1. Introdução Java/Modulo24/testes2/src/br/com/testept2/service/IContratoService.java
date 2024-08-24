package br.com.testept2.service;

import br.com.testept2.dao.mock.ContratoDaoMock;

public interface IContratoService {
    String salvar();
    //TODO Fazer métodos de buscar, excluir e atualizar
    ContratoService buscarContrato(int contratoId);
    boolean excluirContrato(int contratoId);
    void atualizarContrato(ContratoDaoMock contrato);

    boolean atualizarContrato(int contratoId, ContratoService contrato);
}


