package ch5;

public class ThisMain {
    public static void main(String[] args) {
        ThisKeyword c1 = new ThisKeyword();
        System.out.println(c1.computeArea());
        ThisKeyword c2 = new ThisKeyword(10);
        System.out.println(c2.computeArea());
    }
}
