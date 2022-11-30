package ch5.Interface;

public class Dog extends Animal {
    public Dog() {
        super("Dog");
    }

    @Override //abstract一定要 Override
    public void makeSound(){
        System.out.println("汪");
    }
}
