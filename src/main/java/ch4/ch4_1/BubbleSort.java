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
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {5,1,4,2,8};
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        bubbleSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
