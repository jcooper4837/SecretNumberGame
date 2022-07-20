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
        secretNumber = rand.nextInt(10000); // initializes with a value 0-9999
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
        Scanner s = new Scanner(System.in);
        int num;
        
        // game loop runs until correct number is guessed
        while (guess != secretNumber)
        {
            System.out.print("Enter a number 0-9999: ");
            num = s.nextInt();
            
            // only count unique consecutive guesses
            if (num != guess)
            {
                guess = num;
                tries++;
            }
            
            if (guess > secretNumber)
            {
                System.out.println(guess + " is too large!");
            }
            else if (guess < secretNumber)
            {
                System.out.println(guess + " is too small!");
            }
            else
            {
                System.out.println(guess + " is correct. You took " + tries + " tries.");
            }
        }
    }
    
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Secret Number Game.");
        System.out.println("Try to guess the secret number in as few tries as possible.");
        
        Scanner s = new Scanner(System.in);
        String replay;
        do {
            Game newGame = new Game();
            newGame.RunGame();
            System.out.print("Enter the number 0 to play again. Enter anything else to quit: ");
            replay = s.next();
        } while (replay.equals("0"));
    }
}
