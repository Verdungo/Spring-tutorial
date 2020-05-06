package xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {
        // load spring config
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("xml/applicationContext.xml");

        // retrieve bean
        Coach coach = context.getBean("myCoach", Coach.class);

        //use bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        //close context
        context.close();
    }
}
