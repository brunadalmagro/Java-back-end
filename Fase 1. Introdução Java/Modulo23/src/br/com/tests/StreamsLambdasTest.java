package br.com.tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsLambdasTest {

    @Test
    public void testApenasMulheres() {
        ArrayList<Pessoas> pessoas = new ArrayList<>();
        pessoas.add(new Pessoas("Bela Silva", "feminino"));
        pessoas.add(new Pessoas("Antônio Castro", "masculino"));
        pessoas.add(new Pessoas("Roger Roger", "masculino"));
        pessoas.add(new Pessoas("Amanda Antonina", "feminino"));
        pessoas.add(new Pessoas("Zenilda Moraes", "feminino"));
        pessoas.add(new Pessoas("Lucas Amaro", "masculino"));

        List<Pessoas> mulheres = pessoas.stream()
                .filter(pessoa -> "feminino".equals(pessoa.getSexo())) // Chame getSexo na instância da classe Pessoas
                .collect(Collectors.toList());

        Assertions.assertTrue(mulheres.stream().allMatch(p -> "feminino".equals(p.getSexo())));
        Assertions.assertEquals(3, mulheres.size()); // Certifique-se de que a lista contém 3 mulheres
    }
}

record Pessoas(String nomeCompleto, String sexo) implements Comparable<Pessoas> {

    // Obtém nome e sexo
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getSexo() {
        return sexo;
    }

    // Sobrescreve o método toString para formatar a saída ao imprimir uma Pessoa
    @Override
    public String toString() {
        return nomeCompleto + " - " + sexo;
    }

    // Implementa o método compareTo para permitir a ordenação de Pessoas
    @Override
    public int compareTo(Pessoas outraPessoa) {
        return nomeCompleto.compareTo(outraPessoa.getNomeCompleto());
    }
}
