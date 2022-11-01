package ch4.ch4_1;

//等差數列 公差3
//1,4,7,...,88

public class PrintEvery {
    public static void printEvery3() {
        for (int i = 1; i <= 88; i += 3) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printEvery3();
    }
}