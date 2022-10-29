package ch4.ch4_1;

//檢查第一個大寫字母

public class CheckUpperCase {
    public static void upperCasePosition(String input){
        boolean found = false;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i); //取出字母
            if (Character.toUpperCase(c) == c){
                System.out.println(c + " " + i);
                found = true;
                break;//只要檢查第一個是大寫的，檢查到就跳出
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
