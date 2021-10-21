import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class WheelOfFortuneGame {
    private Player player1;
    private Player player2;
    private Player whoseTurn;
    private Scanner scnr;
    private String[] hiddenPhrases;
    private StringBuffer shownPhrase;
    private String hiddenPhrase;
    private int numPhrases;
    private Wheel wheel;

    public WheelOfFortuneGame(int n, String fileName) throws IOException {
        /*The constructor method reads in the puzzles and initializes data fields. It
        calls playMatch(). A match is multiple games. */

        //Read in the text files of puzzles

        //initialize the data fields of WheelOfFortuneGame as necessary


        //randomly determine who goes first

        playMatch();
    }

    public void playMatch() {
        //Keep playing games as long as there are more puzzles to do and the players want to continue

    }

    private boolean isConsonant(char c) {
        return (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u');
    }

    public void play(int n) {
        /*This method is the overview of playing one game. It contains a loop
        for switching between one player's turn and another until the puzzle is
        solved and the game is over. Then execution returns to playMatch after one
        game is played, where the players can say they want to play another match,
        which can be done as long as there are puzzles left.
         */

        //Initialize whatever needs to be reset at the beginning of each game

        //Make a shownPhrase with the same number of characters as the hiddenPhrase

        //Let player 1 and player 2 alternate taking turns until someone solves the puzzle

    }

    public int takeTurn() {
        /*takeTurn represents the turn of one player. It has a loop in it because
        a player can keep guessing letters until they make a mistake, spin a "Bankrupt"
        on the wheel, or spin a "Lose a Turn".
        Tip: Wherever you are in a loop, you can drop out the loop entirely with "return"
        in the cases where this makes sense.
         */

        /*One way to make this work:
        Return 2 from a case below means that the player's turn is not over
        Return 1 means that the player's turn is over
        Return 0 means that the puzzle is solved*/

        /*loop for a player who keeps guessing letters correctly
        {
            spin the wheel

            consider "bankrupt" or "lose a turn" cases

            otherwise allow the player to choose from the three options
                case 1: solveThePuzzle
                case 2: guessAVowel
                case 3: guessAConsonant

                return 0, 1, or 2 to play() as described abovce
         */
        return -1; //this is just a placeholder
    }

    /////////////////////
    public int solveThePuzzle() {
        /*If the player guesses the puzzle correctly, the player gets all the money
        they accumulated so far in this game, and the others win nothing for this game.
        Then a 0 is returned to takeTurn(), meaning that the puzzle has been
        solved; otherwise 1 is returned, meaning that the player's turn is over.*/

        return -1; //this is just a placeholder

    }

    public int guessAVowel(int money) {
        /*If the player doesn't have $250 (in the current game's
        winnings to pay for the vowel, or the player guesses a
        consonant instead of a vowel, or the player guesses a vowel that was
        already guessed, or the player guesses a vowel that's not in the
        puzzle, 1 is returned, meaning the player's turn is over.
        Otherwise the player pays $250 out of this games winnings so far,
        and 2 is returned, meaning that the player's turn continues.
        (No money is awarded for the vowels present in the word.)*/

        return -1; //this is just a placeholder

    }

    public int guessAConsonant(int money) {
        /*If the player guesses a vowel instead of a consonant, or the player guesses a
        consonant that was already guessed or the player guesses a consonant that
        is not in the puzzle, 1 is returned to takeTurn(), meaning the player's turn is over.
        Otherwise, the player gets numInstances * spinValue dollars added
        to their winnings so far for the game, and 2 is returned to takeTurn(), meaning
        that the player's turn continues.*/

        return -1; //this is just a placeholder
    }

    public void initializeShownPhrase() {
        //Initialize shown phase with underscores and blanks
        /*Tip: You might want to use a StringBuffer rather than a String
        for the hiddenPhrase so that you can use the replace method to
        replace a character = ' ' or '_'
         */

    }
}
