package ch4.ch4_2;

public class PrintPyramid {
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
        int space = n-1; //第一列有 n-1 個空白
        int stars = 1; //一開始都是印 1 顆星
        while (space >= 0){
            printStars(space,stars);
            space--; //每次印完，space-1
            stars+=2; //每次印完，stars多兩顆星(+2)
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
