package org.example.poly.ex4;

public class Cow extends AbstractAnimal {

    @Override
    public void sound() {
        System.out.println("음메");
    }

    @Override
    public void move() {
        System.out.println("소가 이동함.");
    }
}
