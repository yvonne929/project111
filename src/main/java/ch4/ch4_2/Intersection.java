package ch4.ch4_2;

//找出兩陣列共同的值，並儲存成陣列印出來

import ch2.array.Array;

import java.util.ArrayList;

public class Intersection {
    public static int[] intersection(int[] arr1,int[] arr2){
        ArrayList<Integer> outputs = new ArrayList<>();
        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j){
                    outputs.add(i);
                }
            }
        }
        int[] result = new int[outputs.size()];
        for (int k = 0; k < result.length; k++) {
            result[k] = outputs.get(k);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] intersect = intersection(new int[] {1,3,4,6,10},new int[] {5,11,4,3,9,1});
        for (int i : intersect) {
            System.out.print(i + " ");
        }
    }
}
