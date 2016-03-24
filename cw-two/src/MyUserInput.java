/**
 * Created by Tom on 22/03/2016.
 */
import java.util.Scanner;
public class MyUserInput {
    public String userInput() {
        System.out.println("Please enter four pegs:");
        Scanner myScan = new Scanner(System.in);
        String myString = myScan.next();
        return myString;
    }

    public ColouredPeg pegMaker(String myInput) {
        switch(myInput) {
            case "B":
                return new ColouredPeg(PegColour.B);
            case "G":
                return new ColouredPeg(PegColour.G);
            case "O":
                return new ColouredPeg(PegColour.O);
            case "P":
               return new ColouredPeg(PegColour.P);
            case "R":
                return new ColouredPeg(PegColour.R);
            case "Y":
                return new ColouredPeg(PegColour.Y);
            default:
                return null;
        }
    }

   /* public ColouredPeg[] userArraybuilder(ColouredPeg First, ColouredPeg Second, ColouredPeg Third, ColouredPeg Fourth) {
        ColouredPeg[] myPegArray = {First, Second, Third, Fourth};
        return myPegArray;
   }*/
}
