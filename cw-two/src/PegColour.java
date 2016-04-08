/**
 * Created by Tom on 22/03/2016.
 */


import java.util.Arrays;
import java.util.Random;
import java.util.List;
//defines colours. Feel free to add!
public enum PegColour {
    //Blue
    B,
    //Green
    G,
    //Orange
    O,
    //Purple
    P,
    //Red
    R,
    //Yellow
    Y;
    //Turquoise
    //T;


    private static List<PegColour> VALUES = Arrays.asList(values());
    private static int SIZE = VALUES.size();
    private static Random RANDOM = new Random();

    public static PegColour randomPegColour()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

}
