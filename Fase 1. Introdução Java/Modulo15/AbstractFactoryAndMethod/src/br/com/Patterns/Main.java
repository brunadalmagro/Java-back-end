package br.com.Patterns;

public class Main {
    public static void main(String[] args) {
        Customer cliente = new Customer("A", true); // Troque para false para cliente sem contrato
        Factory factory = getFactory(cliente);
        Car car = factory.create(cliente.getGradeRequest());
        car.startEngine();
    }

    static Factory getFactory(Customer cliente) {
        System.out.println("*****************************************");
        if (cliente.hasCompanyContract()) {
            return new CorollaFactory(); // Troque para CivicFactory se desejar criar um Civic
        } else {
            return new CarFactory.SemContratosFactory(); // Fábrica genérica
        }
    }
}

class CorollaFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new CarCorolla(150, "gasoline", "blue");
        } else {
            return null;
        }
    }
}

class CivicFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        System.out.println("*****************************************");
        if ("B".equals(requestedGrade)) {
            return new CivicCar(140, "gasoline", "red");
        } else {
            return null;
        }
    }
}

