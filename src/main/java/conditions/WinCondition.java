package conditions;
import players.Player;
import main.Resources;

/**
 * @author Caitlin Ross
 * Project: Arcomage, a minigame from 3DO's Might and Magic VII: For Blood and Honor
 * @version 1.0, 04/01/22
 */

public class WinCondition {
    private int towerValue;
    private int resourceValue;

    public WinCondition() {
        // For now, I'm just using a generic win condition. Later I'll implement the different options
        towerValue = 50;
        resourceValue = 200;
    }

    public boolean checkPlayerWin(Player p) {
        return ((p.getTowerHeight() >= towerValue) || (checkResources(p.getPlayerResources())));
    }

    private boolean checkResources(Resources r) {
        return ((r.getQuarry() >= resourceValue) || (r.getMagic() >= resourceValue) || (r.getZoo() >= resourceValue));
    }
}
