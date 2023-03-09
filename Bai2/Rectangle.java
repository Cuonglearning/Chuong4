package chuong4.Bai2;

public class Rectangle extends Shape {
    public double width=1.0;
    public double length=1.0;

    public Rectangle() {
    }
    
    public Rectangle(double width,double length){
        this.length=length;
        this.width=width;
    }

    public Rectangle(double width,double length,String color, boolean filled) {
        super(color, filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea(){
        return width*length;
    }
    
    public double getPerimeter(){
        return (width+length)*2;
    }

    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }
      
}
