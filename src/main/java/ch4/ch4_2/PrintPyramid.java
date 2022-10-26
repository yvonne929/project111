package ch4.ch4_2;

public class PrintPyramid {
    public static void printStars(int space,int stars){
        String outStr = "";
        for (int i = 0; i < space; i++) {
            outStr += " ";
        }
        for (int i = 0; i < stars; i++) {
            outStr += "*";
        }
        System.out.println(outStr);
    }

    public static void printPyramid(int n){
        int stars = 1;
        int space = n-1;
        while (space >= 0){
            printStars(space,stars);
            space--;
            stars+=2;
        }
    }

    public static void main(String[] args) {
        printPyramid(2);
        System.out.println("=============");
        printPyramid(3);
        System.out.println("=============");
        printPyramid(4);
        System.out.println("=============");
    }
}
