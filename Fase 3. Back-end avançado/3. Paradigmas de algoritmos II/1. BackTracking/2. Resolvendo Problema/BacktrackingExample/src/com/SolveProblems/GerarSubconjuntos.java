package com.SolveProblems;

import java.util.ArrayList;
import java.util.List;

public class GerarSubconjuntos {

    public static void main(String[] args) {
        // Cria lista, define o primeiro conjunto e tamanho do subconjunto.
        int[] S1 = {1, 2, 3};
        int n1 = 2;
        System.out.println(gerarSubconjuntos(S1, n1));

        // Define outro conjunto maior para teste
        int[] S2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n2 = 4;
        System.out.println(gerarSubconjuntos(S2, n2));

        // Define um conjunto com número maior de elementos
        int[] S3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int n3 = 3;
        System.out.println(gerarSubconjuntos(S3, n3));
    }

    private static List<List<Integer>> gerarSubconjuntos(int[] S, int n) {
        List<List<Integer>> sublistas = new ArrayList<>();
        if (n > S.length || n <= 0) {
            return sublistas;  // Retorna uma lista vazia se n for maior que o tamanho do conjunto ou menor/igual a 0
        }

        backtrack(S, n, 0, new ArrayList<>(), sublistas);
        return sublistas;
    }

    private static void backtrack(int[] S, int n, int inicio, List<Integer> sublistaAtual, List<List<Integer>> sublistas) {
        // Adiciona a sublista à lista de resultados se atingir o tamanho desejado
        if (sublistaAtual.size() == n) {
            sublistas.add(new ArrayList<>(sublistaAtual));
            return;
        }

        // Percorre os elementos do conjunto S a partir do índice 'inicio'
        for (int i = inicio; i < S.length; i++) {
            // Adiciona o elemento atual ao subconjunto atual
            sublistaAtual.add(S[i]);
            // Chama recursivamente para adicionar mais elementos
            backtrack(S, n, i + 1, sublistaAtual, sublistas);
            // Remove o último elemento para explorar outras possibilidades
            sublistaAtual.remove(sublistaAtual.size() - 1);
        }
    }
}
