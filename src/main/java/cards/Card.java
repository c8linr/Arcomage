package cards;

import java.util.ArrayList;

/**
 * The Card class represents all possible cards in the deck. Contains an enum the represents the possible card colours.
 *
 * @author Caitlin Ross
 * @version 1.0
 * @since 2022-06-14
 */
public class Card {
    final private String name; // Name of the card
    final private int cost; // Cost of the card, resource determined by the colour
    final private CardColour cardColour; // Colour, determines which resource is spent
    final private ArrayList<CardEffect> cardEffects; // List of effects

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
        cardEffects.addAll(theCard.getAllEffects());
    }

    public int getCost() {
        return cost;
    }

    public CardColour getCardColour() {
        return cardColour;
    }

    public ArrayList<CardEffect> getEffects() {
        return new ArrayList<>(cardEffects);
    }

    public String getName() {
        return name;
    }

    /**
     * Enum that represents the possible card colours.
     */
    public enum CardColour {
        // Using an enum to prevent spelling errors, case errors, etc. elsewhere in the code
        BLUE(), GREEN(), RED();
    }
}