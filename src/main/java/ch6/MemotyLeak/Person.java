package ch6.MemotyLeak;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void talk(){
        System.out.println("My name is " + name + ".");
    }
}
