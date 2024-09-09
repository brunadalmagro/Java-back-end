package com.FatorialBottomUp;

import java.math.BigInteger;
import java.text.DecimalFormat;

public class BottomUp {

    // Função iterativa para calcular o fatorial usando a abordagem Bottom-Up
    private static BigInteger calcularFatorialBottomUp(int n) {
        // Inicializar o resultado como 1 (equivalente ao fatorial de 0 ou 1)
        BigInteger resultado = BigInteger.ONE;

        // Iterar de 2 até n, multiplicando cada valor no resultado
        for (int i = 2; i <= n; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }

        return resultado;
    }

    // Função para formatar o resultado do fatorial
    private static String formatarResultadoFatorial(BigInteger resultado) {
        // Definir o número máximo de dígitos antes de usar notação científica
        int DIGITOS_MAXIMOS = 10;

        // Verificar se o número excede o limite de dígitos
        if (resultado.toString().length() > DIGITOS_MAXIMOS) {
            double valorDouble = resultado.doubleValue();
            DecimalFormat formatador = new DecimalFormat("0.##E0");
            return formatador.format(valorDouble);
        } else {
            return resultado.toString();
        }
    }

    public static void main(String[] args) {
        // Entrada e cálculo
        int n = 7;
        int n1 = 10;
        int n2 = 100;

        // Calcular o fatorial de cada número
        BigInteger resultadoN = calcularFatorialBottomUp(n);
        BigInteger resultadoN1 = calcularFatorialBottomUp(n1);
        BigInteger resultadoN2 = calcularFatorialBottomUp(n2);

        // Exibir resultados formatados
        System.out.println("Fatorial de " + n + " é: " + formatarResultadoFatorial(resultadoN));
        System.out.println("Fatorial de " + n1 + " é: " + formatarResultadoFatorial(resultadoN1));
        System.out.println("Fatorial de " + n2 + " é: " + formatarResultadoFatorial(resultadoN2));

        // Exibir a versão completa em decimal do fatorial de 100
        System.out.println("Fatorial de " + n2 + " em decimal: " + resultadoN2);
    }
}
