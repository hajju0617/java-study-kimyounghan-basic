package org.example.poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조.
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();
        System.out.println("------------------");

        // 자식 변수가 자식 인스턴스 참조.
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();
        System.out.println("------------------");

        System.out.println("Grandson -> Grandson");
        Grandson grandson = new Grandson();
        grandson.grandsonMethod();
        System.out.println("------------------");

        // 부모 변수가 자식 인스턴스 참조 (=> 다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();
//        poly.childMethod();       // 부모 변수로 자식 메서드 호출 불가능.
        System.out.println("------------------");

        // 자식 변수로 부모 인스턴스를 참조할 수 없음. (컴파일 오류.)
//        Child child1 = new Parent();

        System.out.println("Parent -> Grandson");
        Parent poly2 = new Grandson();
        poly2.parentMethod();
        System.out.println("------------------");

        System.out.println("Child -> Grandson");
        Child poly3 = new Grandson();
        poly3.parentMethod();
        poly3.childMethod();
        System.out.println("------------------");
    }
}
