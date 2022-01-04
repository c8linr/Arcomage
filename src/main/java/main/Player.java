package main;
/**
 * @author Caitlin Ross
 * Project: Arcomage, a minigame from 3DO's Might and Magic VII: For Blood and Honor
 * @version 1.0, 04/01/22
 */

public abstract class Player {
    protected Resources playerResources;
    protected Tower playerTower;
    protected Wall playerWall;
    protected Hand playerHand;

    public Player() {
        // TODO: initialize the player
    }

    public int getTowerHeight() {
        return playerTower.getHeight();
    }

    public Resources getPlayerResources() {
        return playerResources;
    }

    public abstract void takeTurn();
}