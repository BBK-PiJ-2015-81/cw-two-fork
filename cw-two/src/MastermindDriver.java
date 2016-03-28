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

        Difficulty d = (Difficulty) factory.getBean("difficulty");
        Boolean setMode = d.mode();

        // Call method from bean
        if (setMode) {
            Game g = (GameImpl) factory.getBean("easyBean");
            g.runGames();
        } else {
            Game g = (GameImpl) factory.getBean("hardBean");
            g.runGames();
        }
    }
}