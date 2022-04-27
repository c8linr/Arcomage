package cards;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The CardList enum provides the details for each possible card, including name, colour, cost, and effects.
 *
 * @author Caitlin Ross
 * @version 1.0
 * @since 2022-04-27
 */
public enum CardList {
    AMETHYST("Amethyst", Card.CardColour.BLUE, 2,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 3)),
    CRUMBLESTONE("Crumblestone", Card.CardColour.BLUE, 7,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 5),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.BRICKS, -6)),
    CRYSTALLIZE("Crystallize", Card.CardColour.BLUE, 8,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 11),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, -6)),
    CRYSTAL_MATRIX("Crystal Matrix", Card.CardColour.BLUE, 6,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.MAGIC, 1),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 3),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.TOWER, 1)),
    CRYSTAL_SHIELD("Crystal Shield", Card.CardColour.BLUE, 12,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 8),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, 3)),
    DIAMOND("Diamond", Card.CardColour.BLUE, 16,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 15)),
    DISCORD("Discord", Card.CardColour.BLUE, 5,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, -7),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.TOWER, -7),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.MAGIC, -1),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.MAGIC, -1)),
    DRAGONS_EYE("Dragon's Eye", Card.CardColour.BLUE, 21,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 20)),
    EMERALD("Emerald", Card.CardColour.BLUE, 6,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 8)),
    EMPATHY_GEM("Empathy Gem", Card.CardColour.BLUE, 14,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 8),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.ZOO, 1)),
    FIRE_RUBY("Fire Ruby", Card.CardColour.BLUE, 13,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 6),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.TOWER, -4)),
    GEM_SPEAR("Gem Spear", Card.CardColour.BLUE, 4,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.TOWER, -5)),
    GEMSTONE_FLAW("Gemstone Flaw", Card.CardColour.BLUE, 2,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.TOWER, -3)),
    HARMONIC_VIBE("Harmonic Vibe", Card.CardColour.BLUE, 7,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.MAGIC, 1),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 3),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, 3)),
    LAVA_JEWEL("Lava Jewel", Card.CardColour.BLUE, 17,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 12),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.DAMAGE, 6)),
    LODESTONE("Lodestone", Card.CardColour.BLUE, 5, // NEEDS UNIQUE EFFECT TO PREVENT DISCARD
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 3)),
    PARITY("Parity", Card.CardColour.BLUE, 7), // NEEDS UNIQUE EFFECT TO FIND HIGHEST PLAYERS MAGIC
    PEARL_OF_WISDOM("Pearl of Wisdom", Card.CardColour.BLUE, 9,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 5),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.MAGIC, 1)),
    POWER_BURN("Power Burn", Card.CardColour.BLUE, 3,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, -5),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.MAGIC, 2)),
    PRISM("Prism", Card.CardColour.BLUE, 2), // NEEDS UNIQUE EFFECT TO DRAW, DISCARD, PLAY AGAIN
    QUARRYS_HELP("Quarry's Help", Card.CardColour.BLUE, 4,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 7),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.BRICKS, -10)),
    QUARTZ("Quartz", Card.CardColour.BLUE, 1, // NEEDS UNIQUE EFFECT TO PLAY AGAIN
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 1)),
    RUBY("Ruby", Card.CardColour.BLUE, 3,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 5)),
    SANCTUARY("Sanctuary", Card.CardColour.BLUE, 15,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 10),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, 5),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.BEASTS, 5)),
    SAPPHIRE("Sapphire", Card.CardColour.BLUE, 10,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 11)),
    SHATTERER("Shatterer", Card.CardColour.BLUE, 8,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.MAGIC, -1),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.TOWER, -9)),
    SMOKY_QUARTZ("Smoky Quartz", Card.CardColour.BLUE, 2, // NEEDS UNIQUE EFFECT TO PLAY AGAIN
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.TOWER, -1)),
    SOLAR_FLARE("Solar Flare", Card.CardColour.BLUE, 4,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 2),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.TOWER, -2)),
    SPELL_WEAVERS("Spell Weavers", Card.CardColour.BLUE, 3,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.MAGIC, 1)),
    CORROSION_CLOUD("Corrosion Cloud", Card.CardColour.GREEN, 11), // NEEDS UNIQUE EFFECT FOR CONDITION
    DRAGON("Dragon", Card.CardColour.GREEN, 25,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.DAMAGE, 20),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.GEMS, -10),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.ZOO, -1)),
    DWARVES("Dwarves", Card.CardColour.GREEN, 5,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.DAMAGE, 4),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, 3)),
    ELVEN_ARCHERS("Elven Archers", Card.CardColour.GREEN, 10), // NEEDS UNIQUE EFFECT FOR CONDITION
    ELVEN_SCOUT("Elven Scout", Card.CardColour.GREEN, 2), // NEEDS UNIQUE EFFECT FOR DRAW, DISCARD, PLAY AGAIN
    FAERIE("Faerie", Card.CardColour.GREEN, 1, // NEEDS UNIQUE EFFECT TO PLAY AGAIN
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.DAMAGE, 2)),
    FULL_MOON("Full Moon", Card.CardColour.GREEN, 0,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.ZOO, 1),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.ZOO, 1),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.BEASTS, 3)),
    GOBLIN_ARCHERS("Goblin Archers", Card.CardColour.GREEN, 4,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.TOWER, -3),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.DAMAGE, 1)),
    GOBLIN_MOB("Goblin Mob", Card.CardColour.GREEN, 3,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.DAMAGE, 6),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.DAMAGE, 3)),
    HUSBANDRY("Husbandry", Card.CardColour.GREEN, 3,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.ZOO, 1)),
    IMP("Imp", Card.CardColour.GREEN, 5,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.DAMAGE, 6),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.BRICKS, -5),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.BRICKS, -5),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.GEMS, -5),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.GEMS, -5),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.BEASTS, -5),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.BEASTS, -5)),
    LITTLE_SNAKES("Little Snakes", Card.CardColour.GREEN, 6,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.TOWER, -4)),
    MAD_COW_DISEASE("Mad Cow Disease", Card.CardColour.GREEN, 0,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.BEASTS, -6),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.BEASTS, -6)),
    MOODY_GOBLINS("Moody Goblins", Card.CardColour.GREEN, 1,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.DAMAGE, 4),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.GEMS, -3)),
    OGRE("Ogre", Card.CardColour.GREEN, 6,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.DAMAGE, 7)),
    ORC("Orc", Card.CardColour.GREEN, 3,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.DAMAGE, 5)),
    RABID_SHEEP("Rabid Sheep", Card.CardColour.GREEN, 6,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.DAMAGE, 6),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.BEASTS, -3)),
    ROCK_STOMPERS("Rock Stompers", Card.CardColour.GREEN, 11,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.DAMAGE, 8),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.QUARRY, -1)),
    SHADOW_FAERIE("Shadow Faerie", Card.CardColour.GREEN, 6, // NEEDS UNIQUE EFFECT TO PLAY AGAIN
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.TOWER, -2)),
    SLASHER("Slasher", Card.CardColour.GREEN, 5,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.DAMAGE, 6)),
    SPIZZER("Spizzer", Card.CardColour.GREEN, 8), // NEEDS UNIQUE EFFECT FOR CONDITION
    STONE_GIANT("Stone Giant", Card.CardColour.GREEN, 15,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.DAMAGE, 10),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, 4)),
    SUCCUBUS("Succubus", Card.CardColour.GREEN, 14,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.TOWER, -5),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.BEASTS, -8)),
    THIEF("Thief", Card.CardColour.GREEN, 12, // See note in spreadsheet
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.GEMS, -10),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.GEMS, 5),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.BRICKS, -5),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.BRICKS, 3)),
    TOWER_GREMLIN("Tower Gremlin", Card.CardColour.GREEN, 8,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.DAMAGE, 2),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, 4),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 2)),
    TROLL_KEEPER("Troll Keeper", Card.CardColour.GREEN, 7,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.ZOO, 2)),
    UNICORN("Unicorn", Card.CardColour.GREEN, 9), // NEEDS UNIQUE EFFECT FOR CONDITION
    VAMPIRE("Vampire", Card.CardColour.GREEN, 17,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.DAMAGE, 10),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.BEASTS, -5),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.ZOO, -1)),
    WEREWOLF("Werewolf", Card.CardColour.GREEN, 9,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.DAMAGE, 9)),
    BASIC_WALL("Basic Wall", Card.CardColour.RED, 2,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, 3)),
    BIG_WALL("Big Wall", Card.CardColour.RED, 5,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, 6)),
    BRICK_SHORTAGE("Brick Shortage", Card.CardColour.RED, 0,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.BRICKS, -8),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.BRICKS, -8)),
    COLLAPSE("Collapse!", Card.CardColour.RED, 4,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.QUARRY, -1)),
    COPPING_THE_TECH("Copping the Tech", Card.CardColour.RED, 5), // NEEDS UNIQUE EFFECT FOR CONDITION
    CRYSTAL_ROCKS("Crystal Rocks", Card.CardColour.RED, 9,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, 7),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.GEMS, 7)),
    DRAGONS_HEART("Dragon's Heart", Card.CardColour.RED, 24,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, 20),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 8)),
    DWARVEN_MINERS("Dwarven Miners", Card.CardColour.RED, 7,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, 4),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.QUARRY, 1)),
    EARTHQUAKE("Earthquake", Card.CardColour.RED, 0,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.QUARRY, -1),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.QUARRY, -1)),
    FOCUSED_DESIGNS("Focused Designs", Card.CardColour.RED, 15,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, 8),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 5)),
    FORCED_LABOUR("Forced Labour", Card.CardColour.RED, 7,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, 9),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.BEASTS, -5)),
    FOUNDATIONS("Foundations", Card.CardColour.RED, 3), // NEEDS UNIQUE EFFECT FOR CONDITION
    FRIENDLY_TERRAIN("Friendly Terrain", Card.CardColour.RED, 1, // NEEDS UNIQUE EFFECT TO PLAY AGAIN
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, 1)),
    GREAT_WALL("Great Wall", Card.CardColour.RED, 16,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, 15)),
    HARMONIC_ORE("Harmonic Ore", Card.CardColour.RED, 11,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, 6),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 3)),
    INNOVATIONS("Innovations", Card.CardColour.RED, 2,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.QUARRY, 1),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.QUARRY, 1),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.GEMS, 4)),
    LUCKY_CACHE("Lucky Cache", Card.CardColour.RED, 0, // NEEDS UNIQUE EFFECT TO PLAY AGAIN
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.BRICKS, 2),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.GEMS, 2)),
    MINERS("Miners", Card.CardColour.RED, 3,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.QUARRY, 1)),
    MONDO_WALL("Mondo Wall", Card.CardColour.RED, 13,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, 12)),
    MOTHER_LODE("Mother Lode", Card.CardColour.RED, 4), // NEEDS UNIQUE EFFECT FOR CONDITION
    NEW_EQUIPMENT("New Equipment", Card.CardColour.RED, 6,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.QUARRY, 2)),
    PORTCULLIS("Portcullis", Card.CardColour.RED, 9,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, 5),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.ZOO, 1)),
    REINFORCED_WALL("Reinforced Wall", Card.CardColour.RED, 8,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, 8)),
    ROCK_LAUNCHER("Rock Launcher", Card.CardColour.RED, 18,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, 6),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.DAMAGE, 10)),
    SECRET_ROOM("Secret Room", Card.CardColour.RED, 8, // NEEDS UNIQUE EFFECT TO PLAY AGAIN
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.MAGIC, 1)),
    STRIP_MINE("Strip Mine", Card.CardColour.RED, 0,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.QUARRY, -1),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, 10),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.GEMS, 5)),
    STURDY_WALL("Sturdy_Wall", Card.CardColour.RED, 3,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, 4)),
    TREMORS("Tremors", Card.CardColour.RED, 7, // NEEDS UNIQUE EFFECT TO PLAY AGAIN
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_ENEMY, CardEffect.AffectableProperty.WALL, -5),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, -5)),
    WORK_OVERTIME("Work Overtime", Card.CardColour.RED, 2,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, 5),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.GEMS, -6));

    private final String name; // Uninitialized, name of the card
    private final Card.CardColour cardColour; // Uninitialized, colour of the card determines which resource is spent to play it
    private final int cost; // Uninitialized, the amount of resources needed to play the card
    private final ArrayList<CardEffect> effects; // Uninitialized, Array List of card effects

    /**
     * Constructor, initializes the enum options.
     *
     * @param name the name of the card
     * @param colour the colour of the card
     * @param cost the cost of the card
     * @param cardEffects list of effects
     */
    CardList(String name, Card.CardColour colour, int cost, CardEffect... cardEffects) {
        this.name = name; // Initialize the name
        this.cardColour = colour; // Initialize the colour
        this.cost = cost; // Initialize the cost

        this.effects = new ArrayList<>(); // Initialize the effect Array List
        Collections.addAll(this.effects, cardEffects);
    }

    /**
     * Returns the name of the card
     *
     * @return the card's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the colour of the card
     *
     * @return the card's colour
     */
    public Card.CardColour getCardColour() {
        return cardColour;
    }

    /**
     * Returns the cost of the card
     *
     * @return the card's cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * Returns the list of the card's effects
     * @return the Array List of card effects
     */
    public ArrayList<CardEffect> getAllEffects() {
        return effects;
    }
}