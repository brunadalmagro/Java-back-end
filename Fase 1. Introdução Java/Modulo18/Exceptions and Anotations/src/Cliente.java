import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;

@Tabela(nome = "produto")
public class Cliente extends Produto {

    public Cliente(String nome, double valor) {
        super(nome, valor); // Chama o construtor da superclasse Produto
    }

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        // Adiciona os produtos à lista
        produtos.add(new Cliente("Monitor Marca 1", 899.99));
        produtos.add(new Cliente("Processador Marca 2", 599.99));
        produtos.add(new Cliente("Placa de vídeo Marca 3", 2399.99));
        produtos.add(new Produto("Placa-Mãe Marca 4", 1050.00));
        produtos.add(new Produto("Hdd 2T Marca 5", 398.00));
        produtos.add(new Produto("SSD Marca 6", 448.00));

        double somarValores = 0.0;

        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome() + ", Valor: " + produto.getValor());
            somarValores += produto.getValor();
        }
        System.out.println("Agora seu PC Gamer está pronto e aguarda o pagamento!");
        System.out.println("Total a pagar: " + formatarDecimal(somarValores));
    }
    private static String formatarDecimal(double valor) {
        DecimalFormat df = new DecimalFormat("#0.00");
        return df.format(valor);
    }
}
