package org.example.poly.ex3;


import org.example.poly.ex2.Animal;

public class AbstractMain {
    public static void main(String[] args) {
        // 추상 클래스는 객체 생성 불가.
//        AbstractAnimal abstractAnimal = new AbstractAnimal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Duck duck = new Duck();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
        soundAnimal(duck);
    }
    private static void soundAnimal(AbstractAnimal abstractAnimal) {
        System.out.println("동물 소리 테스트 시작");
        abstractAnimal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
