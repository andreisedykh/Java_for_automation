package Inheritance_Polymorphism.Shapes;

abstract class Shape {
    boolean filled;
    String colour;

    public Shape() {
        this.colour = "green";
        this.filled = true;
    }

    public Shape(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    public void setFilled(boolean filled){
        this.filled=filled;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean getFilled() {
        return this.filled;
    }

    public String getColour() {
        return this.colour;
    }

    @Override
    public String toString() {
        return String.format( "A Shape with the colour of %s and %s", colour, filled ? "filled" : "Not filled");
    }



    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract boolean isInside(double x, double y);
}
