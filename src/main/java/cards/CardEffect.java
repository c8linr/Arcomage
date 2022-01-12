package cards;

public class CardEffect {
    private final AffectablePlayer playerAffected;
    private final AffectableProperty thingAffected;
    private final int amountAffectedBy;

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
        DAMAGE("Damage"), // This value is usually POSITIVE, unlike direct Tower damage or other negative effects!
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
