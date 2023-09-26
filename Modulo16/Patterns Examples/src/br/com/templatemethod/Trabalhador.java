package br.com.templatemethod;

public abstract class Trabalhador {
    public void executar(){
        iniciarRotina();
        levantar();
        irAoTrabalho();
        trabalhar();
        voltarCasa();
    }

    protected abstract void trabalhar();

    protected void voltarCasa(){
        System.out.println("Voltando para casa");
    }

    protected void irAoTrabalho(){
        System.out.println("Indo trabalhar");
    }

    public void iniciarRotina(){
        System.out.println("Iniciando Rotina");
    }

    public void levantar(){
        System.out.println("Levantando da cama");
    }
}
