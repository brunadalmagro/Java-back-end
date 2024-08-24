package br.com.observer;

public class TV implements Observer{

    @Override
    public void update(Subject subject) {
        System.out.println("Noticia via TV" + subject.ToString());
    }
}
