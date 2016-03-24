/**
 * Created by Tom on 24/03/2016.
 */

import java.util.Scanner;

public class Difficulty {

    public Boolean mode () {
        System.out.println("Run in easy mode? y/n");
        Scanner myScan = new Scanner(System.in);
        String myString = myScan.next().toLowerCase();
        //System.out.println("Your string is: " + myString);
        if (myString.equals("y") || myString.equals("yes")) {
            //System.out.println("Set to true!");
            return true;
        } else {
            //System.out.println("Set to false!");
            return false;
        }
    }

}
