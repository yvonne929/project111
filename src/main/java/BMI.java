import java.text.DecimalFormat;
import java.util.Scanner;

public class BMI {
    private static final DecimalFormat DF = new DecimalFormat("0.00");//算到小數點後兩位(方法一)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入你的體重(公斤):");
        double weight = scanner.nextDouble();
        System.out.print("請輸入你的身高(公分):");
        double height = scanner.nextDouble()/100;

        double bmi = Double.parseDouble(DF.format(weight/(height*height)));
        System.out.printf("your MBI is %.2f ",bmi);

        /* 算到小數點後兩位(方法二)
        double bmi =weight/(height*height);
        System.out.printf("your MBI is %.2f ",bmi);
         */

        if (bmi < 18.5){
            System.out.println("過輕");
        }
        else if (bmi >=18.5 && bmi < 25){
            System.out.println("適中");
        }
        else if (bmi >= 25 && bmi < 30 ){
            System.out.println("過重");
        }
        else {
            System.out.println("肥胖");
        }
    }
}
