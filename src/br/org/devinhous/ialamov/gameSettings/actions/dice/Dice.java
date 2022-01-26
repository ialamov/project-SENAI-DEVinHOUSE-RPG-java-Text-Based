package br.org.devinhous.ialamov.gameSettings.actions.dice;

import java.util.Random;

public class Dice {

    private Random rand = new Random();

    public double d20() {
        int d20 = 20;
        int randNumber20 = this.rand.nextInt(d20);
        while ( randNumber20 < 1) {
            randNumber20 = this.rand.nextInt(d20);
        };
        return randNumber20;
    }

    public double d10() {
        int d10 = 10;
        int randNumber10 = this.rand.nextInt(d10);
        while ( randNumber10 < 1) {
            randNumber10 = this.rand.nextInt(d10);
        };
        return randNumber10;
    }
}
