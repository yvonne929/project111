package ch4.ch4_2;

//印出把整個array當中的元素向右邊移動 n格後的結果

public class RightShift {
    public static int[] rightShift(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            rightShiftOnce(arr);
        }
        return arr;
    }

    //一次平移一個，若要四次，rightShift呼叫此function四次
    //由後往前做
    public static void rightShiftOnce(int[] arr){
        int lastEle = arr[arr.length-1];
        for (int i = arr.length-1 ; i >= 1 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = lastEle;
    }

    public static void main(String[] args) {
        int[] newArr = rightShift(new int[] {4,21,4,3,6,7,12,43,11},1);
        for (int i: newArr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("======================");
        System.out.println();
        int[] newArr2 = rightShift(new int[] {4,21,4,3,6,7,12,43,11},4);
        for (int i: newArr2) {
            System.out.print(i + " ");
        }
    }
}
