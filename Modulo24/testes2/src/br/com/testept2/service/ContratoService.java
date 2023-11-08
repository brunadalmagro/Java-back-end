package br.com.testept2.service;

import br.com.testept2.dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public ContratoService buscarContrato(int contratoId) {
        return null;
    }

    @Override
    public boolean excluirContrato(int contratoId) {
        return false;
    }

    @Override
    public void atualizarContrato(ContratoService contrato) {

    }

    @Override
    public boolean atualizarContrato(int contratoId, ContratoService contrato) {
        return false;
    }
}