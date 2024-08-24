import java.util.ArrayList;
import java.util.List;

public class ListaCarros {
    public static void main(String[] args) {
        List<Carro> listaDeCarros = new ArrayList<>();

        listaDeCarros.add(new Honda("Accord"));
        listaDeCarros.add(new Honda.Civic());
        listaDeCarros.add(new Honda("CR-CV"));

        for (Carro carro : listaDeCarros) {
            System.out.println(carro);
        }
    }
}