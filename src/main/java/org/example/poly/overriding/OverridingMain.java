package org.example.poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        // 자식 변수가 자식 인스턴스 참조.
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("child.value = " + child.value);
        child.method();
        System.out.println("------------------");

        // 부모 변수가 부모 인스턴스 참조.
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("parent.value = " + parent.value);
        parent.method();
        System.out.println("------------------");

        // 부모 변수가 자식 인스턴스 참조. (다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        // 변수는 오버라이딩이 안되고, 메서드는 오버라이딩이 됨.
        System.out.println("poly.value = " + poly.value);
        poly.method();
    }
}
