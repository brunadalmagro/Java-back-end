package br.com.bd;

import br.com.bd.Interfaces.CanetaEsferografica;
import br.com.bd.Interfaces.Giz;
import br.com.bd.Interfaces.ICaneta;
import br.com.bd.Interfaces.Lapis;

import java.util.List;

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
