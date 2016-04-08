/**
 * Created by Tom on 25/03/2016.
 */

import org.junit.*;

import static org.junit.Assert.*;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.util.Arrays;


public class MastermindTests {

    private ColouredPeg myPeg;
    private PegMaker myMaker;
    private ColouredPeg madePeg;
    private MastermindDriver testDrive;
    private Difficulty myDiff;
    private ErrorChecker myCheck;
    private MyUserInput myInput;
    private RandomCodeGen myCodegen;
    private Results myResults;
    private String inputString = "";
    private Boolean truefeedBack = true;
    private Boolean falsefeedBack = false;
    private Boolean feedBack1;
    private Boolean feedBack2;
    private String yes = "y";
    private String no = "n";
    private String correctInput = "BBBB";
    private ByteArrayInputStream in;
    private int arrayLength = 4;
    private ColouredPeg[] myPegArray;
    private ColouredPeg[] altPegArray = new ColouredPeg[4];
    private ColouredPeg arrayPeg1;
    private ColouredPeg arrayPeg2;
    private String input;

    @Before
    public void buildUp() {
        testDrive = new MastermindDriver();
        //Factory myFactory = new Factory();
        //Game myGame = myFactory.getInstance(Game.class, true);
        myPeg = new ColouredPeg(PegColour.B);
        myMaker = new PegMaker();
        madePeg = myMaker.makePeg("B");
        myInput = new MyUserInput();
        //inputString = myInput.userInput();
        myResults = new Results();
        feedBack1 = myResults.getResults(4, 4, 0, 1);
        feedBack2 = myResults.getResults(4, 3, 2, 1);
        arrayPeg1 = new ColouredPeg(PegColour.B);
        arrayPeg2 = new ColouredPeg(PegColour.B);
        altPegArray[0] = myPeg;
        altPegArray[1] = madePeg;
        altPegArray[2] = arrayPeg1;
        altPegArray[3] = arrayPeg2;
        myInput = new MyUserInput();
    }
    @Test
    public void pegMakerTest() {
        assertEquals(myPeg.getColour(), madePeg.getColour());
    }
    @Test
    public void resultsTest() {
        assertEquals(feedBack1, truefeedBack);
        assertEquals(feedBack2, falsefeedBack);
    }
    @Test
    public void colouredPegTest() {
        Boolean pegCheck = myPeg.getChecked();
        myPeg.setChecked(truefeedBack);
        Boolean truePegCheck = myPeg.getChecked();
        assertEquals(pegCheck, falsefeedBack);
        assertEquals(truePegCheck, truefeedBack);
    }
    @Test
    public void difficultyTest() {
        in = new ByteArrayInputStream(yes.getBytes());
        System.setIn(in);
        myDiff = new Difficulty();
        Boolean selectYes = myDiff.mode();
        assertEquals(true, selectYes);
        in = new ByteArrayInputStream(no.getBytes());
        System.setIn(in);
        Boolean selectNo = myDiff.mode();
        assertEquals(false, selectNo);
    }
    @Test
    public void errorcheckTest() {
        in = new ByteArrayInputStream(correctInput.getBytes());
        System.setIn(in);
        myCheck = new ErrorChecker();
        myPegArray = myCheck.checkedPegArray(arrayLength);
        assertEquals(myPegArray[0].getColour(), altPegArray[0].getColour());
        assertEquals(myPegArray[1].getColour(), altPegArray[1].getColour());
        assertEquals(myPegArray[2].getColour(), altPegArray[2].getColour());
        assertEquals(myPegArray[3].getColour(), altPegArray[3].getColour());
    }
    @Test
    public void myInputTest() {
        in = new ByteArrayInputStream(correctInput.getBytes());
        System.setIn(in);
        input = myInput.userInput();
        assertEquals(input, correctInput);
    }
    @After
    public void cleanUp() {
        myPeg = null;
        madePeg = null;
        myInput = null;
        inputString = null;
        myResults = null;
        feedBack1 = null;
        feedBack2 = null;
    }
}