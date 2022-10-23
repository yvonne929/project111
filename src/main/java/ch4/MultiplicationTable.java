package ch4;

//九九乘法表

public class MultiplicationTable {
    public static void ninebynine_table() {
        for (int k = 0; k < 9; k+=3) {
            for (int j = 1; j < 10; j++) {
                for (int i = 1; i <= 3; i++) {
                    if ((i+k) * j < 10 ) { //利用if-else判斷乘積，小於10就空一格，以便對齊
                        if ((i+k) == 3 || (i+k)== 6 || (i+k) == 9){ //第二層if-else判斷最後有無 "|"
                            System.out.print((i+k) + " * " + j + " =  " + (i+k) * j + " "); //乘積小於10(空一格)且最後無"|"
                        }
                        else {
                            System.out.print((i+k) + " * " + j + " =  " + (i+k) * j + " " + "|"); //乘積小於10(空一格)且最後有"|"
                        }
                    }
                    else { //此為乘積大於10，無空一格
                        if ((i+k) == 3 || (i+k)== 6 || (i+k) == 9){ //乘積大於10(無空一格)且最後無"|"
                            System.out.print((i+k) + " * " + j + " = " + (i+k) * j + " ");
                        }
                        else {
                            System.out.print((i+k) + " * " + j + " = " + (i+k) * j + " " + "|");//乘積大於10(無空一格)且最後有"|"
                        }
                    }
                }
                System.out.println();
            }
            System.out.print("----------------------------------");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ninebynine_table();
    }
}
