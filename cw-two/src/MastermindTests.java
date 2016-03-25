/**
 * Created by Tom on 25/03/2016.
 */

import org.junit.*;

import static org.junit.Assert.*;


public class MastermindTests {

    private ColouredPeg myPeg;
    private PegMaker myMaker;
    private ColouredPeg madePeg;

    @Before
    public void buildUp() {
        //MastermindDriver testDrive = new MastermindDriver();
        //Factory myFactory = new Factory();
        //Game myGame = myFactory.getInstance(Game.class, true);
        myPeg = new ColouredPeg(PegColour.B);
        myMaker = new PegMaker();
        madePeg = myMaker.makePeg("B");
    }
    @Test
    public void pegMakerTest() {
        assertEquals(myPeg.getColour(), madePeg.getColour());
    }
    @After
    public void cleanUp() {


    }
}