package org.example.pack;

import org.example.pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        org.example.pack.b.User userB = new org.example.pack.b.User();
        // 다른 패키지, 같은 이름의 클래스가 있다면 둘 중 하나만 import 가능.
    }
}
