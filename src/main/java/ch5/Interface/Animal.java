package ch5.Interface;

public abstract class Animal {
    protected String animalName;

    public Animal(String animalName){
        this.animalName = animalName;
    }

    //non-abstract methods (是object共同有的 methods)
    public void sleep(){
        System.out.println(animalName + " is sleeping.");
    }

    //abstract methods (object可以在自己的class裡定義不同的動作)
    public abstract void makeSound();//不能直接用，只能到子類別裡建立
}
