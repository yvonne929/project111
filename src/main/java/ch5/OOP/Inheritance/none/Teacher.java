package ch5.OOP.Inheritance.none;

public class Teacher {
    private String name;
    private int id;
    private int age;
    private String subjectName;

    public Teacher(String name, int id, int age, String subjectName) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.subjectName = subjectName;
    }

    public void sit(){
        System.out.println("Sitting....");
    }

    public void eat(){
        System.out.println("Eating....");
    }

    public void teach(){
        System.out.println("Teaching " + this.subjectName);
    }
}
