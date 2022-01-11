package conditions;

import players.Player;

/**
 * @author Caitlin Ross
 * Project: Arcomage, a minigame from 3DO's Might and Magic VII: For Blood and Honor
 * @version 1.0, 04/01/22
 */

public class LoseCondition {
    // Lose condition is the same no matter what

    public static boolean checkPlayerLoss(Player p) {
        return (p.getTowerHeight() <= 0);
    }
}