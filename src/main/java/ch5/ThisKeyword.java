package ch5;

//this 的使用方法

public class ThisKeyword {
    private double radius;
    // 1.private final double PI  = 3.14; -> 非靜態(not static)
    // 2.private static final double PI  = 3.14; -> 靜態(static)，共享static variable，節省記憶體空間

    public ThisKeyword(){
        this(1); // 呼叫 ThisKeyword 這個 class 裡的建構函數(建構子)
                       //因為有輸入值 1，所以跳到 public ThisKeyword(double radius){}
    }

    public ThisKeyword(double radius){
        this.radius = radius; //this.radius 意思是 ThisKeyword 這個類別的屬性 radius
    }

    public double computeArea(){
        return Math.PI*Math.pow(this.radius,2);
        // 1.return this.PI*Math.pow(this.radius,2);
        // 2.return ThisKeyword.PI*Math.pow(this.radius,2);
    }
}
