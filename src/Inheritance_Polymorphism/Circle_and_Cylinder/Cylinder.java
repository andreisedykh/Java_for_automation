package Inheritance_Polymorphism.Circle_and_Cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
    }

    public Cylinder(double radius) {
        this.radius = radius;
    }

    public Cylinder(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public Cylinder(double radius, double height, String colour) {
        this.radius = radius;
        this.height = height;
        this.colour = colour;
    }

    @Override
    public void setRadius(double radius){
        this.radius=radius;
    }

    public void setHeight(double height) {
        this.height=height;
    }

    @Override
    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public double getRadius() {
        return this.radius;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public String getColour() {
        return this.colour;
    }

    public double getArea() {
        return 2 * Math.PI * radius * height + 2 * super.getArea();
    }

    public double getVolume(){
        return height *  getArea();
    }

    @Override
    public String toString() {
        return String.format("\nCylinder:\nRadius - %.2f\nHeight - %.2f\nColour - %s\nArea - %.2f\nVolume - %.2f", this.radius, this.height, this.colour, getArea(), getVolume());
    }

}

