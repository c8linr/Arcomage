package player;

import cards.Card;
import cards.Hand;
import conditions.StartCondition;
import playerproperties.Resources;
import playerproperties.Tower;
import playerproperties.Wall;

/**
 * The Player class is abstract, and represents the commonalities between the User and the Enemy.
 *
 * @author Caitlin Ross
 * @version 1.0
 * @since 2022-04-27
 */
public abstract class Player {
    protected Resources playerResources; // Uninitialized, the player's currency and modifier resources
    protected Tower playerTower; // Uninitialized, the player's Tower (life)
    protected Wall playerWall; // Uninitialized, the player's Wall (defense)
    protected Hand playerHand; // Uninitialized, the player's Hand of Cards

    /**
     * Constructor, initializes the player based on the starting conditions.
     *
     * @param startCond the starting conditions for the game
     */
    public Player(StartCondition startCond) {
        playerResources = new Resources(startCond); // Initialize the player's Resources
        playerTower = new Tower(startCond); // Initialize the player's Tower
        playerWall = new Wall(startCond); // Initialize the player's Wall
        playerHand = new Hand(); // Initializes the player's Hand
    }

    /**
     * Returns  the height of the player's Tower.
     *
     * @return the Tower's height
     */
    public int getTowerHeight() {
        return playerTower.getHeight();
    }

    /**
     * Returns the player's Resources object.
     *
     * @return the player's Resources
     */
    public Resources getPlayerResources() {
        return playerResources;
    }

    /**
     * Abstract. Contains the turn logic.
     */
    public abstract void takeTurn();

    /**
     * Adds a card to the player's Hand.
     *
     * @return the card drawn
     */
    protected Card drawCard() {
        return playerHand.drawCard();
    }
}