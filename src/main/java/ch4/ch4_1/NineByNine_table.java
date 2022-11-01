package ch4.ch4_1;

public class NineByNine_table {
    public static void ninebynine_table(){
        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <= 9 ; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }

    public static void main(String[] args) {
        ninebynine_table();
    }
}
