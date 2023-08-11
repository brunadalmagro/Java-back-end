import java.sql.SQLOutput;
import java.util.Scanner;

public class TabuadaDoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Deseja gerar a tabuada de algum número? sim/não");
        String resposta = s.next();

        while (resposta.equals("Sim/S")) ;
        System.out.println("Digite um número para gerar a tabuada: ");
        int num = s.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + num + " = " + num * 1);
        }

        System.out.println("Deseja gerar a tabuada de outro número? sim/não ");
        resposta = s.next();

        System.out.println("obrigada, volte sempre");
    }
}