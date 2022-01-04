package conditions;

/**
 * @author Caitlin Ross
 * Project: Arcomage, a minigame from 3DO's Might and Magic VII: For Blood and Honor
 * @version 1.0, 04/01/22
 */

public class StartCondition {
    private int startingTower;
    private int startingWall;
    private int startingQuarry;
    private int startingBricks;
    private int startingMagic;
    private int startingGems;
    private int startingZoo;
    private int startingBeasts;

    public StartCondition() {
        // For now, I'm just using a generic starting condition. Later I'll implement the different options
        startingTower = 20;
        startingWall = 10;

        startingQuarry = 2;
        startingBricks = 5;
        startingMagic = 2;
        startingGems = 5;
        startingZoo = 2;
        startingBeasts = 5;
    }

    public int getStartingTower() {
        return startingTower;
    }

    public int getStartingWall() {
        return startingWall;
    }

    public int getStartingQuarry() {
        return startingQuarry;
    }

    public int getStartingBricks() {
        return startingBricks;
    }

    public int getStartingMagic() {
        return startingMagic;
    }

    public int getStartingGems() {
        return startingGems;
    }

    public int getStartingZoo() {
        return startingZoo;
    }

    public int getStartingBeasts() {
        return startingBeasts;
    }
}