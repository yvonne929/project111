public class CharAndString {
    public static void main(String[] args) {
        String name = "Fu Jen Catholic University";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());//全部變小寫
        System.out.println(name.toUpperCase());//全部變大寫

        //index 0,1,2,...,n-1; n = length()
        System.out.println(name.charAt(0));//印出第0個字元
        System.out.println(name.charAt(3));//印出第3個字元
        System.out.println(name.charAt(name.length()-1));//印出最後一個字元
        System.out.println(name.indexOf('i'));//印出'i'的index
        System.out.println(name.indexOf("Uni"));//印出"Uni"的index

        String age = "25";
        System.out.println(Integer.parseInt(age));
    }
}
