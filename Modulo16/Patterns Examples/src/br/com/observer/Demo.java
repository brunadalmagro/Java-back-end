package br.com.observer;

public class Demo {
    public static void main(String[] args) {
        Jornalista jnlst = new Jornalista();
        jnlst.add(new TV());
        jnlst.notifyAll("teste");
    }
}
