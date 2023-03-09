package chuong4.Bai2;

public class circle extends Shape{
    public double radius=1.0;
    public double PI=3.14;

    public circle() {
    }
    
    public circle(double radius){
        this.radius=radius;
    }

    public circle(double radius,String color, boolean filled) {
        super(color, filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return PI*radius;
    }
    
    public double getPerimeter(){
        return 2*PI*radius;
    }
}
