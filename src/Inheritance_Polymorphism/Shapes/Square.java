package Inheritance_Polymorphism.Shapes;

public class Square extends Rectangle {


    public Square() {

    }

    public Square(double side){
        this.width = side;
        this.length = side;
    }

    public Square(double side, String colour, boolean filled){
        this.width = side;
        this.length = side;
        this.colour = colour;
        this.filled = filled;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = this.length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = this.width;
    }

    @Override
    public String toString() {
        return String.format( "A Square with side = %s, which is a subclass of %s", width, super.toString());
    }

}
