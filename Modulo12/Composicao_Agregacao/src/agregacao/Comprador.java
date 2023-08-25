package agregacao;

public class Comprador {
    public Double getVenda() {
        return venda;
    }

    public void setVenda(Double venda) {
        this.venda = venda;
    }

    private Double venda;

    public void comprar() {

    }

    public void vendido() {
        System.out.println("Vendido");
    }
}
