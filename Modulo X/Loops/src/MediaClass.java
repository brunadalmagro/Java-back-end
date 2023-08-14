import java.util.Scanner; // importando o método Scanner para leitura das notas

public class MediaClass{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A media é: " + media);

        if (media >=7){
            System.out.println("Aluno = Aprovado");
        } else if(media >=5.0 && media <=6.9){
            System.out.println("Aluno = Recuperação");
        } else {
            System.out.println("Aluno = Reprovado");
        }
    }
}