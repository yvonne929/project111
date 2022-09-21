public class Arithmetic {
    public static void main(String[] args) {
        System.out.println(20+22);
        System.out.println("20" + "22");
        System.out.println(20 + "22");
        System.out.println((20 + "22").getClass().getName());

        System.out.println(20+22 + "09" + 21);//由左至右，字串後面的會跟著變字串
        System.out.println(7/10);//取整數
        System.out.println(7.0/10);//有浮點數會把不是的也變浮點數
    }
}
