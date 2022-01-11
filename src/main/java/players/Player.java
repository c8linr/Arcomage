package players;

import cards.Card;
import cards.Hand;
import conditions.StartCondition;
import main.*;

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

    public Player(StartCondition startCond) {
        playerResources = new Resources(startCond);
        playerTower = new Tower(startCond);
        playerWall = new Wall(startCond);
        playerHand = new Hand();
    }

    public int getTowerHeight() {
        return playerTower.getHeight();
    }

    public Resources getPlayerResources() {
        return playerResources;
    }

    public abstract void takeTurn();

    protected Card drawCard() {
        return playerHand.drawCard();
    }
}