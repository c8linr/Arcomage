package main;

import conditions.StartCondition;
import conditions.WinCondition;
import player.Enemy;
import player.User;

/**
 * Arcomage is a minigame from 3DO's Might and Magic VII: For Blood and Honor.
 *
 * @author Caitlin Ross
 * @version 1.0
 * @since 2022-04-27
 */
public class Arcomage {
    private StartCondition startCondition; // Uninitialized, determines the starting resources
    private WinCondition winCondition; // Uninitialized, determines the winning conditions
    private User userPlayer; // Uninitialized, the user
    private Enemy enemyPlayer; // Uninitialized, the enemy (computer-controlled)

    /**
     * No-arg constructor, initializes the game conditions and players
     */
    public Arcomage() {
        startCondition = new StartCondition(); // Initialize the starting conditions
        winCondition = new WinCondition(); // Initialize the win conditions
        userPlayer = new User(startCondition); // Initialize the user, passing in the start conditions
        enemyPlayer = new Enemy(startCondition); // Initialize the enemy, passing in the start conditions
    }

    /**
     * Main method, entrance point for the game
     *
     * @param args unused
     */
    public static void main(String[] args) {
        // TODO: start the game
    }
}