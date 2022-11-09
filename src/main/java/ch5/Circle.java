package ch5;

/*
private 只能在當前的 class 裡使用
public 大家都可以用
 */
public class Circle {
    public double radius;

    public Circle(double newRadius) { //名字要和class一樣(Constructor of Circle class)
        radius = newRadius;
    }

    public Circle() {
        radius = 1.0;
    }
}
