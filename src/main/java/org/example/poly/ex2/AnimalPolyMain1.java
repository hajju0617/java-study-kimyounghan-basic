package org.example.poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Duck duck = new Duck();
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
        soundAnimal(duck);
        System.out.println("----------");
        Animal animalDog = new Dog();
        Animal animalCat = new Cat();
        Animal animalCow = new Cow();
        Animal animalDuck = new Duck();
        soundAnimal(animalDog);
        soundAnimal(animalCat);
        soundAnimal(animalCow);
        soundAnimal(animalDuck);
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
