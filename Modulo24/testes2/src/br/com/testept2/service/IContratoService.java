package br.com.testept2.service;

public interface IContratoService {
    String salvar();
    //TODO Fazer métodos de buscar, excluir e atualizar
    ContratoService buscarContrato(int contratoId);
    boolean excluirContrato(int contratoId);
    void atualizarContrato(ContratoService contrato);

    boolean atualizarContrato(int contratoId, ContratoService contrato);
}



