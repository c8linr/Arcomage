package conditions;

import main.Player;

/**
 * @author Caitlin Ross
 * Project: Arcomage, a minigame from 3DO's Might and Magic VII: For Blood and Honor
 * @version 1.0, 04/01/22
 */

public class LoseCondition {
    // No need to initialize a tower value or resource value
    public boolean checkPlayerLose(Player p) {
        return (p.getTowerHeight() <= 0);
    }
}