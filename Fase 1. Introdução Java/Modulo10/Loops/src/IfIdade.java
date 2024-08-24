import java.util.Scanner;

public class IfIdade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();
        String IdadeSt = getIdade(idade);
        System.out.println(IdadeSt);
    }

    public static String getIdade(int Idade) {
        if (Idade <= 10) {
            return "u`re a little baby";
        }
        else if (Idade >10 && Idade <=18) {
            return "Apreciate this beautiful step. <3";
        } else {
            return "Go! Fly! Life is a journey ";
        }
    }
}
