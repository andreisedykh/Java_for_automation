package Inner_and_Abstract_Classes_Interfaces.Movable_interface;

public class MovableRectangle extends MovablePoint{

    public MovablePoint topLeft;
    public MovablePoint bottomRight;

    @Override
    public String toString() {
        return String.format("Top Left Point:\n%s\nBottom Right Point:\n%s", topLeft, bottomRight);
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
    }
}
