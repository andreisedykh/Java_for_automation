package Inheritance_Polymorphism.Shapes;

public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(1.90, "green", true);
        shapes[1] = new Rectangle(5,10, "black", false);
        shapes[2] = new Square(7, "yellow", true);

        for (Shape shape : shapes)
            System.out.println((shape + "\n" +
                    "Area = "+ shape.getArea() + "\n" +
                    "Perimeter = "+ shape.getPerimeter()));
    }
}
