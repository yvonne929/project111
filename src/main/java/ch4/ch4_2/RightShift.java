package ch4.ch4_2;

public class RightShift {
    public static int[] rightShift(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            rightShiftOnce(arr);
        }
        return arr;
    }

    public static void rightShiftOnce(int[] arr){

    }

    public static void main(String[] args) {
        int[] newArr = rightShift(new int[] {4,21,4,3,6,7,12,43,11},1);
        for (int i: newArr) {
            System.out.print(i + " ");
        }
    }
}
