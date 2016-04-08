/**
 * Created by Tom on 25/03/2016.
 */
public class ErrorChecker {

    public ColouredPeg[] checkedPegArray(int arrayLength) {
        MyUserInput textInput;
        String userString;
        PegMaker myPegMaker;
        Boolean errorChecked;
        ColouredPeg[] myPegArray = new ColouredPeg[arrayLength];

        do {
            errorChecked = true;
            textInput = new MyUserInput();
            userString = textInput.userInput().toUpperCase();
            myPegMaker = new PegMaker();
        if (userString.length() != arrayLength) {
            errorChecked = false;
        } else {


            for (int i = 0; i < arrayLength; i++) {
                ColouredPeg aPeg = myPegMaker.makePeg(userString.substring(i, i + 1));
                myPegArray[i] = aPeg;
                if (aPeg == null) {
                    System.out.println("Invalid character '" + userString.substring(i, i + 1) +"' . Please re-enter.");
                    errorChecked = false;
                }
            }
        }

    }while (!errorChecked);
        return myPegArray;
    }
}
