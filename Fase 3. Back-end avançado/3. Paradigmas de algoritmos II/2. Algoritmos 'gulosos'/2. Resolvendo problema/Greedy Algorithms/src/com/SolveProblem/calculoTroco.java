package com.SolveProblem;

/*
Para este sistema, precisamos devolver a quantia em troco com o menor número de moedas possível.
Exemplo:
Entrada: $18
Moedas dísponíveis $5, $2, $1
A saída deve ser 3 moedas de $5, 1 de $2 e 1 de $1.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class calculoTroco {
    // Interface para definir as moedas
    public interface Moedas {
        // Variável retorna moedas disponíveis
        int[] getMoedasDisponiveis();
    }

    // Implementação da interface moedas
    private static class newMoedas implements Moedas {

        @Override
        // Cria um array de inteiros chamado moedas com três elementos: 5, 2 e 1.
        public int[] getMoedasDisponiveis() {
            return new int[] // cria um novo array de inteiros
                    {5,2,1}; // elementos do array
        }
    }

    // Metodo para calcular o troco com o menor número de moedas possível
    public static List<Integer> getContadorMinimo(int valor, final Moedas moedas){
        List<Integer> resultado = new ArrayList<>();
        int[] moedasDisponiveis = moedas.getMoedasDisponiveis();

        // Ordena as moedas em ordem decrescente para utilizar as maiores primeiro
        Arrays.sort(moedasDisponiveis);
        // Inicia o loop com i igual ao índice do último elemento do array moedasDisponiveis
        // Condição (i >= 0): O loop continua enquanto i for maior ou igual a 0
        // Decremento (i--):A cada iteração do loop, i é decrementado em 1 (i--), movendo-se para o próximo elemento à esquerda no array.
        //Essa é a forma de percorrer o array em ordem decrescente.
        for(int i = moedasDisponiveis.length - 1; i >= 0; i--){
            while (valor >= moedasDisponiveis[i]){
                valor -= moedasDisponiveis[i];
                resultado.add(moedasDisponiveis[i]);
            }
        }

        return resultado;
    }

    public static class MoedasDisponiveis implements Moedas{

        @Override
        public int[] getMoedasDisponiveis() {
            return new int[] {5,2,1};
        }
    }

    public static void main(String[] args) {
        int valor = 18;
        Moedas moedas = new MoedasDisponiveis(); // Cria instancia  de MoedasDisponíveis

        List<Integer> resultado = getContadorMinimo(valor, moedas);

        System.out.println(resultado); // Vai imprimir a quantidade otimizada do troco que busca menor quantidade de moedas
        //  [ 5, 5, 5, 2, 1, ]
    }
}