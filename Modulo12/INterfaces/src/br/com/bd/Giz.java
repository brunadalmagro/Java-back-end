package br.com.bd;

public class Giz implements ICaneta{
    @Override
    public void escrever(String texto) {
        System.out.println("Olá usuário " + texto + ", seu giz é de cor " + getCor());
    }

    @Override
    public String getCor() {
        return "branco";
    }
}
