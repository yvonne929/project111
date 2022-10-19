package ch4;

//判斷是否為回文

public class Palindrome {
    public static void main(String[] args) {
        String inputStr = "上海自來水來自海上";
        boolean palindrome = true;
        for (int i = 0; i < inputStr.length(); i++) {
            int j = inputStr.length()-1-i;
            if (inputStr.charAt(i) != inputStr.charAt(j)){
                palindrome = false;
            }
        }

        if (palindrome){
            System.out.println(inputStr + " is palindrome");
        }
        else {
            System.out.println(inputStr + " is not palindrome");
        }
    }
}
