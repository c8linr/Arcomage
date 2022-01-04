package main;

import conditions.StartCondition;
import conditions.WinCondition;

/**
 * @author Caitlin Ross
 * Project: Arcomage, a minigame from 3DO's Might and Magic VII: For Blood and Honor
 * @version 1.0, 04/01/22
 */

public class Arcomage {
    private StartCondition startCondition;
    private WinCondition winCondition;
    private User userPlayer;
    private Enemy enemyPlayer;

    public Arcomage() {
        startCondition = new StartCondition();
        winCondition = new WinCondition();
        userPlayer = new User();
        enemyPlayer = new Enemy();
    }

    public static void main(String[] args) {
        // TODO: implement main method
    }
}