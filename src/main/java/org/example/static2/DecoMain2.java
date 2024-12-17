package org.example.static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s);    // 객체 생성없이 바로 사용.
                                            // static 메서드(정적 메서드)

        System.out.println("before : " + s);
        System.out.println("after : " + deco);
    }
}