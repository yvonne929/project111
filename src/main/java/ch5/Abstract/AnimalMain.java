package ch5.Abstract;

public class AnimalMain {
    public static void main(String[] args) {
        Animal dog1 = new Dog();
        Dog dog2 = new Dog();
        Animal cat1 = new Cat();
        Cat cat2 = new Cat();

        System.out.println(dog1.animalName);
        dog1.sleep();
        dog1.makeSound();

        System.out.println(cat1.animalName);
        cat1.sleep();
        cat1.makeSound();
    }
}
