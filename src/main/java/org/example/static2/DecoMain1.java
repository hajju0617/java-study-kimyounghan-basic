package org.example.static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil1 utils = new DecoUtil1();  // 객체 생성 후 사용.
        String deco = utils.deco(s);        // 인스턴스 메서드.

        System.out.println("before : " + s);
        System.out.println("after : " + deco);
    }
}