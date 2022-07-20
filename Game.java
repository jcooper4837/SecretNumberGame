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
    }
    
    public void RunGame()
    {
        
    }
    
    public static void main(String[] args)
    {
        Game newGame = new Game();
        newGame.RunGame();
    }
}