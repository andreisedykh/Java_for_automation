package Inheritance_Polymorphism.Shapes;

public class Rectangle extends Shape {
    double width;
    double length;

    public Rectangle() {
        this.length = 1.00;
        this.width = 1.00;
    }

    public Rectangle(double width, double length) {
        this.length = width;
        this.width = length;
    }

    public Rectangle(double width, double length, String colour, boolean filled) {
        this.length = width;
        this.width = length;
        this.colour = colour;
        this.filled = filled;
    }

    public void setWidth(double width){
        this.width=width;
    }

    public void setLength(double length){
        this.length=length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getPerimeter() {
        return (width+length)*2;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public String toString() {
        return String.format( "A Rectangle with width=%s and length=%.2f, which is a subclass of %s", width, length, super.toString());
    }

    @Override
    public boolean isInside(double x, double y) {
        return Math.abs(y) < width && Math.abs(x) < length;
    }
}
