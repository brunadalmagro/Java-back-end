package com.testes;


import static org.junit.jupiter.api.Assertions.assertEquals;

import com.Fibonacci.Fibonacci;

public class TestFibonacci {

    public static void main(String[] args) {
        // Testando o cálculo do número de Fibonacci para diferentes valores
        int[] numerosParaTestar = {5, 10, 15}; // Valores para teste

        for (int n : numerosParaTestar) {
            int resultado = Fibonacci.encontrarElementoPD(n);
            System.out.println("Fibonacci de " + n + " é: " + resultado);
        }
    }
}