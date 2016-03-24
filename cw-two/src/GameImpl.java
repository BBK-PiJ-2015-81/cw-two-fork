/**
 * Created by Tom on 22/03/2016.
 */
public class GameImpl extends GameAbstractImpl {

    private Boolean tooEasy;

    public GameImpl(Boolean easy) {
        super(easy);
        this.tooEasy = easy;
    }

    public void runGames() {

        int blackPegNum = 0;
        int whitePegNum = 0;
        int guessesLeft = 12;
        RandomCodeGen x = new RandomCodeGen();
        ColouredPeg[] randomPegs = x.getCode(tooEasy);

        while (guessesLeft > 0) {

            x.printGen(randomPegs);
            MyUserInput z = new MyUserInput();
            ColouredPeg[] myPegArray = new ColouredPeg[4];
            for (int i = 0; i < 4; i++) {
                String testLine = z.userInput();
                ColouredPeg aPeg = z.pegMaker(testLine);
                myPegArray[i] = aPeg;
                //System.out.println("You have entered: " + myPegArray[i].getColour());
            }
            //System.out.println(myPegArray[0].getColour());

            for (int i = 0; i < 4; i++) {
                if (myPegArray[i].getColour() == randomPegs[i].getColour()) {
                    blackPegNum++;
                    myPegArray[i].setChecked(true);
                    randomPegs[i].setChecked(true);
                }
            }

            for (int i = 0; i < 4; i++) {
                if (myPegArray[i].getChecked() == false) {
                    for (int j = 0; j < 4; j++) {
                        if (randomPegs[j].getChecked() == false && myPegArray[i].getColour() == randomPegs[j].getColour()) {
                            whitePegNum++;
                            myPegArray[i].setChecked(true);
                            randomPegs[j].setChecked(true);
                        }
                    }
                }
            }

            if (blackPegNum == 4) {
                System.out.println("You have won the game!");
                break;
            } else {

                System.out.println("There are " + blackPegNum + " black pegs.");
                System.out.println("There are " + whitePegNum + " white pegs.");
                guessesLeft --;
                System.out.println("You have " + guessesLeft + " guesses remaining.");

                // Reset feedback pegs

                blackPegNum = 0;
                whitePegNum = 0;

                for (int i = 0; i < 4; i++) {
                    myPegArray[i].setChecked(false);
                    randomPegs[i].setChecked(false);
                }
            }

        }
        System.out.println("GAME OVER");
    }
}

