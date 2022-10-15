package ch2.loop;

/*
while迴圈，()裡為true時會執行
 */

public class WhileLoop {
    public static void main(String[] args) {

        /*
        while(true){//無窮迴圈
            System.out.println("hi");
        }
         */

        int i = 0;
        while (i<10){
            System.out.println("This is " + i);
            i++;
        }
    }
}
