import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Factory {

    public static Game getInstance(Boolean b) {

        if (b) {
            BeanFactory beanFact = new FileSystemXmlApplicationContext("/cw-two/src/easyBean.xml");
            Game g = (GameImpl) beanFact.getBean("easyBean");
            return g;

        } else {
            BeanFactory beanFact = new FileSystemXmlApplicationContext("/cw-two/src/hardBean.xml");
            Game g = (GameImpl) beanFact.getBean("hardBean");
            return g;
        }

    }
}
