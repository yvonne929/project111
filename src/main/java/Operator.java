public class Operator {
    public static void main(String[] args) {
        System.out.println(3 == 3);
        System.out.println(4 == 3);
        System.out.println(4 != 3);
        System.out.println(4 >= 3);
        System.out.println(4 < 3);

        System.out.println(!true);

        /*
        System.out.println(true && true);//true and true => true
        System.out.println(false || true);//false and true => true
         */
        System.out.println(!(3 == 4) && !false || 5 >= 1);
        System.out.println((5 > 3) && (3 < 2) && !(15 == 6));
    }
}
