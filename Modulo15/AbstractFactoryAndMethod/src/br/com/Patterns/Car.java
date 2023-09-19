package br.com.Patterns;

public class Car {
    private int motor;
    private String interior;
    private String color;
    private String itemSegurancaDoCarro;

    public Car(int motor, String interior, String color, String itemSegurancaDoCarro) {
        this.motor = motor;
        this.interior = interior;
        this.color = color;
        this.itemSegurancaDoCarro = itemSegurancaDoCarro;
    }

    public void startEngine() {
        System.out.println(getClass().getSimpleName());
        System.out.println(motor + " cv.");
        System.out.println(interior + " Ar-condicionado, sistema inteligente, air-bag");
    }

    public void mechanicCheck() {
        System.out.println("Engenharia completa! " + itemSegurancaDoCarro + " Freio ABS, cinto de segurança, travas.");
    }

    public void clean() {
        System.out.println("Cor do carro: " + color.toLowerCase() );
    }
}