import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsLambdas {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Bela Silva", "feminino"));
        pessoas.add(new Pessoa("Antônio Castro", "masculino"));
        pessoas.add(new Pessoa("Roger Roger", "masculino"));
        pessoas.add(new Pessoa("Amanda Antonina ", "feminino"));
        pessoas.add(new Pessoa("Zenilda Moraes", "feminino"));
        pessoas.add(new Pessoa("Lucas Amaro", "masculino"));

        System.out.println("Pessoas ordenadas em ordem alfabética:");
        pessoas.forEach(pessoa -> System.out.println(pessoa));

        // Stream para separar apenas as mulheres
        List<Pessoa> mulheres = pessoas.stream()
                .filter(pessoa -> "feminino".equals(pessoa.getSexo()))
                .collect(Collectors.toList());

        System.out.println("\nMulheres na lista:");
        mulheres.forEach(mulher -> System.out.println(mulher.getNomeCompleto()));
    }
}
    record Pessoa(String nomeCompleto, String sexo) implements Comparable<Pessoa> {

        // Obtém nome e sexo
        public String getNomeCompleto() {
            return nomeCompleto;
        }
        public String getSexo() {
            return sexo;
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

