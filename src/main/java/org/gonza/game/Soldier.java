package org.gonza.game;

public class Soldier extends Unity {
    private int energy;
    private final int DEFAULT_ENERGY = 100;
    private final int DEFAULT_ATTACK_COST = 10;

    public Soldier() {
        lifePoints = 200;
        energy = DEFAULT_ENERGY;
        damage = 10;
        weapon = "Blade";
    }

    public void restoreEnergy() {
        energy = DEFAULT_ENERGY;
    }

    @Override
    public void attack( Unity unity ) {
        if ( hasEnergy() && !isDead() ) {
            energy -= DEFAULT_ATTACK_COST;
            unity.loseLife( damage );
        } else System.out.println( "No energy left, drink some water" );

    }

    private boolean hasEnergy() {
        return energy >= DEFAULT_ATTACK_COST;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "energy=" + energy +
                ", lifePoints=" + lifePoints +
                ", weapon='" + weapon + '\'' +
                ", damage=" + damage +
                ", coordinate=" + coordinate +
                '}';
    }
}
