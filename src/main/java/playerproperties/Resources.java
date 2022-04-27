package playerproperties;

import conditions.StartCondition;

/**
 * The Resource class represents all of a player's currency-type resources.
 * This includes the modifiers, but not the tower or wall.
 * Quarry determines how many bricks are gained per turn, magic determines gems, and zoo determines beasts.
 *
 * @author Caitlin Ross
 * @version 1.0
 * @since 2022-04-27
 */
public class Resources {
    private int quarry; // Uninitialized, determines the number of bricks gained each turn
    private int bricks; // Uninitialized, used to play Red cards
    private int magic; // Uninitialized, determines the number of gems gained each turn
    private int gems; // Uninitialized, used to play Blue cards
    private int zoo; // Uninitialized, determines the number of beasts gained each turn
    private int beasts; // Uninitialized, used to play Green cards

    /**
     * Constructor, initializes the resources based on the start conditions
     *
     * @param startCond the starting conditions for the game
     */
    public Resources(StartCondition startCond) {
        quarry = startCond.getStartingQuarry(); // Set the starting quarry
        bricks = startCond.getStartingBricks(); // Set the starting bricks
        magic = startCond.getStartingMagic(); // Set the starting magic
        gems = startCond.getStartingGems(); // Set the starting gems
        zoo = startCond.getStartingZoo(); // Set the starting zoo
        beasts = startCond.getStartingBeasts(); // Set the starting beasts
    }

    /**
     * Returns the player's current quarry value
     *
     * @return the player's quarry
     */
    public int getQuarry() {
        return quarry;
    }

    /**
     * Updates the player's quarry based on the input.
     * Argument can be positive or negative.
     * Modifier resources cannot fall below 1.
     *
     * @param toAdd the value to add to the quarry
     */
    public void addQuarry(int toAdd) {
        quarry += toAdd;
        if (quarry < 1) {
            quarry = 1;
        }
    }

    /**
     * Returns the player's current number of bricks
     *
     * @return the player's bricks
     */
    public int getBricks() {
        return bricks;
    }

    /**
     * Updates the player's bricks based on the input.
     * Argument can be positive or negative.
     * Currency resources cannot fall below 0.
     *
     * @param toAdd the value to add to the number of bricks
     */
    public void addBricks(int toAdd) {
        bricks += toAdd;
        if (bricks < 0) {
            bricks = 0;
        }
    }

    /**
     * Returns the player's current magic value
     *
     * @return the player's magic
     */
    public int getMagic() {
        return magic;
    }

    /**
     * Updates the player's magic based on the input.
     * Argument can be positive or negative.
     * Modifier resources cannot fall below 1.
     *
     * @param toAdd the value to add to the magic
     */
    public void addMagic(int toAdd) {
        magic += toAdd;
        if (magic < 1) {
            magic = 1;
        }
    }

    /**
     * Returns the player's current number of gems
     *
     * @return the player's gems
     */
    public int getGems() {
        return gems;
    }

    /**
     * Updates the player's gems based on the input.
     * Argument can be positive or negative.
     * Currency resources cannot fall below 0.
     *
     * @param toAdd the value to add to the number of gems
     */
    public void addGems(int toAdd) {
        gems += toAdd;
        if (gems < 0) {
            gems = 0;
        }
    }

    /**
     * Returns the player's current zoo value
     *
     * @return the player's zoo
     */
    public int getZoo() {
        return zoo;
    }

    /**
     * Updates the player's zoo based on the input.
     * Argument can be positive or negative.
     * Modifier resources cannot fall below 1.
     *
     * @param toAdd the value to add to the zoo
     */
    public void addZoo(int toAdd) {
        zoo += toAdd;
        if (zoo < 1) {
            zoo = 1;
        }
    }

    /**
     * Returns the player's current number of beasts
     *
     * @return the player's beasts
     */
    public int getBeasts() {
        return beasts;
    }

    /**
     * Updates the player's beasts based on the input.
     * Argument can be positive or negative.
     * Currency resources cannot fall below 0.
     *
     * @param toAdd the value to add to the number of beasts
     */
    public void addBeasts(int toAdd) {
        beasts += toAdd;
        if (beasts < 0) {
            beasts = 0;
        }
    }

    /**
     * Updates the currency resources based on the value of the modifier resources.
     * Bricks are increased by the current value of quarry.
     * Gems are increased by the current value of magic.
     * Beasts are increased by the current value of zoo.
     *
     * @throws ArithmeticException if any modifier resources are below 1
     */
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