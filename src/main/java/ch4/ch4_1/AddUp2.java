package ch4.ch4_1;

//求a+aa+aaa+aaaa+aa...a的值
//例: 2+22+222(3個數相加)。a = 2、n = 3，則輸出結果：2+22+222 = 246

import java.util.Scanner;

public class AddUp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a: ");
        int a  = scanner.nextInt();
        System.out.print("Input n: ");
        int n = scanner.nextInt();

        int result = 0;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < i+1 ; j++) {
                result+= (a*Math.pow(10,j));
            }
        }
        System.out.println("result is " + result);
    }
}
