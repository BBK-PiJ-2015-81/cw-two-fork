/**
 * Created by Tom on 24/03/2016.
 */

import java.util.Scanner;

public class Difficulty {



    public Boolean mode () {

        Boolean errorChecked = false;

        System.out.println("Run in easy mode? y/n");

        while (!errorChecked) {
            Scanner myScan = new Scanner(System.in);
            String myString = myScan.next().toLowerCase();
            //System.out.println("Your string is: " + myString);
            if (myString.equals("y") || myString.equals("yes")) {
                //System.out.println("Set to true!");
                errorChecked = true;
                return true;
            } else if (myString.equals("n") || myString.equals("no")) {
                //System.out.println("Set to false!");
                errorChecked = true;
                return false;
            } else {
                System.out.println("Please enter yes or no.");
            }
        } return null;
    }

}
