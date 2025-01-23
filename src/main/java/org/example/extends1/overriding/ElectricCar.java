package org.example.extends1.overriding;

import org.example.extends1.ex3.Car;

public class ElectricCar extends Car {
                         // --> (ElectricCar는 Car를 알고 있음)
    public void charge() {
        System.out.println("충전함.");
    }

    @Override
    public void move() {
        System.out.println("전기차가 빠르게 이동함.");
    }
}
