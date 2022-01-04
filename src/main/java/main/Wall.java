package main;

import conditions.StartCondition;

/**
 * @author Caitlin Ross
 * Project: Arcomage, a minigame from 3DO's Might and Magic VII: For Blood and Honor
 * @version 1.0, 04/01/22
 */

public class Wall {
    private int height;

    public Wall(StartCondition startCondition) {
        height = startCondition.getStartingWall();
    }

    public int getHeight() {
        return height;
    }

    public void increaseHeight(int increase) {
        height += increase;
    }

    public void decreaseHeight(int decrease) {
        height -= decrease;
        if (height <= 0) {
            height = 0;
        }
    }

    public void draw() {
        // TODO implement Wall.draw() method
    }
}