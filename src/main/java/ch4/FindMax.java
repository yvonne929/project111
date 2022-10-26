package ch4;

public class FindMax {
    public static int findMax(int[] inputs){
        int Max = 4; // 初始值不設0，因為有可能全部都比0小，所以先預設第一個為Max
        for (int i = 1; i < inputs.length ; i++) {
            if (inputs[i] > Max){
                Max = inputs[i];
            }
        }
        return Max;
    }

    public static void main(String[] args) {
        int[] array = {4,3,6,7,9,0,-4};
        System.out.println(findMax(array));
    }
}
