package org.example.final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1;    // final 지역 변수 선언.
        data1 = 10;         // 최초에 딱 한번만 할당 가능
//        data1 = 20;       // 컴파일 오류 발생.

        final int data2 = 10;
//        data2 = 20;
        method(10);
    }

    static void method(final int parameter) {
//        parameter = 20;       // 컴파일 오류 발생.
    }
}
