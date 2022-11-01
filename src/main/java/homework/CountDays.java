package homework;

//計算天數，輸入某年某月某日，讓程式判斷這一天是這一年的第幾天

import java.util.Scanner;

public class CountDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input year: ");
        int year = scanner.nextInt();
        System.out.print("Input mouth: ");
        int mouth = scanner.nextInt();
        System.out.print("Input day: ");
        int day = scanner.nextInt();

        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        int result = 0;
        for (int i = 0; i < mouth-1; i++) {
            //依提示得知:閏年為4的倍數"且"不為100的倍數，"或"為400的倍數
            if ((year%4 == 0 && year%100 != 0) || (year%400 == 0)){
                days[1] = 29; //if內成立，days[1] (即二月天數) 改為29天
                result+=days[i];
            }
            else { //若非，則用原本 days[1] = 28天計算
                result+=days[i];
            }
        }
        result+=day;
        System.out.println(result);
    }
}
