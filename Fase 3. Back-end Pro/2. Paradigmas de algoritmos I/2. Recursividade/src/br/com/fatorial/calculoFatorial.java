package br.com.fatorial;

public class calculoFatorial {
	private static long calcularFatorial(long n) {
		// Para chegar ao cálculo o fatorial de 100, precisamos usar 'BigInteger;
		// Condição de parada: se n for 0 ou 1, retorna 1;
		// (Operador lógico 'ou' em java: '||');
		
		if (n == 0 || n == 1){
			return 1;
		}
	
	// Chamada recursiva: n * fatorial de (n - 1);
	return n * calcularFatorial(n - 1);
	}

	public static void main(String[] args) {
	// Ao declarar a variável 'n' atribuímos a ela o valor 7;
		long n = 7;
		long n1 = 10;
		long n2 = 100;
		
	// Chamamos a função recursiva e passamos as variáveis como argumento;
		long resultadoN = calcularFatorial(n);
		long resultadoN1 = calcularFatorial(n1);
		long resultadoN2 = calcularFatorial(n2);
		
	// Exibir resultado
		System.out.println("Fatorial de " + n + " é: " + resultadoN);
		System.out.println("Fatorial de " + n1 + " é: " + resultadoN1);
		System.out.println("Fatorial de " + n2 + " é: " + resultadoN2);
	}
}

