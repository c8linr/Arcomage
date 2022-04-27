package cards;

import java.util.ArrayList;

/**
 * The Hand class contains the cards that the player can play.
 *
 * @author Caitlin Ross
 * @version 1.0
 * @since 2022-04-27
 */
public class Hand {
    private ArrayList<Card> cardList; // Array List of cards
    private static final int maxCardsInHand = 6; // Number of cards allowed in the hand at end of turn

    /**
     * No-arg constructor, initializes and adds cards to the hand
     */
    public Hand() {
        cardList = new ArrayList<>(maxCardsInHand); // Initialize the array list
        // Add 6 cards to hand
        for (int i=0; i<maxCardsInHand; i++) {
            cardList.add(drawCard());
        }
    }

    /**
     * Draws a card from the "deck"
     *
     * @return a card
     */
    public Card drawCard() {
        // TODO: implement the draw card function
        return null;
    }

    /**
     * Draws the card's image on the screen
     */
    public void draw() {
        // TODO: implement draw function
    }
}