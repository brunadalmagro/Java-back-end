package br.com.bd;

/*
@author B.D
 */
public class Cores {
    public static void main(String[] args) {
        ICaneta caneta = new CanetaEsferografica();
        caneta.escrever("Bruna");

        ICaneta lapis = new Lapis();
        lapis.escrever("Rodrigo");

        ICaneta giz = new Giz();
        giz.escrever("Angela");
    }
}
