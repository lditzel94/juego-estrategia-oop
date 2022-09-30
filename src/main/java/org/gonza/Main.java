package org.gonza;

import org.gonza.game.*;

public class Main {
    public static void main( String[] args ) {
        Soldier soldier = new Soldier();
        Archer archer = new Archer();
        Lancer lancer = new Lancer();
        Knight knight = new Knight();

        System.out.println( soldier );
        System.out.println( archer );
        System.out.println( lancer );
        System.out.println( knight );

        soldier.setCoordinate( new Coordinate( 2, 5 ) );
        archer.setCoordinate( new Coordinate( 1, 3 ) );
        lancer.setCoordinate( new Coordinate( 4, 6 ) );
        knight.setCoordinate( new Coordinate( 5, 3 ) );

        for ( int i = 0; i < 21; i++ ) {
            archer.attack( soldier );
        }
        System.out.println( "Soldier life points :: " + soldier.getLifePoints() );
        System.out.println( "Archer arrows :: " + archer.getArrows() );
        archer.restoreArrows();
        System.out.println( "Archer arrows :: " + archer.getArrows() );
    }
}