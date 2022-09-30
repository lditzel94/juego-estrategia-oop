package org.gonza.game;

public abstract class Unity {
    protected int lifePoints;
    protected String weapon;
    protected int damage;
    protected Coordinate coordinate;

    public Unity() {
        coordinate = new Coordinate( 0, 0 );
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate( Coordinate coordinate ) {
        this.coordinate = coordinate;
    }

    public abstract void attack( Unity unity );

    public boolean isDead() {
        return lifePoints <= 0;
    }

    public void loseLife( int damage ) {
        if ( !isDead() ) lifePoints -= damage;
        else System.out.println( "Unity is dead" );
    }
}
