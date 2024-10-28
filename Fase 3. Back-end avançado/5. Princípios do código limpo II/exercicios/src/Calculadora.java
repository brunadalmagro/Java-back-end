
public class Calculadora {
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

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Armazenando o resultado e o valor esperado
        double resultado = dividir(23, 18);
        double valorEsperado = 1.277777778; // Valor esperado para comparação


        // Teste adição
        System.out.println( "Testes de Adição: \n");

        System.out.println("2 + 3: 5\n" + (Calculadora.adicionar(2, 3 )  == 5));
        System.out.println( " ");

        System.out.println("20 + 32: 42\n" + (Calculadora.adicionar(20, 32) == 52));
        System.out.println( " ");

        System.out.println("845 + 9489: 10334\n" + (Calculadora.adicionar(845, 9489) == 10334));
        System.out.println( "===================================================================");
        System.out.println( " ");


        // Teste subtração
        System.out.println( "Testes de Subtração: \n");

        System.out.println("2 - 3: -1\n" + (Calculadora.subtrair(2, 3) == -1));
        System.out.println( " ");

        System.out.println("23 - 18: 5\n" + (Calculadora.subtrair(23, 18) == 5));
        System.out.println( "===================================================================");
        System.out.println( " ");

        // Teste multiplicação
        System.out.println( "Testes de Multiplicação: \n");

        System.out.println("2 * 3: 6\n" + (Calculadora.multiplicar(2, 3) == 6));
        System.out.println( " ");

        System.out.println("21 * 31: 651\n" + (Calculadora.multiplicar(21, 31) == 651));
        System.out.println( "===================================================================");
        System.out.println( " ");

        // Testes divisão
        System.out.println( "Testes de Divisão: \n");

        System.out.println("8 / 4: 2\n" + (Calculadora.dividir(8, 4) == 2));
        System.out.println( " ");

        //  Resolvendo expressões decimais
        System.out.printf("23 / 18: %.9f\n%b%n", resultado, Math.abs(resultado - valorEsperado) < 0.0001);
        System.out.println( "===================================================================");
        System.out.println( " ");

}

    }