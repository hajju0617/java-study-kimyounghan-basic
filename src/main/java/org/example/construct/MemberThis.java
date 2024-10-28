package org.example.construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;
    }
    /*
    this. 은 생략 할 수 있음.
    변수를 찾을 때 가까운 지역변수(매개변수도 지역변수임)를 먼저 찾고 없으면 다음으로 멤버변수를 찾음.

    nameField는 먼저 지역변수(매개변수)에서 같은 이름이 있는 지 찾고 없을 경우 멤버 변수에서 찾음.
    nameParameter는 먼저 지역변수(매개변수)에서 같은 이름이 있는 지 찾음. 이 변수는 매개변수가 있으니 매개변수 사용.

    특히 IDE가 멤버 변수와 지역 변수를 색상으로 구분시켜줌.

     */
}
