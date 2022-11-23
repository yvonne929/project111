package ch5.OOP.Inheritance.have;

//子類別(child class)

public class Student extends People{
    private String className;

    public Student(String name, int id, int age, String className) {
        super(name, id, age);
        this.className = className;
    }

    public void learn(){
        System.out.println("Learning in " + this.className);
    }
}
