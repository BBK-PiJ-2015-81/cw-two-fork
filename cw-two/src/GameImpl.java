/**
 * Created by Tom on 22/03/2016.
 */
public class GameImpl  extends GameAbstractImpl {

    //private boolean tooEasy;

    public GameImpl(boolean easy) {
        //System.out.println("The value of easy is: " + easy);
        super(easy);
        //System.out.println("The value of easy is: " + easy);
        //this.tooEasy = easy;
        //this.tooEasy = true;
        //System.out.println("The value of easy is: " + super.showCode);
    }

    public void runGames() {
        //Defines number of pegs and guesses. Feel free to edit!
        int pegNumber = 4;
        int blackPegNum = 0;
        int whitePegNum = 0;
        int guessesLeft = 12;
        RandomCodeGen secretCode = new RandomCodeGen();
        ColouredPeg[] randomPegs = secretCode.getCode();

        while (guessesLeft > 0) {
            if (super.showCode) {
                secretCode.printGen(randomPegs);
            }

            ErrorChecker myChecker = new ErrorChecker();

            ColouredPeg[] myPegArray = myChecker.checkedPegArray(pegNumber);


            //Compares user pegs with randomly generated pegs.
            //Calculates black and white feedback pegs.

            for (int i = 0; i < pegNumber; i++) {
                if (myPegArray[i].getColour() == randomPegs[i].getColour()) {
                    blackPegNum++;
                    myPegArray[i].setChecked(true);
                    randomPegs[i].setChecked(true);
                }
            }

            for (int i = 0; i < pegNumber; i++) {
                if (myPegArray[i].getChecked() == false) {
                    for (int j = 0; j < pegNumber; j++) {
                        if (randomPegs[j].getChecked() == false && myPegArray[i].getColour() == randomPegs[j].getColour()
                                && myPegArray[i].getChecked() == false) {
                            whitePegNum++;
                            myPegArray[i].setChecked(true);
                            randomPegs[j].setChecked(true);
                        }
                    }
                }
            }

            //Output of results.
                Results playerResult = new Results();
                Boolean winLose = playerResult.getResults(pegNumber, blackPegNum, whitePegNum, guessesLeft - 1);

            if (winLose) {
                break;
            } else {
                // Reset feedback pegs
                guessesLeft --;
                blackPegNum = 0;
                whitePegNum = 0;

                for (int i = 0; i < pegNumber; i++) {
                    myPegArray[i].setChecked(false);
                    randomPegs[i].setChecked(false);
                }
            }
        }
        System.out.println("GAME OVER");
        if (guessesLeft == 0) {
            secretCode.printLost(randomPegs);
        }
    }
}

