package ch4.ch4_2;

//求最大公因數及最小公倍數

import java.util.Scanner;

public class GcdAndLcm {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int remain = a % b;
            a = b;
            b = remain;
        }
        return a;

        /*方法2
        if(a%b == 0){
        return b;
        }
        else{
        gcd(b,(a%b));
        }
        可以簡寫成 return (a % b = 0) ? b : gcd(b,(a%b));

         */
    }
    public static int lcm(int a , int b){
        return (a*b)/gcd(a,b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("int 1 : ");
        int int1 = scanner.nextInt();
        System.out.println("int 2 : ");
        int int2 = scanner.nextInt();

        System.out.println("GCD = " + gcd(int1, int2));
        System.out.println("LCM = " + lcm(int1, int2));
    }
}
