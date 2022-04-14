
public class Point {
    //ch2: ex 5
    private final double x;
    private final double y;

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double x, double y) {
        return new Point(this.getX()+ x, this.getY() + y);
    }

    public Point scale(double a) {
        return new Point(this.getX() * a, this.getY() * a);
    }

    @Override
    public String toString() {
        return "(" + x +
                ", " + y +
                ')';
    }
}
