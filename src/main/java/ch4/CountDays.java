package ch4;

//計算天數，輸入某年某月某日，讓程式判斷這一天是這一年的第幾天

import java.util.Scanner;

public class CountDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input year: ");
        int year = scanner.nextInt();
        System.out.println("Input mouth: ");
        int mouth = scanner.nextInt();
        System.out.println("Input day: ");
        int day = scanner.nextInt();

        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        int result = 0;
        for (int i = 0; i < mouth-1; i++) {
            result+=days[i];
        }
        result+=day;
        System.out.println(result);
    }
}
