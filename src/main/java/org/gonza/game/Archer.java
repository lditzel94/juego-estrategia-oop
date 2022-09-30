package org.gonza.game;

public class Archer extends Unity {
    private final int DEFAULT_DAMAGE = 5;
    private int arrows;

    public Archer() {
        lifePoints = 50;
        damage = DEFAULT_DAMAGE;
        arrows = 20;
        weapon = "Carcaj";
    }

    public void restoreArrows() {
        arrows += 6;
    }

    public int getArrows() {
        return arrows;
    }

    @Override
    public void attack( Unity unity ) {
        Coordinate enemyPosition = unity.getCoordinate();
        double enemyDistance = coordinate.calculateDistance( enemyPosition.getX(), enemyPosition.getY() );
        boolean isInRange = enemyDistance > 2 && enemyDistance < 5;

        if ( isInRange && hasArrows() ) {
            arrows -= 1;
            unity.loseLife( damage );
        } else System.out.println( "You don't have enough arrows or not in range to attack" );
    }

    private boolean hasArrows() {
        return arrows > 0;
    }

    @Override
    public String toString() {
        return "Archer{" +
                "arrows=" + arrows +
                ", lifePoints=" + lifePoints +
                ", weapon='" + weapon + '\'' +
                ", damage=" + damage +
                ", coordinate=" + coordinate +
                '}';
    }
}
