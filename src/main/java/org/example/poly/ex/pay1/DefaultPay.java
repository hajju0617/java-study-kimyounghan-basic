package org.example.poly.ex.pay1;

public class DefaultPay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없음.");
        return false;
    }
}
