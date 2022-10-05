package loop;

/*
for迴圈
 */

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        String[] heroes = {"Iron Man","Captain America","Hulk","Thor"};
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i]);
        }

        for(String alterHeroes:heroes){//再創一個，把原本的陣列放進去，會自動顯示所有物件
            System.out.println(alterHeroes);
        }
    }
}
