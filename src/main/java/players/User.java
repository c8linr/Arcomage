package players;

import conditions.StartCondition;

/**
 * @author Caitlin Ross
 * Project: Arcomage, a minigame from 3DO's Might and Magic VII: For Blood and Honor
 * @version 1.0, 04/01/22
 */

public class User extends Player {
    public User(StartCondition startCond) {
        super(startCond);
    }

    @Override
    public void takeTurn() {
        super.drawCard();
        // TODO: implement user turn
    }
}