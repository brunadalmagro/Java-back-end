/**
 * Classe que representa um Celular.
 * Um celular é um dispositivo eletrônico que tem uma marca, modelo, tamanho de tela, capacidade de armazenamento e pode ser ligado ou desligado.
 */

package Tarefa_classes;

public class Celular {
    private String marca;
    private String modelo;
    private int tamanhoTela;
    private int anoFabricacao;
    private String cor;
    private int armazenamento;

    public Celular(String marca, String modelo, int tamanhoTela, int anoFabricacao, String cor, int armazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoTela = tamanhoTela;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.armazenamento = armazenamento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(int tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }
}



