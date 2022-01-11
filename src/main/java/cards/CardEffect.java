package cards;

public class CardEffect {
    private AffectablePlayer playerAffected;
    private AffectableProperty thingAffected;
    private int amountAffectedBy;

    public CardEffect(AffectablePlayer player, AffectableProperty thing, int amount) {
        playerAffected = player;
        thingAffected = thing;
        amountAffectedBy = amount;
    }

    public enum AffectablePlayer {
        ENEMY_PLAYER("Enemy"),
        CURRENT_PLAYER("Current Player");

        private final String name;

        AffectablePlayer(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public enum AffectableProperty {
        TOWER("Tower"),
        WALL("Wall"),
        QUARRY("Quarry"),
        BRICKS("Bricks"),
        MAGIC("Magic"),
        GEMS("Gems"),
        ZOO("Zoo"),
        BEASTS("Beasts");

        private final String name;

        AffectableProperty(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
