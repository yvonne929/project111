package ch4;

//檢查大寫字母

public class CheckCapitalization {
    public static void upperCasePosition(String input){
        boolean found = false;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i); //取出字母
            if (Character.toUpperCase(c) == c){
                System.out.println(c + " " + i);
                found = true;
                break;
            }
        }
        if (found  == false){
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        upperCasePosition("abcd");
        upperCasePosition("AbcD");
        upperCasePosition("abCD");
    }
}
