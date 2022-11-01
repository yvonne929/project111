package homework;

public class ReversePyramid {
    public static void printStars(int space,int stars){
        String outStr = "";
        for (int i = 0; i < space; i++) { //印出??個空白
            outStr += " ";
        }
        for (int i = 0; i < stars; i++) { //印出??個星星
            outStr += "*";
        }
        System.out.println(outStr);
    }

    public static void printPyramid(int n){
        int space = 0; //一開始space都是 0
        int stars = 2*n-1; //每次印的數量不同，但都是2*n-1
        while (space < n){
            printStars(space,stars);
            space++; //每次印完，space+1
            stars-=2; //每次印完，stars少兩顆星(-2)
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
