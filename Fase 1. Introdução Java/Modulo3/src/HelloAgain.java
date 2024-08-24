import java.util.Scanner;

public class HelloAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, como você se chama? ");

        String inputString = scanner.nextLine();

        scanner.close();

        System.out.println("Prazer em conhece-l@ " + inputString);
    }
}
