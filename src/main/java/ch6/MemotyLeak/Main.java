package ch6.MemotyLeak;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("yvonne", 20);
        Person p2 = new Person("Kevin", 19);

        p1.talk();
        p2.talk();


        p1 = p2;
        p1.talk();
        p2.talk();

        p1 = new Person("yvonne",20);
        p1.talk();
    }
}
