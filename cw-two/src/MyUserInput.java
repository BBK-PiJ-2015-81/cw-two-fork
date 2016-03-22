/**
 * Created by Tom on 22/03/2016.
 */
import java.util.Scanner;
public class MyUserInput {
    public String userInput() {
        System.out.println("Please enter the first peg:");
        Scanner myScan = new Scanner(System.in);
        String myString = myScan.next();
        return myString;
    }

    public PegColour pegConverter(String myInput) {
        switch(myInput) {
            case "B":
                return PegColour.B;
            case "G":
                return PegColour.G;
            case "O":
                return PegColour.O;
            case "P":
                return PegColour.P;
            case "R":
                return PegColour.R;
            case "Y":
                return PegColour.Y;
            default:
                return null;
        }
    }
}
