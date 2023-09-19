package br.com.Patterns;

import static br.com.Patterns.Main.getFactory;

public class CarFactory {

    public static class SemContratosFactory extends Factory {
        @Override
        Car retrieveCar(String requestedGrade) {
            if ("A".equals(requestedGrade)) {
                return new Car(120, "interior-genérico", "prata", "item-genérico");
            } else {
                return null;
            }
        }
    }

    // Outros métodos e classes podem estar aqui...

    public static void main(String[] args) {
        Customer cliente = new Customer("A", false); // Troque para false para cliente sem contrato
        Factory factory = getFactory(cliente);
        Car car = factory.create(cliente.getGradeRequest());
        car.startEngine();
    }
}
