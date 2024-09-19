package br.com.FatorialTopDown;

import java.math.BigInteger;
import java.text.DecimalFormat;

public class FatorialTopDown {
    // Memoization array para armazenar os resultados intermediários
    private static BigInteger[] memo;

    // Função recursiva com memoization
    private static BigInteger calcularFatorialTopDown(int n) {
        // Condição de parada: se n for 0 ou 1, o fatorial é 1
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }

        // Se já calculamos o fatorial de n, retornamos o valor armazenado
        if (memo[n] != null) {
            return memo[n];
        }

        // Caso contrário, calculamos e armazenamos o valor
        memo[n] = BigInteger.valueOf(n).multiply(calcularFatorialTopDown(n - 1));
        return memo[n];
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
        // Inicializamos o array para armazenar valores de 0 até 100
        memo = new BigInteger[101];

        // Entrada e cálculo
        int n = 7;
        int n1 = 10;
        int n2 = 100;

        // Calcular o fatorial de cada número
        BigInteger resultadoN = calcularFatorialTopDown(n);
        BigInteger resultadoN1 = calcularFatorialTopDown(n1);
        BigInteger resultadoN2 = calcularFatorialTopDown(n2);

        // Resultados
        System.out.println("Fatorial de " + n + " é: " + formatarResultadoFatorial(resultadoN));
        System.out.println("Fatorial de " + n1 + " é: " + formatarResultadoFatorial(resultadoN1));
        System.out.println("Fatorial de " + n2 + " é: " + formatarResultadoFatorial(resultadoN2));

        // Exibir a versão completa em decimal do fatorial de 100
        System.out.println("Fatorial de " + n2 + " em decimal: " + resultadoN2);
    }
}
