import org.springframework.beans.factory.*;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext.*;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MastermindDriver {


    // Example - change as you need to...
    public static void main(String[] args) {

        // Spring Bean Container, get beans here
        BeanFactory diffFact = new FileSystemXmlApplicationContext("/cw-two/src/diffBean.xml");

        Difficulty d = (Difficulty) diffFact.getBean("difficulty");
        Boolean setMode = d.mode();

        Factory beanFactory = new Factory();
        beanFactory.getInstance(setMode).runGames();


    }
}