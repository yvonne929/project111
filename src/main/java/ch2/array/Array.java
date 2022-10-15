package ch2.array;

/*
Array
 */

public class Array {
    public static void main(String[] args) {
        //陣列表達方式一
        String[] heroes = {"Iron Man","Captain America","Hulk","Thor"};
        System.out.println(heroes[0]);//取出陣列中 index = 0 的物件
        System.out.println(heroes.length);//有幾個元素
        System.out.println(heroes[heroes.length-1]);//取陣列中最後一個元素
        System.out.println(heroes);//heroes在記憶體位置

        //陣列表達方式二
        String[] anotherHeroes = new String[3];
        anotherHeroes[0] = "Black widow";
        anotherHeroes[1] = "Hawkeye";
        System.out.println(anotherHeroes[2]);
        //anotherHeroes[3] = "Spider Man";會顯示超出範圍
    }
}
