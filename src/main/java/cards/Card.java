package cards;

import java.util.ArrayList;

/**
 * @author Caitlin Ross
 * Project: Arcomage, a minigame from 3DO's Might and Magic VII: For Blood and Honor
 * @version 1.0, 04/01/22
 */

public class Card {
    public static final String BLUE_CARD = "blue";
    public static final String GREEN_CARD = "green";
    public static final String RED_CARD ="red";

    private String name;
    private int cost;
    private String cardColour;
    private ArrayList<CardEffect> cardEffects;

    public Card(CardList theCard){
        this.name = theCard.getName();
        this.cost = theCard.getCost();
        this.cardColour = theCard.getCardColour();

        cardEffects = new ArrayList<>();
        for(CardEffect effect : theCard.getAllEffects()) {
            cardEffects.add(effect);
        }
    }
}