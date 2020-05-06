package xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("xml/beanScope-applicationContext.xml");

        Coach coach = context.getBean("myCoach", Coach.class);
        Coach coach2 = context.getBean("myCoach", Coach.class);

        System.out.println("Same objects: " + (coach==coach2));
        System.out.println("coach: " + coach);
        System.out.println("coach2: " + coach2);

        context.close();
    }
}
