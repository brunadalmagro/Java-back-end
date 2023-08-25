package br.com.bd;

public class Assalariado extends Empregado{

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    private Double salario;

    @Override
    public Double vencimento() {
        return null;
    }

}
