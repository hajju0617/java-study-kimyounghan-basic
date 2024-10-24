package org.example.oop1.ex;

public class Account {
    int balance;  // 잔액.

    void deposit(int amount) {
        System.out.printf("%d원이 입금 되었습니다.%n", amount);
        balance += amount;
    }

    void withdraw(int amount) {
        if (balance >= amount) {
            System.out.printf("%d원이 출금 되었습니다.%n", amount);
            balance -= amount;
            System.out.println("남은 잔액 : " + balance);
        } else {
            System.out.println("출금할 잔액 부족");
        }
    }
}
