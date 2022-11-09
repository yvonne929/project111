package ch4.ch4_2;

//給定陣列，並印出隨機排列的結果
/*打散的方法，先找到最後一個元素，隨機找(前面的)另一個元素互換
  再找最後一個的前一個元素，隨機找(前面的)另一個元素互換
  以此類推
 */

import java.util.Random;

public class Shuffle {
    public static int[] shuffle(int[] arr){
        int currentIndex = arr.length - 1;
        while (currentIndex > 0){
            Random random = new Random();
            int i = random.nextInt(currentIndex+1);
            int tmp = arr[currentIndex];
            arr[currentIndex] = arr[i];
            arr[i] = tmp;
            currentIndex--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        shuffle(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
