package cards;

/**
 * The CardEffect class is a superclass used to allow for lists of various types of effects and contains the edge cases.
 *
 * @author Caitlin Ross
 * @version 1.0
 * @since 2022-06-14
 */
public class CardEffect {
    private final miscEffects otherEffect;

    public CardEffect() {
        otherEffect = null;
    }

    public CardEffect(miscEffects otherEffect) {
        this.otherEffect = otherEffect;
    }

    public enum miscEffects {
        PLAY_AGAIN, CANNOT_DISCARD, DRAW_DISCARD;
    }
}
