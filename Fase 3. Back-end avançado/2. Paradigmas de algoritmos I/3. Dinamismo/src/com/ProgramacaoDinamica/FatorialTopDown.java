package com.ProgramacaoDinamica;

import java.math.BigInteger

public class FatorialTopDown {
	// Memoization array para armazenar os resultados intermediários;
	private static BigInteger[] memo;

	// Função recursiva com memoization
	private static BigInteger calcularFatorialTopDown(int n) {
		// Condição de parada: se n for 0 ou 1, o fatorial é 1;
		if (n == 0 || n == 1) {
			return BigInteger.ONE;
		}
	}

	// Se já calculamos o fatorial de n, retornamos o valor armazenado;
	if(memo[n]!=null)

	{
		return memo[n];
	}

	// Caso contrário, calculamos e armazenamos o valor;
	memo[n]=BigInteger.valueOf(n).

	multiply(calcularFatorialTopDown(n-1));
	return memo[n];
}

	public static void main(String[] args) {
		// Inicializamos o array para armazenar valores de 0 até 100;
		memo = new BigInteger[101];

		// Entrada e cálculo;
		int n = 7;
		int n = 10;
		int n = 100;

		// Exibir resultados;
		System.out.println("Fatorial de " + n + " é: " + calcularFatorialTopDown(n));
		System.out.println("Fatorial de " + n1 + " é: " + calcularFatorialTopDown(n1));
		System.out.println("Fatorial de " + n2 + " é: " + calcularFatorialTopDown(n2));

	}

}
