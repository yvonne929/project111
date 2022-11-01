package ch4.ch4_1;

public class Palindrome {
    public static void main(String[] args) {
        String inputStr = "上海自來水來自海上";
        boolean palindrome = true;
        int j = inputStr.length()-1;
        for (int i = 0; i < inputStr.length()/2; i++,j--) {
            if (inputStr.charAt(i) != inputStr.charAt(j)){
                palindrome = false;
            }
        }
        if (palindrome){
            System.out.println("上海自來水來自海上 is palindrome");
        }
        else {
            System.out.println("上海自來水來自海上 is not palindrome");
        }
    }
}
