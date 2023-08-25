package br.com.bd;

public class Programa {
    public static void main(String[] args) {
        Assalariado empregado = new Assalariado();
        empregado.setCpf("1");
        empregado.setNome("Ana");
        empregado.setSobrenome("Silva");
        empregado.setSalario(1000d);
        imprimir(empregado);


        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("1");
        comissionado.setNome("Bruno");
        comissionado.setSobrenome("Cigano");
        comissionado.setTotalVendas(100d);
        comissionado.setTotalComissao(01d);
        imprimir(comissionado);


        Horista horista = new Horista();
        horista.setCpf("3");
        horista.setNome("Lorena");
        horista.setSobrenome("Silva");
        horista.setPrecoHora(100d);
        horista.setHoraTrabalhada(80d);
        imprimir(horista);
    }
    public static void imprimir(Empregado empregado) {
        System.out.println(empregado.getNome() + " tem de salário: R$" + empregado.vencimento());
    }
}
