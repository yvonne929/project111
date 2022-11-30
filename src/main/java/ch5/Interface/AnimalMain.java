package ch5.Interface;

public class AnimalMain {
    public static void main(String[] args) {
        Edible food = new Pig();
        System.out.println(food.youMayEat());
    }
}
