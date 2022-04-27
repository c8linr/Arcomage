package playerproperties;

import conditions.StartCondition;

/**
 * The Wall class represents the player's defense. Wall height does not impact losing or winning.
 *
 * @author Caitlin Ross
 * @version 1.0
 * @since 2022-04-27
 */
public class Wall {
    private int height; // Uninitialized, height of the Wall, no specific unit

    /**
     * Constructor, initializes the Wall's height based on the starting conditions
     *
     * @param startCondition the starting conditions for the game
     */
    public Wall(StartCondition startCondition) {
        height = startCondition.getStartingWall();
    }

    /**
     * Returns the height of the player's Wall
     *
     * @return the Wall's height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Increases the height of the Wall based on the input
     *
     * @param increase the amount to increase the Wall's height
     */
    public void increaseHeight(int increase) {
        height += increase;
    }

    /**
     * Damages the Wall based on the input. Cannot fall below zero.
     * When Wall falls to zero, "normal" damage goes directly to the Tower.
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
     * Draw's the Wall image on the screen
     */
    public void draw() {
        // TODO implement Wall.draw() method
    }
}