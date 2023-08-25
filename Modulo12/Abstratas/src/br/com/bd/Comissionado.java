package br.com.bd;

public class Comissionado extends Empregado{

    private Double totalVendas;

    public Double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(Double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public Double getTotalComissao() {
        return totalComissao;
    }

    public void setTotalComissao(Double totalComissao) {
        this.totalComissao = totalComissao;
    }

    private Double totalComissao;

    @Override
    public Double vencimento() {
        return totalComissao*totalVendas;
    }
}
