import java.util.Scanner;

public class ProgramaAcordar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos descrever o seu passo a passo para acordar.");

        System.out.print("O que você faz primeiro ao acordar? ");
        String primeiroPasso = scanner.nextLine();

        System.out.print("E depois, o que você faz? ");
        String segundoPasso = scanner.nextLine();

        System.out.print("E o terceiro passo é? ");
        String terceiroPasso = scanner.nextLine();

        System.out.println("\nEssas são suas práticas ao acordar:");
        System.out.println("1. " + primeiroPasso);
        System.out.println("2. " + segundoPasso);
        System.out.println("3. " + terceiroPasso);

        scanner.close();
    }
}

