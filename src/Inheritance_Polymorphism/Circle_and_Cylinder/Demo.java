package Inheritance_Polymorphism.Circle_and_Cylinder;

public class Demo {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setColour("Red");
        circle1.setRadius(10.0);
        System.out.println(circle1.toString());

        Cylinder cylinder1 = new Cylinder();
        cylinder1.setColour("White");
        cylinder1.setHeight(10.0);
        cylinder1.setRadius(20.0);
        System.out.println(cylinder1.toString());

    }
}
