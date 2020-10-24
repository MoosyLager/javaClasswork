package nz.school.waimea;

public class Rect {
    private Point p1;
    private Point p2;
    private double side1;
    private double side2;

    public Rect( Point p1, Point p2 ) {
        this.p1 = p1;
        this.p2 = p2;
        side1 = Math.abs( p1.getX() - p2.getY() );
        side2 = Math.abs( p1.getY() - p2.getY() );
    }

    public double getArea( Point p1, Point p2 ) {
        return side1 * side2;

    }

    public double getPerimeter( Point p1, Point p2 ) {
        return side1 * 2 + side2 * 2;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1( Point p1 ) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2( Point p2 ) {
        this.p2 = p2;
    }
}
