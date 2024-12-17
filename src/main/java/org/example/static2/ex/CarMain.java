package org.example.static2.ex;

public class CarMain {
    public static void main(String[] args) {
        Car ca1 = new Car("K3");
        Car.showTotalCars();
        Car ca2 = new Car("G80");
        Car.showTotalCars();
        Car ca3 = new Car("Model Y");
        Car.showTotalCars();
    }
}
