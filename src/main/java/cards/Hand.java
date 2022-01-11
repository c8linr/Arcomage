package cards;

import java.util.ArrayList;

/**
 * @author Caitlin Ross
 * Project: Arcomage, a minigame from 3DO's Might and Magic VII: For Blood and Honor
 * @version 1.0, 04/01/22
 */

public class Hand {
    private ArrayList<Card> cardList;
    private static final int maxCardsInHand = 6;

    public Hand() {
        cardList = new ArrayList<>(maxCardsInHand);
        for (int i=0; i<maxCardsInHand; i++) {
            cardList.add(drawCard());
        }
    }

    public Card drawCard() {
        // TODO: implement the draw card function
        return null;
    }

    public void draw() {
        // TODO: implement draw function
    }
}