public class movablePoint implements Movable {
    int x, y;
    int XSPD, YSPD;

    public movablePoint(int x, int y, int XSPD, int YSPD) {
        this.x = x;
        this.y = y;
        this.XSPD = XSPD;
        this.YSPD = YSPD;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + XSPD +
                ", ySpeed=" + YSPD +
                '}';
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
}

