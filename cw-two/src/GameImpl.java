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

        Boolean tryAgain = false;
        int blackPegNum = 0;
        int whitePegNum = 0;
        int guessesLeft = 12;
        RandomCodeGen x = new RandomCodeGen();
        ColouredPeg[] randomPegs = x.getCode();

        while (guessesLeft > 0) {
            Boolean errorChecked = false;
            if (tooEasy) {
                x.printGen(randomPegs);
            }

            ColouredPeg[] myPegArray = new ColouredPeg[4];
            //MyUserInput z = new MyUserInput();
            //String testLine = z.userInput().toUpperCase();

            MyUserInput z;
            String testLine;

            do {
                errorChecked = true;
                z = new MyUserInput();
                testLine = z.userInput().toUpperCase();

                if (testLine.length() != 4) {
                    errorChecked = false;
                } else {


                    for (int i = 0; i < 4; i++) {
                        ColouredPeg aPeg = z.pegMaker(testLine.substring(i, i + 1));
                        if (aPeg == null) {
                            System.out.println("Invalid character '" + testLine.substring(i, i + 1) +"' . Please re-enter.");
                            errorChecked = false;
                            //z = new MyUserInput();
                            //testLine = z.userInput().toUpperCase();

                        }
                    }
                }

            }while (!errorChecked);






            for (int i = 0; i < 4; i++) {
                ColouredPeg aPeg = z.pegMaker(testLine.substring(i,i+1));
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
                        if (randomPegs[j].getChecked() == false && myPegArray[i].getColour() == randomPegs[j].getColour()
                                && myPegArray[i].getChecked() == false) {
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

