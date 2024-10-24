package org.example.oop1;

public class ValueObject {
    // 데이터와 기능이 한 곳에 뭉쳐있음. (속성과 기능이) -> 객체지향프로그래밍
    int value;

    void add() {
        value++;
        System.out.println("숫자 증가 value = " + value);
    }
    // 원래 메서드는 객체를 생성해야 호출할 수 있음.
    // 근데 static을 붙이면 객체를 생성하지 않고 호출할 수 있음.
}
