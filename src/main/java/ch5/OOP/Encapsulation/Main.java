package ch5.OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Robot r = new Robot("GUNDAM",2022);
        System.out.println(r.getName());
        System.out.println(r.getMadeYear());
        r.setName("Aerial");
        System.out.println(r.getName());
    }
}
