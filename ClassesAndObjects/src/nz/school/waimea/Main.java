package nz.school.waimea;

public class Main {

    public static void main( String[] args ) {
        Point p1 = new Point( 10, 10 );
        Point p2 = new Point( 20, 20 );
        Point p3 = new Point( 30, 30 );

        System.out.println( "Number of Points:" );
        System.out.println( Point.getCount() );

        System.out.println( "Distance from P1 to P2:" );
        System.out.println( p1.distanceTo( p2 ) );


        System.out.println( "Distance from P1 to Origin:" );
        System.out.println( p1.distanceToOrigin() );
        System.out.println( p1.distanceTo( Point.ORIGIN ) );


        Line l1 = new Line( p2, p3 );
        Line l2 = new Line( p1, p1 );

        System.out.println( "Length of line 1:" );
        System.out.println( l1.length() );

        System.out.println( "Length of line 2:" );
        System.out.println( l2.length() );

        Rect r1 = new Rect( p1, p2 );

        System.out.println( "Perimeter of Perimeter1:" );
        System.out.println( r1.getPerimeter( p1, p2 ) );

        System.out.println( "Area of Area1:" );
        System.out.println( r1.getArea( p1, p2 ) );

    }
}
