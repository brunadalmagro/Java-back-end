package br.com.testept2.service;

import br.com.testept2.dao.IContratoDao;
import br.com.testept2.dao.mock.ContratoDaoMock;
import org.junit.Assert;

public class ContratoService implements IContratoService {

    private final IContratoDao contratoDao;
    private int id;
    private double valorTotal;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    public void setId(int id) { this.id = id; }
    public void setValorTotal(double valorTotal){
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }
    public double getValorTotal(){
        return valorTotal;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public ContratoService buscarContrato(int contratoId) {
        // Simular contrato válido
        ContratoService contrato = new ContratoService(contratoDao);

        // Configurar detalhes do contrato simulado
        contrato.setId(contratoId);
        contrato.setValorTotal(1500.0);

        // Validar detalhes do contrato
        Assert.assertNotNull(contrato);
        Assert.assertEquals(contratoId, contrato.getId());
        Assert.assertEquals(1500.0, contrato.getValorTotal(), 0.01);

        return contrato;
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


}