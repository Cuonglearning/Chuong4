package chuong4.Bai2;

public class Square extends Rectangle {
    public double side;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super( side,side);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public String toString() {
        return "Square{" + "side=" + side + '}';
    }
    
    
}
