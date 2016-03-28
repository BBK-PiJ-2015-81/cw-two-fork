import org.springframework.beans.factory.*;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext.*;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MastermindDriver {

    // Example - change as you need to...
    public static void main(String[] args) {
        // Spring Bean Container, get beans here
        BeanFactory factory = new FileSystemXmlApplicationContext("/cw-two/src/gameBean.xml");

// Call method from bean
        GameImpl g = (GameImpl)factory.getBean("easyBean");
        g.runGames();
        /*Difficulty setLevel = new Difficulty();
        Boolean setMode = setLevel.mode();

       Game g = Factory.getInstance(Game.class, setMode);
        g.runGames();*/
    }
}