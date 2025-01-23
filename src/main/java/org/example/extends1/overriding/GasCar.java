package org.example.extends1.overriding;

import org.example.extends1.ex3.Car;

public class GasCar extends Car {
                    // --> (GasCar는 Car를 알고있음)
    public void fillUp() {
        System.out.println("기름을 주유함.");
    }
}
