package Inner_and_Abstract_Classes_Interfaces.Movable_interface;

public class MovablePoint implements Movable {

    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

    @Override
    public void moveUp() {
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x -= xSpeed;
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    @Override
    public String toString() {
        return String.format("Current Point - (%d;%d)", x, y);
    }
}
