/**
 * Created by Tom on 22/03/2016.
 */
import java.util.Arrays;
public class RandomCodeGen {

        public ColouredPeg[] getCode(Boolean easy) {


            /*ColouredPeg Y = new ColouredPeg(PegColour.Y);
            ColouredPeg R = new ColouredPeg(PegColour.R);
            ColouredPeg B = new ColouredPeg(PegColour.B);
            ColouredPeg Y2 = new ColouredPeg(PegColour.Y);
            ColouredPeg[] myCode = {Y, R, B, Y2};

            if (easy) {
                System.out.println(myCode[0].getColour());
                System.out.println(myCode[1].getColour());
                System.out.println(myCode[2].getColour());
                System.out.println(myCode[3].getColour());
            }*/



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


