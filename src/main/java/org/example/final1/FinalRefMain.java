package org.example.final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
//        data = new Data();    // final이므로 변경 불가 (컴파일 오류)

        // 객체의 속성값은 변경 가능.
        data.value = 10;
        System.out.println("data.value = " + data.value);
        data.value = 20;
        System.out.println("data.value = " + data.value);
    }
}
