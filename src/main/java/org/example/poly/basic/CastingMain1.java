package org.example.poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조. (=> 다형적 참조.)
        Parent poly = new Child();
//        poly.childMethod();       // 자식의 메서드는 호출할 수 없음.(컴파일 오류)

        // 다운캐스팅 (부모 타입 -> 자식 타입)
        Child child = (Child) poly;
        child.childMethod();
    }
}
