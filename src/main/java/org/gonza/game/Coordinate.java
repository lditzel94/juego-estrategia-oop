package org.gonza.game;

public class Coordinate {
    private double x;
    private double y;

    public Coordinate( double x, double y ) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double calculateDistance( Coordinate coordinate ) {
        return Math.hypot( this.getX() - coordinate.getX(), this.getY() - coordinate.getY() );
    }

    public double calculateDistance( double x, double y ) {
        return this.calculateDistance( new Coordinate( x, y ) );
    }

    public static double calculateDistance( Coordinate coordinate1, Coordinate coordinate2 ) {
        return Math.hypot( coordinate1.getX() - coordinate2.getX(), coordinate1.getY() - coordinate2.getY() );
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
