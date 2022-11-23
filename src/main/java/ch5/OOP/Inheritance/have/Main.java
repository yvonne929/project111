package ch5.OOP.Inheritance.have;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("ChiHua",152273,42,"Java");
        Teacher t2 = new Teacher("Amy",152272,40,"DL");
        Student s1 = new Student("YuHsuan",410570011,20,"Java");
        Student s2 = new Student("Kevin",410570000,19,"DL");

        System.out.println(t1.name);
        t1.teach();
        t1.sit();
        System.out.println();
        System.out.println(s1.name);
        s1.learn();
        s1.sit();
    }
}
