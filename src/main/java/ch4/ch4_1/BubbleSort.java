package ch4.ch4_1;

//氣泡排序:兩兩比較，交換
/*例:51428
  i=0           i=1
  j=0 ->15428   j=0 ->14258
  j=1 ->14528   j=1 ->12458
  j=2 ->14258   j=2 ->12458
  j=3 ->14258
 */

public class BubbleSort {
    public static void bubbleSort(int[] arr ){
        int turn = 1; // 表示第??回合
        for (int i = 0; i < arr.length-1; i++) {
            int earlyStop = 1;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    earlyStop = 0;
                }
            }
            if (earlyStop == 1) break;

            //查看執行過程
            for (int k = 0; k < arr.length; k++) {
                if (k == arr.length-1-turn){
                    System.out.print(arr[k] + "[");
                }
                else if (k == arr.length-1) {
                    System.out.print(arr[k] + "]");
                }
                else {
                    System.out.print(arr[k] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] array = {6,5,4,3,2,1};
        bubbleSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
