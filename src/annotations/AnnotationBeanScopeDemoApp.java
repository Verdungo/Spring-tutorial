package annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext contex =
                new ClassPathXmlApplicationContext("annotations\\applicationContext.xml");

        Coach coach = contex.getBean("tennisCoach", Coach.class);
        Coach coach2 = contex.getBean("tennisCoach", Coach.class);

        System.out.println("Coaches are equal: " + (coach==coach2));

        contex.close();
    }
}
