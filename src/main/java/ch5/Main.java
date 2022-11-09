package ch5;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);//有輸入值
        System.out.println(circle.radius);

        Circle c2 = new Circle(3);//有輸入值
        System.out.println(c2.radius);

        Circle c3 = new Circle();//無輸入值
        System.out.println(c3.radius);
    }
}
