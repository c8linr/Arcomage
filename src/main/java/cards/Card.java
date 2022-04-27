package cards;

import java.util.ArrayList;

/**
 * The Card class represents all possible cards in the deck. Contains an enum the represents the possible card colours.
 *
 * @author Caitlin Ross
 * @version 1.0
 * @since 2022-04-27
 */
public class Card {
    private String name; // Name of the card
    private int cost; // Cost of the card, resource determined by the colour
    private CardColour cardColour; // Colour, determines which resource is spent
    private ArrayList<CardEffect> cardEffects; // List of effects

    /**
     * Constructor, initializes the Card based on the CardList object.
     *
     * @param theCard CardList object that contains the details of the card being created
     */
    public Card(CardList theCard){
        this.name = theCard.getName(); // Initialize the card name
        this.cost = theCard.getCost(); // Initialize the card cost
        this.cardColour = theCard.getCardColour(); // Initialize the card colour (3 options)

        cardEffects = new ArrayList<>(); // Initialize the list of effects
        for(CardEffect effect : theCard.getAllEffects()) {
            cardEffects.add(effect);
        }
    }

    /**
     * Enum that represents the possible card colours.
     */
    public enum CardColour {
        // Using an enum prevents spelling errors, case errors, etc. elsewhere in the code
        BLUE(), GREEN(), RED();
    }
}