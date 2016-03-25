/**
 * Created by Tom on 25/03/2016.
 */
public class Results {

    public Boolean getResults(int pegNumber, int blackPegNum, int whitePegNum, int guessesLeft) {
        if (blackPegNum == pegNumber) {
            System.out.println("You have won the game!");
            return true;
        } else {

            System.out.println("There are " + blackPegNum + " black pegs.");
            System.out.println("There are " + whitePegNum + " white pegs.");
            System.out.println("You have " + guessesLeft + " guesses remaining.");

          return false;
        }
    }
}
