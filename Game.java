/**
 * 
 * @author Cooper Martin
 * @version Secret Number Game
 * @since 7/20/2022
 */

import java.util.*;

public class Game
{
    private int secretNumber;
    private int tries;
    private int guess;
    
    public Game()
    {
        Random rand = new Random();
        secretNumber = rand.nextInt(10000);
        tries = 0;
        guess = -1;
    }
    
    public int getSecretNumber() { return secretNumber; }
    public int getTries() { return tries; }
    public int getGuess() { return guess; }
    
    public void setGuess(int guess) { this.guess = guess; }
    public void incrementTries() { tries++; }
    
    public void RunGame()
    {
        
    }
    
    public static void main(String[] args)
    {
        Game newGame = new Game();
        newGame.RunGame();
    }
}
