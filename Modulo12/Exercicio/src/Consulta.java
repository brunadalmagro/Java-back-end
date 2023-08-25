public class Consulta {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();
        pf.setCpf(123d);
        pf.setNomeCompleto("Joana Dart");
        pf.setSituacao("190 pts");
        pf.setTipoCredito("Empréstimo pessoal");
        pf.setValorTotalDevido(12000d);
        pf.setUtilizacaoCredito(9000d);

        PessoaJuridica pj = new PessoaJuridica();
        pj.setCnpj(321d);
        pj.setNomeCompleto("Empresa Fictcia");
        pj.setSituacao("600 pts");
        pj.setTipoCredito("Crédito empresarial");
        pj.setValorTotalDevido(12000d);
        pj.setUtilizacaoCredito(1000d);

        // Imprime informações da Pessoa Jurídica e da Pessoa Física
        printPJ(pj);
        printPF(pf);
    }

    public static void printPJ(PessoaJuridica pessoa){
        System.out.println("********** Situação Serasa Score **********");
        System.out.println("Nome Completo: " + pessoa.getNomeCompleto());
        System.out.println("CNPJ: " + pessoa.getCnpj());
        System.out.println("Situação: " + pessoa.getSituacao());
        System.out.println("Tipo de Crédito: " + pessoa.getTipoCredito());
        System.out.println("Utilização de Crédito: " + pessoa.getUtilizacaoCredito());
        System.out.println("Valor Total Devido: " + pessoa.getValorTotalDevido()+"\n");
    }

    public static void printPF(PessoaFisica pessoa){
        System.out.println("********** Situação Serasa Score **********");
        System.out.println("Nome Completo: " + pessoa.getNomeCompleto());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("Situação: " + pessoa.getSituacao());
        System.out.println("Tipo de Crédito: " + pessoa.getTipoCredito());
        System.out.println("Utilização de Crédito: " + pessoa.getUtilizacaoCredito());
        System.out.println("Valor Total Devido: " + pessoa.getValorTotalDevido()+"\n");
    }
}

