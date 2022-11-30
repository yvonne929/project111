package ch6;

public class Sheep {
    private int x;
    private int y;

    public Sheep(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "The xy coordinate is " + x + "," + y;
    }
}
