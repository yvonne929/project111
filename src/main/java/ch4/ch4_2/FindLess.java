package ch4.ch4_2;

//找陣列中有幾個小於n的值

public class FindLess {
    public static int findLess(int[] inputs,int n){
        int count = 0;
        //for(int i = 0; i < inputs.length; i++) {
        for(int i: inputs){ // 把inputs的值傳給i(但要是整數陣列才可以用此方式)
            if (i < n){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(findLess(new int[] {1,2,3},2));
        System.out.println(findLess(new int[] {1,2,3,4},3));
        System.out.println(findLess(new int[]{1,2,3,4,5},0));
    }
}
