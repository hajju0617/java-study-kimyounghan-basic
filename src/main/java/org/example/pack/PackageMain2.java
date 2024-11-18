package org.example.pack;

import org.example.pack.a.User;
// import 할 시 클래스 앞에 경로 안 적어줘도 됨.

import org.example.pack.a.*;
// pack.a 패키지 안에 있는 클래스를 전부 사용가능.

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();   // 풀네임
    }
}
