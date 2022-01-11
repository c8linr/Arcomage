package playerproperties;

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

    public void addQuarry(int toAdd) {
        quarry += toAdd;
        if (quarry < 1) {
            quarry = 1;
        }
    }

    public int getBricks() {
        return bricks;
    }

    public void addBricks(int toAdd) {
        bricks += toAdd;
        if (bricks < 0) {
            bricks = 0;
        }
    }

    public int getMagic() {
        return magic;
    }

    public void addMagic(int toAdd) {
        magic += toAdd;
        if (magic < 1) {
            magic = 1;
        }
    }

    public int getGems() {
        return gems;
    }

    public void addGems(int toAdd) {
        gems += toAdd;
        if (gems < 0) {
            gems = 0;
        }
    }

    public int getZoo() {
        return zoo;
    }

    public void addZoo(int toAdd) {
        zoo += toAdd;
        if (zoo < 1) {
            zoo = 1;
        }
    }

    public int getBeasts() {
        return beasts;
    }

    public void addBeasts(int toAdd) {
        beasts += toAdd;
        if (beasts < 0) {
            beasts = 0;
        }
    }

    public void update() throws ArithmeticException {
        if (quarry < 1 || magic < 1 || zoo < 1) {
            throw new ArithmeticException();
        } else {
            bricks += quarry;
            gems += magic;
            beasts += zoo;
        }
    }
}

