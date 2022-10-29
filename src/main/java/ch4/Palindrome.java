package ch4;

//判斷是否為回文

public class Palindrome {
    public static void main(String[] args) {
        String s = "race a car";
        boolean palindrome = true;
        String lowerCase = s.toLowerCase(); //先統一字母大小寫，此改成小寫
        char space = ' ';
        int j = lowerCase.length() - 1; //迴圈裡有兩種變數(i,j)要跑，一個遞增，一個遞減，此存取遞減變數 j
        for (int i = 0; i < lowerCase.length(); i++, j--) {
            if (lowerCase.charAt(i) == space && lowerCase.charAt(j) == space) { //當同時遇到空格時
                i++; //index i 略過空格
                j--; //index j 也略過空格
                if (lowerCase.charAt(i) != lowerCase.charAt(j)) { //判斷略過後的字母是否相同
                    palindrome = false;
                }
            }
            else if (lowerCase.charAt(i) == space) { //當只有 index i 遇到空格
                i++; //index i 略過空格
                if (lowerCase.charAt(i) != lowerCase.charAt(j)){ //判斷略過後的字母是否相同
                    palindrome = false;
                }
            }
            else if (lowerCase.charAt(j) == space){ //當只有 index j 遇到空格
                j--; //index j 略過空格
                if (lowerCase.charAt(i) != lowerCase.charAt(j)){ //判斷略過後的字母是否相同
                    palindrome = false;
                }
            }
        }

        if (palindrome){
            System.out.println(s + " is palindrome");
        }
        else {
            System.out.println(s + " is not palindrome");
        }
    }
}
