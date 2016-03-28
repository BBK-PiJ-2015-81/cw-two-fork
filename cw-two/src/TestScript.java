/**
 * Created by Tom on 22/03/2016.
 */

public class TestScript {


    public static void main(String[] args) {

        Difficulty setLevel = new Difficulty();
        Boolean setMode = setLevel.mode();



        Game launcher = new GameImpl(setMode);

        launcher.runGames();

    }
}
