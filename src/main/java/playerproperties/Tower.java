package playerproperties;

import conditions.StartCondition;

/**
 * The Tower class represents the player's "life". If Tower falls to zero, the player loses.
 * There is also a win condition based on Tower height.
 *
 * @author Caitlin Ross
 * @version 1.0
 * @since 2022-04-27
 */
public class Tower {
    private int height; // Uninitialized, height of the Tower, no specific unit

    /**
     * Constructor, initializes the tower's height based on the starting conditions
     *
     * @param startCondition the starting conditions for the game
     */
    public Tower(StartCondition startCondition) {
        height = startCondition.getStartingTower(); // Initialize the Tower's height
    }

    /**
     * Returns the height of the player's Tower
     *
     * @return the Tower's height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Increases the height of the Tower based on the input
     *
     * @param increase the amount to increase the Tower's height
     */
    public void increaseHeight(int increase) {
        height += increase;
    }

    /**
     * Damages the Tower based on the input. Cannot fall below zero. Zero is a losing condition.
     *
     * @param decrease the amount of damage to the Tower
     */
    public void decreaseHeight(int decrease) {
        height -= decrease;
        if (height <= 0) {
            height = 0;
        }
    }

    /**
     * Draw's the Tower image on the screen
     */
    public void draw() {
        // TODO implement Tower.draw() method
    }
}