/**
 * A classe Calculadora fornece métodos para realizar operações básicas de
 * aritmética: adição, subtração, multiplicação e divisão.
 */

public class Calculadora {

    /**
     * As variáveis adicionam dois números inteiros.
     * @param a o primeiro número
     * @param b o segundo número
     * @return o valor calculado de a e b
     */

    public static int adicionar(int a, int b){
        return a + b;
    }

    public static int subtrair(int a, int b){
        return a - b;
    }

    public static int multiplicar(int a, int b){
        return a * b;
    }

    public static double dividir(double a, double b){
        return a / b;
    }

    // Método main para testes básicos
    public static void main(String[] args) {
        // Cria uma nova instância da calculadora
        Calculadora calculadora = new Calculadora();

        // Armazenando o resultado e o valor esperado da divisao em decimal
        double resultado = dividir(23, 18);
        double valorEsperado = 1.277777778; // Valor esperado para comparação


        // Testes para cada operação, exibindo o resultado e a validação
        // Teste de adição  
        System.out.println("Testes de Adição:\n");
        System.out.println("2 + 3: " + (Calculadora.adicionar(2, 3) == 5));
        System.out.println("20 + 32: " + (Calculadora.adicionar(20, 32) == 52));
        System.out.println("845 + 9489: " + (Calculadora.adicionar(845, 9489) == 10334));
        System.out.println("===================================================================");

        // Teste de subtração
        System.out.println("Testes de Subtração:\n");
        System.out.println("2 - 3: " + (Calculadora.subtrair(2, 3) == -1));
        System.out.println("23 - 18: " + (Calculadora.subtrair(23, 18) == 5));
        System.out.println("===================================================================");

        // Teste de multiplicação
        System.out.println("Testes de Multiplicação:\n");
        System.out.println("2 * 3: " + (Calculadora.multiplicar(2, 3) == 6));
        System.out.println("21 * 31: " + (Calculadora.multiplicar(21, 31) == 651));
        System.out.println("===================================================================");

        // Teste de divisão
        System.out.println("Testes de Divisão:\n");
        System.out.println("8 / 4: " + (Calculadora.dividir(8, 4) == 2));
        System.out.printf("23 / 18: %.9f\n %b%n", resultado, Math.abs(resultado - valorEsperado) < 0.0001);
        System.out.println("===================================================================");

}

    }