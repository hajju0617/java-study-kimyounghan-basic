package org.example.poly.car0;

public class Driver {
    // 현재 Driver 클래스는 K3Car, Model3Car 에 의존하고 있음.
    // 클래스가 특정 클래스를 알고 있다 -> 그 특정 클래스에 의존하고 있다.
    private K3Car k3Car;
    private Model3Car model3Car;

    public void setK3Car(K3Car k3Car) {     // 외부에서 K3Car 인스턴스 주입. (객체 의존관계, 의존관계 주입.)
        this.k3Car = k3Car;
    }

    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    public void drive() {
        System.out.println("운전자가 자동차를 운전함.");
        if (k3Car != null) {
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        } else if (model3Car != null) {
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }
    }
}
