package ch5.Interface;

public class AnimalMain {
    public static void main(String[] args) {
        Edible food = new Pig();
        Edible vegetable = new Tomato("Tomato");
        System.out.println(food.youMayEat());
        System.out.println(vegetable.youMayEat());
    }
}
