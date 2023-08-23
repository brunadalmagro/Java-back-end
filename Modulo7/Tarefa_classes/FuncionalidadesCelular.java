package Tarefa_classes;
import Tarefa_classes.Celular;

public class FuncionalidadesCelular {
    public static void main(String[] args) {
        // Cria um objeto Celular
        Celular meuCelular = new Celular("MarcaX", "ModeloY", 5, 2022, "Preto", 64);

        System.out.println("Informações sobre o celular: ");
        System.out.println("Marca: " + meuCelular.getMarca());
        System.out.println("Modelo: " + meuCelular.getModelo());
        System.out.println("Tamanho de Tela: " + meuCelular.getTamanhoTela() + " polegadas");
        System.out.println("Ano de Fabricação: " + meuCelular.getAnoFabricacao());
        System.out.println("Cor: " + meuCelular.getCor());
        System.out.println("Armazenamento: " + meuCelular.getArmazenamento() + " GB");
    }
}

