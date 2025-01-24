package org.example.extends1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        super(10, 20);      // 부모가 기본 생성자가 없을 경우 직접 super()를 지정해야됨.
        System.out.println("ClassC 생성자 호출.");
    }
}
