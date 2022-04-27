package cards;

/**
 * The CardEffect class represents an effect a card can have, such as damaging the enemy or increasing a resource.
 *
 * @author Caitlin Ross
 * @version 1.0
 * @since 2022-04-27
 */
public class CardEffect {
    private final AffectablePlayer playerAffected; // Uninitialized, the player affected (current or enemy)
    private final AffectableProperty propertyAffected; // Uninitialized, the property affected, such as a resource, wall, or tower
    private final int amountAffectedBy; // Uninitialized, the magnitude of the effect

    /**
     * Constructor, initializes the CardEffect object.
     *
     * @param player the player affected
     * @param property the property affected
     * @param amount the magnitude of the effect
     */
    public CardEffect(AffectablePlayer player, AffectableProperty property, int amount) {
        playerAffected = player; // Initialize which player is affected
        propertyAffected = property; // Initialize which property is affected
        amountAffectedBy = amount; // Initialize the magnitude of the effect
    }

    /**
     * Enum representing the possible players that a card can affect.
     */
    public enum AffectablePlayer {
        CURRENT_ENEMY(), CURRENT_PLAYER();
    }

    /**
     * Enum representing the possible properties that a card can affect.
     */
    public enum AffectableProperty {
        TOWER(), WALL(),
        DAMAGE(), // This value is usually POSITIVE, unlike direct Tower damage or other negative effects!
        QUARRY(), BRICKS(),
        MAGIC(), GEMS(),
        ZOO(), BEASTS();
    }
}
