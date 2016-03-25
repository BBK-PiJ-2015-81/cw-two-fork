public class MastermindDriver {

    // Example - change as you need to...
    public static void main(String[] args) {
        Difficulty setLevel = new Difficulty();
        Boolean setMode = setLevel.mode();

       Game g = Factory.getInstance(Game.class, setMode);
        g.runGames();
    }
}