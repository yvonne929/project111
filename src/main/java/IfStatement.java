public class IfStatement {
    public static void main(String[] args) {
        int age = 20;

        if(age >= 0 && age < 14){
            System.out.println("你屬於 無行為能力人");
        }
        else if((age >= 14 && age < 18)||age >= 80){
            System.out.println("你屬於 限制行為能力人");
        }
        else if (age >= 18){
            System.out.println("你屬於 完全行為能力人");
        }
    }
}