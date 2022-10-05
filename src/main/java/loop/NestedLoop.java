package loop;

/*
巢狀迴圈
 */

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j > 0 ; j--) {
                System.out.println(i + "," + j);
            }
            System.out.println();
        }
    }
}
