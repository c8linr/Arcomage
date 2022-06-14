package cards;

/**
 * The ConditionalCardEffect class represents a conditional effect a card can have and its results.
 *
 * @author Caitlin Ross
 * @version 1.0
 * @since 2022-06-14
 */
public class ConditionalCardEffect extends CardEffect {
    private final CheckableProperty checkProperty;
    private final PropertyOwner propertyOwner;
    private final Operator operator;
    private final StandardCardEffect trueResult;
    private final StandardCardEffect falseResult;

    /**
     * Constructor, initializes the ConditionalCardEffect object.
     * @param checkProperty
     * @param propertyOwner
     * @param operator
     */
    public ConditionalCardEffect(CheckableProperty checkProperty, PropertyOwner propertyOwner, Operator operator,
                                 StandardCardEffect trueResult, StandardCardEffect falseResult) {
        this.checkProperty = checkProperty;
        this.propertyOwner = propertyOwner;
        this.operator = operator;
        this.trueResult = trueResult;
        this.falseResult = falseResult;
    }

    /**
     * Enum representing the possible operators used in the condition.
     */
    public enum Operator {
        GREATER_THAN, LESS_THAN, EQUALS;
    }

    /**
     * Enum representing the possible properties that can be checked in the condition.
     */
    public enum CheckableProperty {
        // Using an enum to prevent spelling errors, case errors, etc. elsewhere in the code
        TOWER(), WALL(),
        QUARRY(), BRICKS(),
        MAGIC(), GEMS(),
        ZOO(), BEASTS();
    }

    /**
     * Enum representing which player owns the property that is being checked by the condition.
     */
    public enum PropertyOwner {
        // Using an enum to prevent spelling errors, case errors, etc. elsewhere in the code
        CURRENT_ENEMY(), CURRENT_PLAYER();
    }
}