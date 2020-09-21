package Inheritance_Polymorphism.Shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(){
        this.radius = 1.00;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String colour, boolean filled) {
        this.radius = radius;
        this.colour = colour;
        this.filled = filled;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return String.format( "A Circle with radius = %s, which is a subclass of %s", radius, super.toString());
    }

    @Override
    public boolean isInside(double x, double y) {
        return Math.abs(x) < radius && Math.abs(y) < radius;
    }

}
