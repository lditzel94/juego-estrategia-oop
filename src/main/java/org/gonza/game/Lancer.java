package org.gonza.game;

public class Lancer extends Unity {
    private final int DEFAULT_DAMAGE = 25;

    public Lancer() {
        lifePoints = 150;
        damage = DEFAULT_DAMAGE;
        weapon = "Spear";
    }

    @Override
    public void attack( Unity unity ) {
        Coordinate enemyPosition = unity.getCoordinate();
        double enemyDistance = coordinate.calculateDistance( enemyPosition.getX(), enemyPosition.getY() );
        boolean isInRange = enemyDistance > 1 && enemyDistance < 3;
        if(isInRange) unity.loseLife( damage );
    }

    @Override
    public String toString() {
        return "Lancer{" +
                "lifePoints=" + lifePoints +
                ", weapon='" + weapon + '\'' +
                ", damage=" + damage +
                ", coordinate=" + coordinate +
                '}';
    }
}
