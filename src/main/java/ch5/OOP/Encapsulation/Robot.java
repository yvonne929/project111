package ch5.OOP.Encapsulation;

//Encapsulation 封裝實作

public class Robot {
    private String name;
    private int madeYear;

    public Robot(String name , int madeYear){
        this.name = name;
        this.madeYear = madeYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMadeYear() {
        return madeYear;
    }

    public void setMadeYear(int madeYear) {
        this.madeYear = madeYear;
    }
}
