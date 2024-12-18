package org.example.final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "Kim");
        member.print();
        member.changeData("myId2", "Ha");
        member.print();
    }
}
