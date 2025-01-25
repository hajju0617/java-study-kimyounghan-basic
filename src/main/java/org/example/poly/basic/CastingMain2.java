package org.example.poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조. (=> 다형적 참조.)
        Parent poly = new Child();
//        poly.childMethod();       // 자식의 메서드는 호출할 수 없음.(컴파일 오류)

        // 다운캐스팅 (부모 타입 -> 자식 타입)
        Child child = (Child) poly;
        child.childMethod();
        System.out.println("--------------------");

        // 일시적 다운 캐스팅 : 해당 메서드를 호출하는 순간만 다운캐스팅.
//        (Child) poly.childMethod();   // 연산자 우선순위로 인해 poly.childMethod() 먼저 실행되므로 컴파일 오류.
        ((Child) poly).childMethod();   // 캐스팅을 ()로 감싸주면 됨.
    }
}
