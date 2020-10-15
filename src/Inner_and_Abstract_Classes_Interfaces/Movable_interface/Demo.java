package Inner_and_Abstract_Classes_Interfaces.Movable_interface;

public class Demo {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(2,3,4,5,10,12);
        rectangle.moveDown();
        System.out.println("\nMove down "+rectangle);

        rectangle.moveLeft();
        System.out.println("\nMove left "+rectangle);

        rectangle.moveUp();
        System.out.println("\nMove up "+rectangle);

        rectangle.moveRight();
        System.out.println("\nMove right "+rectangle);
    }
}
