/**
 * Created by Tom on 25/03/2016.
 */
public class PegMaker {

    public ColouredPeg makePeg(String myInput) {
        switch (myInput) {
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

}
