package br.com.testept2.service;

import br.com.testept2.dao.IContratoDao;
import br.com.testept2.dao.mock.ContratoDaoMock;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;
    private double valorTotal;

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
        { return null; }
    }

    @Override
    public boolean excluirContrato(int contratoId) {
        return true;
    }

    @Override
    public void atualizarContrato(ContratoDaoMock contrato) {

    }

    @Override
    public boolean atualizarContrato(int contratoId, ContratoService contrato) {
        return false;
    }

    public int getId() {
        return 0;
    }
}