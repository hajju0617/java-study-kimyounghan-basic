package org.example.poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출!");
        call(parent1);
        System.out.println("--------------");
        Parent parent2 = new Child();
        System.out.println("parent2 호출!");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        // Child 인스턴스인 경우 childMethod() 실행.
        // JDK 16부터 instanceof 에서 변수 선언을 할 수 있음.
        if (parent instanceof Child child) {
            System.out.println("Child 인스턴스가 맞음.");
//            Child child = (Child) parent;
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스가 아님.");
        }
    }
}
