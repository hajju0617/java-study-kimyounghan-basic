package org.example.poly.ex.pay1;

import java.util.Scanner;

public class PayMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayService payService = new PayService();

        while (true) {
            System.out.print("결제 수단을 입력해 주세요. : ");
            String payOption = scanner.nextLine();

            if (payOption.equals("exit")) {
                System.out.println("프로그램이 종료되었음.");
                return;
            }
            System.out.print("결제 금액을 입력하세요. : ");
            int amount = scanner.nextInt();
            scanner.nextLine();     // \n 제거.

            payService.processPay(payOption, amount);
        }
    }
}
