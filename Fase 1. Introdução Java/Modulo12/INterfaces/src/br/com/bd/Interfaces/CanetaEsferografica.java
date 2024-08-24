package br.com.bd.Interfaces;

public class CanetaEsferografica implements ICaneta{
    @Override
    public void escrever(String texto) {
        System.out.println("Olá usuário " + texto + ", sua caneta esferografica é de cor " + getCor());
    }

    @Override
    public String getCor() {
        return "azul";
    }
}
