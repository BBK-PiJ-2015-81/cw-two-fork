/**
 * Created by Tom on 22/03/2016.
 */
import java.util.Arrays;
public class TestScript {


    public static void main(String[] args) {
        int blackPegNum = 0;
        int whitePegNum = 0;
        RandomCodeGen x = new RandomCodeGen();
        ColouredPeg[] randomPegs = x.getCode();
        //PegColour[] myPeg = new PegColour[1];
        MyUserInput z = new MyUserInput();
        ColouredPeg[] myPegArray = new ColouredPeg[4];
        for (int i = 0; i < 4; i++) {
            String testLine = z.userInput();
            ColouredPeg aPeg = z.pegMaker(testLine);
            myPegArray[i] = aPeg;
            System.out.println("You have entered: " + myPegArray[i].getColour());
        }
        //System.out.println(myPegArray[0].getColour());

        for (int i = 0; i < 4; i++) {
            if (myPegArray[i].getColour() == randomPegs[i].getColour()) {
                blackPegNum++;
            }
        }
        System.out.println("There are " + blackPegNum + " black pegs.");


    }
}
