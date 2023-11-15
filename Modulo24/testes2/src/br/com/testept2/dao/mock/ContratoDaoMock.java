package br.com.testept2.dao.mock;

import br.com.testept2.dao.IContratoDao;

public class ContratoDaoMock implements IContratoDao {
        private int id;
        private double valorTotal;
        public int getId(){
            return id;
        }

    @Override
    public void salvar() {
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
