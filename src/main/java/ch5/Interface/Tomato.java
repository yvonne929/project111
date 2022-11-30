package ch5.Interface;

public class Tomato implements Edible{
    protected String VegetableName;

    public Tomato(String VegetableName){
        this.VegetableName = VegetableName;
    }

    @Override
    public String youMayEat() {
        return "you may eat " + this.VegetableName + ".";
    }
}
