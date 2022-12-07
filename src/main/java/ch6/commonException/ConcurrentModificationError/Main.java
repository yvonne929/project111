package ch6.commonException.ConcurrentModificationError;

//同時讀取、修改

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }
        int indexRemove = -1;//設定變數，來儲存之後要移除的值
        for (int k : arr){
            if (k == 5){
                indexRemove = k;
            }
        }
        arr.remove(indexRemove);
    }
}
