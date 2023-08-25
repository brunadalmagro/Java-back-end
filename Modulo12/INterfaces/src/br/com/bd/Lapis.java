package br.com.bd;

public class Lapis implements ICaneta{
    @Override
    public void escrever(String texto) {
        System.out.println("Olá usuário " + texto + ", seu lápis é de cor " + getCor());
    }

    @Override
    public String getCor() {
        return "preto";
    }
}
