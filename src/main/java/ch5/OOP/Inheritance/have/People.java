package ch5.OOP.Inheritance.have;

//父類別(parent class)

public class People {
    protected String name;
    protected int id;
    protected int age;

    public People(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public void sit(){
        System.out.println("Sitting...");
    }

    public void eat(){
        System.out.println("Eating...");
    }
}
