package xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        // load spring config
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("xml/applicationContext.xml");

        // retrieve bean
        Coach cricketCoach = context.getBean("myCricketCoach", Coach.class);

        //use bean
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());

        //close context
        context.close();
    }
}
