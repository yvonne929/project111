package ch6.commonException.NullPointer;

public class Person {
    private String name;
    private int age;
    private Person spouse;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void talk(){
        if (spouse == null){
            System.out.println("Hello! My name is " + this.name + ". I am single");
        }
        else {
            System.out.println("Hello! My name is " + this.name + " and my spouse is " + spouse.getName());
        }
    }

    public void setSpouse(Person spouse){
        this.spouse = spouse;
    }

    public String getName(){
        return this.name;
    }
}
