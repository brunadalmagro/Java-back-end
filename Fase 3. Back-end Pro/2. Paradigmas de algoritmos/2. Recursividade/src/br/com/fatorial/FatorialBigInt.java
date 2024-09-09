package br.com.fatorial;

import java.math.BigInteger;

public class FatorialBigInt {

    // Função recursiva para calcular o fatorial de um número usando BigInteger
    private static BigInteger fatorialBigInt(BigInteger n) {
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        return n.multiply(fatorialBigInt(n.subtract(BigInteger.ONE)));
    }

    // Função para formatar o resultado do fatorial em notação de potência de 10
    private static String formatarResultadoFatorial(BigInteger resultado) {
        // Convertendo o resultado para uma string
        String resultadoStr = resultado.toString();
        int tamanho = resultadoStr.length();
        
        // Definir o número máximo de dígitos antes de usar notação científica
        int DIGITOS_MAXIMOS = 15;

        if (tamanho > DIGITOS_MAXIMOS) {
            // Notação científica manual em formato 10^expoente
            int expoente = tamanho - 1;
            return "10^" + expoente + "\nEm formatação decimal é: " + resultado.toString();
        } else {
            return resultadoStr;
        }
    }

    public static void main(String[] args) {
        BigInteger n = BigInteger.valueOf(100);

        // Calcular o fatorial de 'n'
        BigInteger resultadoN = fatorialBigInt(n);

        // Formatando o resultado
        String resultadoFormatadoN = formatarResultadoFatorial(resultadoN);

        // Exibir o resultado
        System.out.println("O fatorial de " + n + " é: " + resultadoFormatadoN);
    }
}
