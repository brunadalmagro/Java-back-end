package com.backtracking;


// Dado um tabuleiro de tamanho NxN, devemos colocar N rainhas no tabuleiro de forma  que nenhuma delas se ataque
// Exemplo para N = 4:
/*
 0 1 0 0
 0 0 0 1
 1 0 0 0
 0 0 1 0
 --> diagonais:  (x = 0, y = 1)
 esquerda - soma l + col && == x + y
 direito - sub l - col && == x - y
 */

public class NRainhas {
    private static boolean temAtaque(int x, int y, int[][] tab) {
        // Checando linhas e colunas
        for (int j = 0; j < tab.length; j++) {
            if (tab[x][j] == 1 || tab[j][y] == 1) {
                return true;
            }
        }

        for (int i = 0; i < tab.length; i++) {
            if (tab[x][i] == 1 || tab[i][y] == 1) {
                return true;
            }
        }

        // Checar as diagonais
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                int indEsq = i + j;
                int indDir = i - j;

                if (indEsq == (x + y) || indDir == (x - y)) {
                    if (tab[i][j] == 1) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static void imprimeTabuleiro(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                System.out.print(tab[i][j] + " ");
            }

            System.out.println();
        }
    }

    private static boolean resolveNRainhas(int[][] tab, int n) {
        // Checar se todas as rainhas foram colocadas
        // O que basicamente verifica se N = 0
        if (n == 0) {
            return true;
        }

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++)
                if (!temAtaque(i, j, tab)) {
                    // Colocando a rainha no tabuleiro
                    tab[i][j] = 1;

                    if (resolveNRainhas(tab, n - 1)) {
                        return true;
                    }

                    // Solução não  foi encontrada, desfazendo ultima mudança
                    tab[i][j] = 0;
                }
            }
        

        return false;
    }


    public static void main(String[] args) {
        int[][] tab = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
        };

        int n = 4;

        boolean resultado = resolveNRainhas(tab, n);

        if (resultado) {
            imprimeTabuleiro(tab);
        } else {
            System.out.println("Não consegui encontrar uma solução");
        }
    }
}
