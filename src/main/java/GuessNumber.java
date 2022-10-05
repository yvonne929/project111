import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int MAX = 100;
        Random random = new Random();
        int ansNum = random.nextInt(MAX-min)+min;//產生min~(MAX-min)的數字
        System.out.println(ansNum);


        while (true){
            System.out.println("請猜一個數字(介於" + min + "到" +MAX+")");
            int guessNum = scanner.nextInt();

            if(guessNum == ansNum){
                System.out.println("你猜到!答案是"+ansNum);
                break;
            }
            else if (guessNum < ansNum){
                min = guessNum;
            }
            else if (guessNum > ansNum){
                MAX = guessNum;
            }
        }
    }
}
