package br.com.Patterns;

public abstract class Factory {

    public Car create(String gradeRequest) {
        Car car = retrieveCar(gradeRequest);
        if (car != null) {
            prepareCar(car);
        }
        return car;
    }

    private void prepareCar(Car car) {
        car.clean();
        car.mechanicCheck();
    }

    abstract Car retrieveCar(String requestedGrade);
}

