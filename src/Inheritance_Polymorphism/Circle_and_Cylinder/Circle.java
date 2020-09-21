package Inheritance_Polymorphism.Circle_and_Cylinder;

public class Circle {
    double radius;
    String colour;

    public Circle(){
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColour() {
        return this.colour;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return String.format("\nCircle:\nRadius - %.2f\nColour - %s\nArea - %.2f", radius,colour,getArea());
    }
}
