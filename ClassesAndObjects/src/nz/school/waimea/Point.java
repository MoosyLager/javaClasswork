package nz.school.waimea;

public class Point {
    private double x;
    private double y;
    private static int count = 0;
    public static final Point ORIGIN = new Point(0, 0);


    public Point(double x, double y) {
        this.x = x;
        this.y = y;

        count++;
    }

    public double distanceTo(Point other) {
        double dx = this.x - other.getX();
        double dy = this.y - other.getY();

        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distanceToOrigin() {
        return this.distanceTo(ORIGIN);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static int getCount() {
        return count;
    }
}
