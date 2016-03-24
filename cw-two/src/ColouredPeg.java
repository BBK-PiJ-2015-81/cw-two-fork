/**
 * Created by Tom on 24/03/2016.
 */
public class ColouredPeg {
    private PegColour colour;
    private Boolean checked = false;

    public ColouredPeg(PegColour colour) {
        this.colour = colour;
    }

    public PegColour getColour() {
        return this.colour;
    }

}
