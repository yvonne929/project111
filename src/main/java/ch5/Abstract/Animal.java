package ch5.Abstract;

public abstract class Animal {
    protected String animalName;

    public Animal(String animalName){
        this.animalName = animalName;
    }

    public void sleep(){
        System.out.println(animalName + " is sleeping.");
    }

    public abstract void makeSound();//不能直接用，只能到子類別裡建立
}
