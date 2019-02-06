package addressbook;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {
    public void launch() {
        String[] contextPaths = new String[] {"addressbook/app-context.xml"};
        new ClassPathXmlApplicationContext(contextPaths);
    }
}
