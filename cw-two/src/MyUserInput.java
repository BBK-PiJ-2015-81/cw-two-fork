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



}
