package array;

import java.util.ArrayList;
import java.util.Collections;

/*
ArrayList
 */

public class Array2 {
    public static void main(String[] args) {
        ArrayList<String> manyHeroes = new ArrayList<>();
        manyHeroes.add("Iron Man");
        manyHeroes.add("Ant Man");
        manyHeroes.add("Spider Man");
        System.out.println(manyHeroes.size());
        System.out.println(manyHeroes.get(2));//取得陣列中 index = 2 的物件

        Collections.sort(manyHeroes);//按照英文字母排序A~Z
        System.out.println(manyHeroes);

        manyHeroes.clear();//清除所有物件
        System.out.println(manyHeroes.size());
    }
}
