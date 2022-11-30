package ch5.Interface;

public class Cat extends Animal {
    public Cat() {
        super("Cat");
    }

    @Override //abstract一定要 Override
    public void makeSound() {
        System.out.println("喵");
    }
}
