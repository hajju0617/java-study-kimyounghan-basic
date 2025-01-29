package org.example.poly.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();

        driver.setK3Car(k3Car);         // K3Car 인스턴트 주입.

        driver.drive();

        System.out.println("차량 변경.");
        System.out.println("----------");
        // 추가된 코드.
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null);
        driver.setModel3Car(model3Car);
        driver.drive();
    }
}
