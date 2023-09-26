package br.com.observer;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Jornalista implements Subject{
    public List<Observer> observers = new ArrayList<>();

    private String titulo;

    @Override
    public void add(Observer observer) {

    }

    @Override
    public void remove(Observer observer) {

    }

    @Override
    public void notifyAll(String titulo) {
        this.titulo = titulo;
        for (Observer ob : this.observers) {
            ob.update(this);
        }
    }


}
