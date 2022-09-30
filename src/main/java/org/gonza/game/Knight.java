package org.gonza.game;

public class Knight extends Unity {

    private final int DEFAULT_DAMAGE = 50;
    private int attacks;

    public Knight() {
        lifePoints = 200;
        damage = DEFAULT_DAMAGE;
        weapon = "Blade";
        attacks = 0;
    }

    public void attack( Unity unity ) {
        Coordinate enemyPosition = unity.getCoordinate();
        double enemyDistance = coordinate.calculateDistance( enemyPosition.getX(), enemyPosition.getY() );
        boolean isInRange = enemyDistance > 1 && enemyDistance < 2;
        if ( isInRange && horseIsNotCrazy() ) {
            attacks++;
            unity.loseLife( damage );
        }
        ;
    }

    private boolean horseIsNotCrazy() {
        return attacks < 3;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "attacks=" + attacks +
                ", lifePoints=" + lifePoints +
                ", weapon='" + weapon + '\'' +
                ", damage=" + damage +
                ", coordinate=" + coordinate +
                '}';
    }
}
