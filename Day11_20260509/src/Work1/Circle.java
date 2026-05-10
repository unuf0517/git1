package Work1;

public class Circle extends Shape{
    private double r;

    public Circle(double r){
        this.r=r;
    }
    @Override
    public double getArea(){
        return 3.14*r*r;
    }
}
