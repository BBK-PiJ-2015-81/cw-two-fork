public class Factory {

    public static Game getInstance(Class c, Boolean b) {

        Game newGame = new GameImpl(b);

        return newGame;
    }
}
