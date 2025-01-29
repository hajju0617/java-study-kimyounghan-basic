package org.example.poly.car1;

public class Driver {
    private Car car;

    public void setCar(Car car) {
        System.out.println("자동차를 설정함 : " + car);
        this.car = car;
    }

    public void drive() {
        System.out.println("운전자가 자동차를 운전함.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
