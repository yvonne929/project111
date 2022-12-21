package ch4.ch4_2;

/*
選擇排序:內層迴圈的交換
 */

public class SelectionSort {
    public static void selectionSort(int[] arr){
        int minIndex;
        for (int i = 0; i < arr.length-1; i++) {
            minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for (int i: arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {9,8,6,4,3,7};
        System.out.println("Original array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        selectionSort(array);
    }
}
