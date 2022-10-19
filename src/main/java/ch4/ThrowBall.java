package ch4;

//一球從h米高度自由落下，每次落地後反跳回原高度的一半，再落下。求小球在第n次落地時，共經過多少公尺？

import java.util.Scanner;

public class ThrowBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the height: ");
        int h = scanner.nextInt();
        System.out.print("Input the num: ");
        int n = scanner.nextInt();

        double result = h;
        for (int i = 2; i <= n ; i++) {
            result+= 2*(h/Math.pow(2,i-1));
        }

        System.out.println("The distance is " + result);
    }
}
