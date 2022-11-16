package ch5;

/*
private 只能在當前的 class 裡使用
public 大家都可以用
scope 變數有效範圍
 */
public class Circle {
    public double radius;//為 A Java field，整個 class 都可以使用

    public Circle(double newRadius) { //名字要和 class 一樣(Constructor of Circle class)
        radius = newRadius;
    }

    public Circle() {
        radius = 1.0;
    }

    public double computeArea(){
        return Math.PI*radius*radius;
    }

/*  i 的使用範圍只限於 setVar 裡 (區域變數、局部變數)
    public void setVar(){
        int i = 100;
    }

    public void outputVar(){
        System.out.println(i);
    }
 */
}
