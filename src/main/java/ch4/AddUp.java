package ch4;

//數值加總

public class AddUp {
    public static int addUpTo(int n){
        int result = 0;
        for (int i = 1; i <= n ; i++) {
            result+= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(addUpTo(10));
        System.out.println(addUpTo(100));
        System.out.println(addUpTo(1000));
        System.out.println(addUpTo(5000));
    }
}
