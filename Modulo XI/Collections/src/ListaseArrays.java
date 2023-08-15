import java.util.ArrayList;
import java.util.Collections;

public class ListaseArrays
{
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>(); // Array list para armazenar objetos do tipo pessoa

        pessoas.add(new Pessoa("Bela Silva", "feminino"));
        pessoas.add(new Pessoa("Antônio Castro", "masculino"));
        pessoas.add(new Pessoa("Roger Roger", "masculino"));

        Collections.sort(pessoas); // Ordena a lista de pessoas em ordem alfabética

        // Imprime o cabeçalho
        System.out.println("Pessoas ordenadas em ordem alfabética:");

        // Itera sobre a lista de pessoas e imprime
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}
// Definição da classe Pessoa usando 'record' (introduzido no Java 16)
record Pessoa(String nomeCompleto, String sexo) implements Comparable<Pessoa> {

    //Obtem nome comlpeto
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    // Sobrescreve o método toString para formatar a saída ao imprimir uma Pessoa
    @Override
    public String toString() {
        return nomeCompleto + " - " + sexo;
    }

    // Implementa o método compareTo para permitir a ordenação de Pessoas
    @Override
    public int compareTo(Pessoa outraPessoa) {
        return nomeCompleto.compareTo(outraPessoa.getNomeCompleto());
    }
}
