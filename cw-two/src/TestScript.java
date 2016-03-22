/**
 * Created by Tom on 22/03/2016.
 */
public class TestScript {
    public static void main(String[] args) {
        RandomCodeGen x = new RandomCodeGen();
        x.getCode();
        PegColour[] myPeg = new PegColour[1];
        MyUserInput z = new MyUserInput();
        String testLine = z.userInput();
        System.out.println(z.pegConverter(testLine));
    }


}
