package ch4.ch4_2;

public class Pyramid {
    public static void pyramid(int n){
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i+1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        String output = "";
        for (int i = 1; i <= n; i++) {
            output+= "*";
            System.out.print(output);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        pyramid(1);
        System.out.println("==========");
        pyramid(3);
        System.out.println("==========");
        pyramid(5);
    }
}
