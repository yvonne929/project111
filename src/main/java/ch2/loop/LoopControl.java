package ch2.loop;

public class LoopControl {
    public static void main(String[] args) {
        //break
        int i = 0;
        while(true){
            if(i == 6){
                break;//跳過六也跳出整個迴圈
            }
            System.out.print(i);
            i++;
        }
        System.out.println();

        //continue
        int j = 0;
        while (j < 10) {
            j++;
            if (j == 6) {
                continue;//跳過六，繼續執行
            }
            System.out.print(j);
        }
    }
}
