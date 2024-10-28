package com.Fibonacci;

public class Fibonacci {
    // Criamos um array para simplificar a computação
    private static final int MAX_ELEMENTOS = 100;
    private static final int[] elementosFib = new int[MAX_ELEMENTOS];

    public static int encontrarElementoPD(int n) {
        for (int i = 0; i < MAX_ELEMENTOS;
             i++) {
            elementosFib[i] = -1;
        }

        return encontrarElemento(n);
    }

    public static int encontrarElemento(int n) {
        if (elementosFib[n] == -1) {
            if (n <= 1) {
                elementosFib[n] = n;
            } else {

                // 2 = elemento na posiçao 1 + elemento na posicao 0
                // 2 = encontrarElemento(1) + encontarElemento(0)
                // 3 = elemento na posiçao 2 = elemento na posicao 1
                // 3 = encontrarElemento(2) + encontrarElemento(1)
                elementosFib[n] = encontrarElemento(n - 1) + encontrarElemento(n - 2);
            }
        }

        return elementosFib[n];
    }


    public static void main(String[] args) {
        int n = 15;

        System.out.println("elemento " + n + ": " + encontrarElementoPD(n));
    }
}
