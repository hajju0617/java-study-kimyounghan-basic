package org.example.extends1.super1;

public class Child extends Parent {
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }
    public void call() {
        System.out.println("this.value = " + this.value);       // this는 생략가능.
        System.out.println("super.value = " + super.value);

        this.hello();       // this는 생략 가능.
        super.hello();

        // this는 현재 내 타입에서 찾고, super는 나의 부모 타입에서 찾음.
    }
}
