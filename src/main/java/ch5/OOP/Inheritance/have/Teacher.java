package ch5.OOP.Inheritance.have;

//子類別(child class)

public class Teacher extends People{
    private String subjectName;

    public Teacher(String name, int id, int age, String subjectName) {
        super(name, id, age); //call constructor of superClass [呼叫父類別的構造函數(建構子)]
        this.subjectName = subjectName;
    }

    public void teach(){
        System.out.println("Teaching in " + this.subjectName);
    }
}
