package cards;

import java.util.ArrayList;
import java.util.Collections;

public enum CardList {
    AMETHYST("Amethyst", Card.BLUE_CARD, 2,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 3)),
    CRUMBLESTONE("Crumblestone", Card.BLUE_CARD, 7,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 5),
            new CardEffect(CardEffect.AffectablePlayer.ENEMY_PLAYER, CardEffect.AffectableProperty.BRICKS, -6)),
    CRYSTALLIZE("Crystallize", Card.BLUE_CARD, 8,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 11),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, -6)),
    CRYSTAL_MATRIX("Crystal Matrix", Card.BLUE_CARD, 6,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.MAGIC, 1),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 3),
            new CardEffect(CardEffect.AffectablePlayer.ENEMY_PLAYER, CardEffect.AffectableProperty.TOWER, 1)),
    CRYSTAL_SHIELD("Crystal Shield", Card.BLUE_CARD, 12,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 8),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, 3)),
    DIAMOND("Diamond", Card.BLUE_CARD, 16,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 15)),
    DISCORD("Discord", Card.BLUE_CARD, 5,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, -7),
            new CardEffect(CardEffect.AffectablePlayer.ENEMY_PLAYER, CardEffect.AffectableProperty.TOWER, -7),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.MAGIC, -1),
            new CardEffect(CardEffect.AffectablePlayer.ENEMY_PLAYER, CardEffect.AffectableProperty.MAGIC, -1)),
    DRAGONS_EYE("Dragon's Eye", Card.BLUE_CARD, 21,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 20)),
    EMERALD("Emerald", Card.BLUE_CARD, 6,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 8)),
    EMPATHY_GEM("Empathy Gem", Card.BLUE_CARD, 14,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 8),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.ZOO, 1)),
    FIRE_RUBY("Fire Ruby", Card.BLUE_CARD, 13,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 6),
            new CardEffect(CardEffect.AffectablePlayer.ENEMY_PLAYER, CardEffect.AffectableProperty.TOWER, -4)),
    GEM_SPEAR("Gem Spear", Card.BLUE_CARD, 4,
            new CardEffect(CardEffect.AffectablePlayer.ENEMY_PLAYER, CardEffect.AffectableProperty.TOWER, -5)),
    GEMSTONE_FLAW("Gemstone Flaw", Card.BLUE_CARD, 2,
            new CardEffect(CardEffect.AffectablePlayer.ENEMY_PLAYER, CardEffect.AffectableProperty.TOWER, -3)),
    HARMONIC_VIBE("Harmonic Vibe", Card.BLUE_CARD, 7,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.MAGIC, 1),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 3),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, 3)),
    LAVA_JEWEL("Lava Jewel", Card.BLUE_CARD, 17,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 12),
            new CardEffect(CardEffect.AffectablePlayer.ENEMY_PLAYER, CardEffect.AffectableProperty.TOWER, -6)),
    LODESTONE("Lodestone", Card.BLUE_CARD, 5, // NEEDS UNIQUE EFFECT TO PREVENT DISCARD
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 3)),
    PARITY("Parity", Card.BLUE_CARD, 7), // NEEDS UNIQUE EFFECT TO FIND HIGHEST PLAYERS MAGIC
    PEARL_OF_WISDOM("Pearl of Wisdom", Card.BLUE_CARD, 9,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 5),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.MAGIC, 1)),
    POWER_BURN("Power Burn", Card.BLUE_CARD, 3,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, -5),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.MAGIC, 2)),
    PRISM("Prism", Card.BLUE_CARD, 2), // NEEDS UNIQUE EFFECT TO DRAW, DISCARD, PLAY AGAIN
    QUARRYS_HELP("Quarry's Help", Card.BLUE_CARD, 4,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 7),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.BRICKS, -10)),
    QUARTZ("Quartz", Card.BLUE_CARD, 1, // NEEDS UNIQUE EFFECT TO PLAY AGAIN
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 1)),
    RUBY("Ruby", Card.BLUE_CARD, 3,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 5)),
    SANCTUARY("Sanctuary", Card.BLUE_CARD, 15,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 10),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.WALL, 5),
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.BEASTS, 5)),
    SAPPHIRE("Sapphire", Card.BLUE_CARD, 10,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 11)),
    SHATTERER("Shatterer", Card.BLUE_CARD, 8,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.MAGIC, -1),
            new CardEffect(CardEffect.AffectablePlayer.ENEMY_PLAYER, CardEffect.AffectableProperty.TOWER, -9)),
    SMOKY_QUARTZ("Smoky Quartz", Card.BLUE_CARD, 2, // NEEDS UNIQUE EFFECT TO PLAY AGAIN
            new CardEffect(CardEffect.AffectablePlayer.ENEMY_PLAYER, CardEffect.AffectableProperty.TOWER, -1)),
    SOLAR_FLARE("Solar Flare", Card.BLUE_CARD, 4,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.TOWER, 2),
            new CardEffect(CardEffect.AffectablePlayer.ENEMY_PLAYER, CardEffect.AffectableProperty.TOWER, -2)),
    SPELL_WEAVERS("Spell Weavers", Card.BLUE_CARD, 3,
            new CardEffect(CardEffect.AffectablePlayer.CURRENT_PLAYER, CardEffect.AffectableProperty.MAGIC, 1)),
    CORROSION_CLOUD("Corrosion Cloud", Card.GREEN_CARD, 11),
    DRAGON("Dragon", Card.GREEN_CARD, 25),
    DWARVES("Dwarves", Card.GREEN_CARD, 5),
    ELVEN_ARCHERS("Elven Archers", Card.GREEN_CARD, 10),
    ELVEN_SCOUT("Elven Scout", Card.GREEN_CARD, 2),
    FAERIE("Faerie", Card.GREEN_CARD, 1),
    FULL_MOON("Full Moon", Card.GREEN_CARD, 0),
    GOBLIN_ARCHERS("Goblin Archers", Card.GREEN_CARD, 4),
    GOBLIN_MOB("Goblin Mob", Card.GREEN_CARD, 3),
    HUSBANDRY("Husbandry", Card.GREEN_CARD, 3),
    IMP("Imp", Card.GREEN_CARD, 5),
    LITTLE_SNAKES("Little Snakes", Card.GREEN_CARD, 6),
    MAD_COW_DISEASE("Mad Cow Disease", Card.GREEN_CARD, 0),
    MOODY_GOBLINS("Moody Goblins", Card.GREEN_CARD, 1),
    OGRE("Ogre", Card.GREEN_CARD, 6),
    ORC("Orc", Card.GREEN_CARD, 3),
    RABID_SHEEP("Rabid Sheep", Card.GREEN_CARD, 6),
    ROCK_STOMPERS("Rock Stompers", Card.GREEN_CARD, 11),
    SHADOW_FAERIE("Shadow Faerie", Card.GREEN_CARD, 6),
    SLASHER("Slasher", Card.GREEN_CARD, 5),
    SPIZZER("Spizzer", Card.GREEN_CARD, 8),
    STONE_GIANT("Stone Giant", Card.GREEN_CARD, 15),
    SUCCUBUS("Succubus", Card.GREEN_CARD, 14),
    THIEF("Thief", Card.GREEN_CARD, 12),
    TOWER_GREMLIN("Tower Gremlin", Card.GREEN_CARD, 8),
    TROLL_KEEPER("Troll Keeper", Card.GREEN_CARD, 7),
    UNICORN("Unicorn", Card.GREEN_CARD, 9),
    VAMPIRE("Vampire", Card.GREEN_CARD, 17),
    WEREWOLF("Werewolf", Card.GREEN_CARD, 9),
    BASIC_WALL("Basic Wall", Card.RED_CARD, 2),
    BIG_WALL("Big Wall", Card.RED_CARD, 5),
    BRICK_SHORTAGE("Brick Shortage", Card.RED_CARD, 0),
    COLLAPSE("Collapse!", Card.RED_CARD, 4),
    COPPING_THE_TECH("Copping the Tech", Card.RED_CARD, 5),
    CRYSTAL_ROCKS("Crystal Rocks", Card.RED_CARD, 9),
    DRAGONS_HEART("Dragon's Heart", Card.RED_CARD, 24),
    DWARVEN_MINERS("Dwarven Miners", Card.RED_CARD, 7),
    EARTHQUAKE("Earthquake", Card.RED_CARD, 0),
    FOCUSED_DESIGNS("Focused Designs", Card.RED_CARD, 15),
    FORCED_LABOUR("Forced Labour", Card.RED_CARD, 7),
    FOUNDATIONS("Foundations", Card.RED_CARD, 3),
    FRIENDLY_TERRAIN("Friendly Terrain", Card.RED_CARD, 1),
    GREAT_WALL("Great Wall", Card.RED_CARD, 16),
    HARMONIC_ORE("Harmonic Ore", Card.RED_CARD, 11),
    INNOVATIONS("Innovations", Card.RED_CARD, 2),
    LUCKY_CACHE("Lucky Cache", Card.RED_CARD, 0),
    MINERS("Miners", Card.RED_CARD, 3),
    MONDO_WALL("Mondo Wall", Card.RED_CARD, 13),
    MOTHER_LODE("Mother Lode", Card.RED_CARD, 4),
    NEW_EQUIPMENT("New Equipment", Card.RED_CARD, 6),
    PORTCULLIS("Portcullis", Card.RED_CARD, 9),
    REINFORCED_WALL("Reinforced Wall", Card.RED_CARD, 8),
    ROCK_LAUNCHER("Rock Launcher", Card.RED_CARD, 18),
    SECRET_ROOM("Secret Room", Card.RED_CARD, 8),
    STRIP_MINE("Strip Mine", Card.RED_CARD, 0),
    STURDY_WALL("Sturdy_Wall", Card.RED_CARD, 3),
    TREMORS("Tremors", Card.RED_CARD, 7),
    WORK_OVERTIME("Work Overtime", Card.RED_CARD, 2);

    private final String name;
    private final String cardColour;
    private final int cost;
    private final ArrayList<CardEffect> effects;

    CardList(String name, String colour, int cost, CardEffect... cardEffects) {
        this.name = name;
        this.cardColour = colour;
        this.cost = cost;

        this.effects = new ArrayList<>();
        Collections.addAll(this.effects, cardEffects);
    }

    public String getName() {
        return name;
    }
    public String getCardColour() {
        return cardColour;
    }
    public int getCost() {
        return cost;
    }
    public ArrayList<CardEffect> getAllEffects() {
        return effects;
    }
}