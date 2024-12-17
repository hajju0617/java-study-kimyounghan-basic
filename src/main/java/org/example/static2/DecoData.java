package org.example.static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        staticValue++;  // 클래스 변수(정적 변수)
        staticMethod(); // 클래스 메서드(정적 메서드)

//        instanceValue++;    // 인스턴스 변수 접근 불가(컴파일 에러.)
//        instanceMethod();    // 인스턴스 메서드 접근 불가(컴파일 에러.)
    }
    public void instanceCall() {
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }

}
