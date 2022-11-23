package ch5.OOP.Polymorphism;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        People t1 = new Teacher("Chihua",152273,42,"Java");
        People t2 = new Teacher("Amy",152272,40,"DL");
        People s1 = new Student("YuHsuan",410570011,20,"Java");
        People s2 = new Student("Kevin",410570000,19,"DL");

        //Array
        People[] peopleInSchool = new People[4];
        peopleInSchool[0] = t1;
        peopleInSchool[1] = t2;
        peopleInSchool[2] = s1;
        peopleInSchool[3] = s2;

        for (int i = 0; i < 4; i++) {
            System.out.println(peopleInSchool[i].name);
        }

        System.out.println();

        //ArrayList
        ArrayList<People> peopleInSchool2 = new ArrayList<>();
        peopleInSchool2.add(t1);
        peopleInSchool2.add(t2);
        peopleInSchool2.add(s1);
        peopleInSchool2.add(s2);

        for (People p : peopleInSchool2) {
            System.out.println(p.name);
        }
    }
}
