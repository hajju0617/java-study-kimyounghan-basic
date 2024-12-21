package org.example.final1;

public class FieldInit {
    static final int CONST_VALUE = 10;
    final int value = 10;

//    public FieldInit(int value) {     // final이 붙은 변수에 값을 이미 할당 했으므로 생성자를 통한 값 변경은 불가능.
//        this.value = value;
//    }
}
