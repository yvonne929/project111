package ch5.OOP.Inheritance.none;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Chihua",152273,42,"Java");
        Teacher t2 = new Teacher("David",100002,50,"Deep Learning");
        Student s1 = new Student("Yvonne",410570011,20,"Java");
        Student s2 = new Student("Amy",410570,20,"Java");

        t1.teach();
        s1.sit();
        s2.learn();
    }
}
