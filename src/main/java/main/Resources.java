package main;

import conditions.StartCondition;

/**
 * @author Caitlin Ross
 * Project: Arcomage, a minigame from 3DO's Might and Magic VII: For Blood and Honor
 * @version 1.0, 04/01/22
 */

public class Resources {
    private int quarry;
    private int bricks;
    private int magic;
    private int gems;
    private int zoo;
    private int beasts;

    public Resources(StartCondition startCond) {
        quarry = startCond.getStartingQuarry();
        bricks = startCond.getStartingBricks();
        magic = startCond.getStartingMagic();
        gems = startCond.getStartingGems();
        zoo = startCond.getStartingZoo();
        beasts = startCond.getStartingBeasts();
    }

    public int getQuarry() {
        return quarry;
    }

    public int getBricks() {
        return bricks;
    }

    public int getMagic() {
        return magic;
    }

    public int getGems() {
        return gems;
    }

    public int getZoo() {
        return zoo;
    }

    public int getBeasts() {
        return beasts;
    }

    public void update() throws ArithmeticException {
        if (quarry <=0 || magic <=0 || zoo <= 0) {
            throw new ArithmeticException();
        } else {
            bricks += quarry;
            gems += magic;
            beasts += zoo;
        }
    }
}

