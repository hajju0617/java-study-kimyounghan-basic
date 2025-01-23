package org.example.extends1.ex2;

public class ElectricCar extends Car{
                         // --> (ElectricCar는 Car를 알고 있음)
    public void charge() {
        System.out.println("충전함.");
    }
}
