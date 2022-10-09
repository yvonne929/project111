import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //使用者輸入
        int min = 0;    //宣告固定的最小值
        int MAX = 100;  //宣告固定的最大值

        Random random = new Random(); //隨機產生亂數
        int ansNum = random.nextInt(MAX-min)+min; //產生min~(MAX-min)的數字
        System.out.println("answer is "+ansNum); //先印出ansNum

        while (true){
            System.out.println("請猜一個數字(介於" + min + "到" + MAX +")");
            int guessNum = scanner.nextInt(); //使用者輸入要猜的數字，原為String，利用.nextInt()轉成int

            if(guessNum == ansNum){
                System.out.println("你猜到!答案是"+ansNum);
                break;
            }

            //使用雙層if-else，來阻止bug發生
            else if (guessNum < ansNum){   //當猜的數字小於答案
                if (guessNum > min){       //猜的數字要大於最小值
                    min = guessNum;        //才會執行此行
                }
                else {
                    System.out.println("無效輸入");
                }
            }
            else if(guessNum > ansNum){   //當猜的數字大於答案
                if (guessNum < MAX) {     //猜的數字要小於最大值
                    MAX = guessNum;       //才會執行此行
                }
                else {
                    System.out.println("無效輸入");
                }
            }
        }
    }
}
