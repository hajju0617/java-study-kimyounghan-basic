package org.example.extends1.ex2;

public class GasCar extends Car {
                    // extends를 --> 라 생각하면 됨. 즉, GasCar(자식)는 Car(부모)를 알고있음)
    public void fillUp() {
        System.out.println("기름을 주유함.");
    }
}
