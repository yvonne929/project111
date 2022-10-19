package ch4;

//反轉陣列

public class Reverse {
    public static int[] reverseArray(int[] arr) {
        int[] outputArray = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--,j++) {
            outputArray[j] = arr[i];
            //j++ 也可以在這
        }
        return outputArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] reverse = reverseArray(array);
        for (int i : reverse) {
            System.out.print(i + " ");
        }
    }
}
