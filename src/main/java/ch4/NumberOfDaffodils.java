package ch4;

//輸出所有的「水仙花數」
//水仙花數: 153 = 1^3+5^3+3^3

public class NumberOfDaffodils {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int units = i % 10;
            int tens = (i / 10) % 10;
            int hundreds = (i / 100) % 10;

            int sum = (int) (Math.pow(units, 3) + Math.pow(tens, 3) + Math.pow(hundreds, 3));
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
