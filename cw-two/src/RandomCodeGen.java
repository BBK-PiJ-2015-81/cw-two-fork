/**
 * Created by Tom on 22/03/2016.
 */
import java.util.Arrays;
public class RandomCodeGen {

        public ColouredPeg[] getCode() {
            ColouredPeg Y = new ColouredPeg(PegColour.randomPegColour());
            ColouredPeg R = new ColouredPeg(PegColour.randomPegColour());
            ColouredPeg B = new ColouredPeg(PegColour.randomPegColour());
            ColouredPeg Y2 = new ColouredPeg(PegColour.randomPegColour());
            ColouredPeg[] myCode = {Y, R, B, Y2};
            return myCode;
        }

        public void printGen(ColouredPeg[] myCode) {
            System.out.print("The secret code is: ");
            System.out.print(myCode[0].getColour());
            System.out.print(myCode[1].getColour());
            System.out.print(myCode[2].getColour());
            System.out.println(myCode[3].getColour());
        }


    }


